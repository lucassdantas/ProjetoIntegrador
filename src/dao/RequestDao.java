
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Request;
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
public class RequestDao {
    
    public void create(Request pedido) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into pedidos(nome_p, valor_p, criacao_p, atualizacao_p, status_p) values (?,?,?,?,?);") ;
            sql.setString(1, pedido.getName());
            sql.setFloat(2, pedido.getValue());
            sql.setString(3, pedido.getToStringCreation());
            sql.setString(4, pedido.getToStringUpdate());
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
    
    
    public List<Request> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Request> pedidos = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM pedidos;");
            rs = sql.executeQuery();
            while(rs.next()){
                Request pedido = new Request();
                pedido.setId(rs.getInt("id_pedido"));
                pedido.setName(rs.getString("nome"));
                pedido.setValue(rs.getFloat("valor_p"));
                pedido.setToLocalDateTimeCreation(rs.getString("criacao_p"));
                pedido.setToLocalDateTimeUpdate(rs.getString("atualizacao_p"));
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
    
    
    public void update(Request pedido) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE pedidos SET nome_p, valor_p, criacao_p, atualizacao_p, status_p where id_pedido = ?;");
            sql.setString(1, pedido.getName());
            sql.setFloat(2, pedido.getValue());
            sql.setString(3, pedido.getToStringCreation());
            sql.setString(4, pedido.getToStringUpdate());
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
    
    public void delete(Request pedido) throws SQLException{
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
    
     
    public List<Request> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Request> pedidos = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM pedidos WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Request pedido = new Request();
                pedido.setId(rs.getInt("id_pedido"));
                pedido.setName(rs.getString("nome"));
                pedido.setValue(rs.getFloat("valor_p"));
                pedido.setToLocalDateTimeCreation(rs.getString("criacao_p"));
                pedido.setToLocalDateTimeUpdate(rs.getString("atualizacao_p"));
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
