/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import java.security.Timestamp;
import models.Pedidos;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author 42labinfo
 */
public class PedidosDao {
    
    public void create(Pedidos pedido) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into pedidos(nome_p, valor_p, criacao_p, atualizacao_p, status_p) values (?,?,?,?,?);") ;
            sql.setString(1, pedido.getName());
            sql.setFloat(2, pedido.getValue());
            sql.setTimestamp(3, Timestamp.valueOf(pedido.getCreation()));
            sql.setTimestamp(4, Timestamp.valueOf(pedido.getUpdate()));
            sql.setString(5, pedido.getStatus());
            
            sql.executeUpdate();
            
            JOptionPane.showMessageDialog(
                    null, "Cadasdtrado com sucesso!");
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(
                   null, "Erro ao Cadastrar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, sql);
        }
        
    }
    
    
    public List<Pedidos> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Pedidos> pedidos = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM pedidos;");
            rs = sql.executeQuery();
            while(rs.next()){
                Pedidos pedido = new Pedidos();
                pedido.setId(rs.getInt("id_pedido"));
                pedido.setName(rs.getString("nome"));
                pedido.setValue(rs.getFloat("valor_p"));
                pedido.setCreation(rs.getTimestamp("criacao_p").toLocalDateTime());
                pedido.setUpdate(rs.getTimestamp("atualizacao_p").toLocalDateTime());
                pedido.setStatus(rs.getString("status_p"));
                pedidos.add(pedido);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return pedidos;
      
    }
    
    
    public void update(Pedidos pedido) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE pedidos SET nome_p, valor_p, criacao_p, atualizacao_p, status_p where id_pedido = ?;");
            sql.setString(1, pedido.getName());
            sql.setFloat(2, pedido.getValue());
            sql.setTimestamp(3, Timestamp.valueOf(pedido.getCreation()));
            sql.setTimestamp(4, Timestamp.valueOf(pedido.getUpdate()));
            sql.setString(5, pedido.getStatus());
            sql.setInt(6, pedido.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Pedidos pedido) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM pedidos WHERE id_pedido = ?");
            sql.setInt(1, pedido.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Pedidos> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Pedidos> pedidos = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM pedidos WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Pedidos pedido = new Pedidos();
                pedido.setId(rs.getInt("id_pedido"));
                pedido.setName(rs.getString("nome"));
                pedido.setValue(rs.getFloat("valor_p"));
                pedido.setCreation(rs.getTimestamp("criacao_p").toLocalDateTime());
                pedido.setUpdate(rs.getTimestamp("atualizacao_p").toLocalDateTime());
                pedido.setStatus(rs.getString("status_p"));
                pedidos.add(pedido);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return pedidos; 
    }

    
}
