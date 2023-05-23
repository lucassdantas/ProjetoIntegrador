
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Saida;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Relacoes_p_l;



/**
 *
 * @author 42labinfo
 */
public class Saida_l {
    
    public void create(Saida saidas) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into saida(id_pedido, id_lanche, id_ingrediente, criacao_li, atualizacao_li, status) values (?,?,?,?,?,?);") ;
         sql.setInt(1, saidas.getId_task());
         sql.setInt(2, saidas.getId_lunch());
         sql.setInt(3, saidas.getId_ingredient());
         sql.setString(4, .valueOf(saidas.getCreation()));
         sql.setString(5, .valueOf(saidas.getUpdate()));
         sql.setString(6, saidas.getStatus());
            
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
    
    
    public List<Saida> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Saida> saidas = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM saida;");
            rs = sql.executeQuery();
            while(rs.next()){
                Saida saida = new Saida();
                saida.setId_lunch(rs.getInt("id_lunch"));
                saida.setId_task(rs.getInt("id_task"));
                saida.setId_ingredient(rs.getInt("id_ingredient"));
                saida.setCreation(rs.getString("criacao_li").toLocalDateTime());
                saida.setUpdate(rs.getString("atualizacao_li").toLocalDateTime());
                saida.setStatus(rs.getString("status"));
                saidas.add(saida);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return saidas;
      
    }
    
    
    public void update(Saida saidas) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE saida SET id_task =?, id_lanche = ?, id_ingrediente = ?, criacao_li = ?, atualizacao_li = ?, status = ? where id_lanche = ? AND id_ingrediente = ? AND id_pedido =?;");
            sql.setInt(1, saidas.getId_task());
            sql.setInt(2, saidas.getId_lunch());
            sql.setInt(3,saidas.getId_ingredient());
            sql.setString(4, .valueOf(saidas.getCreation()));
            sql.setString5, .valueOf(saidas.getUpdate()));
            sql.setString(6, saidas.getStatus());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Saida saidas) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM saida WHERE id_lanche = ? AND id_ingrediente = ? AND id_pedido =?;");
            sql.setInt(1, saidas.getId_lunch());
            sql.setInt(2, saidas.getId_ingredient());
            sql.setInt(3, saidas.getId_task());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Saida> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Saida> saidas = new ArrayList<>();
        try{
            sql = con.prepareStatement("select saida_i.*, ingredientes.nome from saida_i INNER JOIN ingredientes ON saida_i.id_ingrediente = ingredientes.id_ingrediente INNER JOIN pedidos ON saida_i.id_pedido = pedidos.id_pedido INNER JOIN lanches ON saida_i.id_lanche = lanches.id_lanche;"); 
            /*Corrigir, por Inner Join.  select saida_i.*, ingredientes.nome from saida_i INNER JOIN ingredientes ON saida_i.id_ingrediente = ingredientes.id_ingrediente INNER JOIN pedidos ON saida_i.id_pedido = pedidos.id_pedido INNER JOIN lanches ON saida_i.id_lanche = lanches.id_lanche;*/

            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Saida saida = new Saida();
                saida.setId_lunch(rs.getInt("id_lunch"));
                saida.setId_ingredient(rs.getInt("id_ingredient"));
                saida.setCreation(rs.getString("criacao_li").toLocalDateTime());
                saida.setUpdate(rs.getString("atualizacao_li").toLocalDateTime());
                saida.setStatus(rs.getString("status"));
                saidas.add(saida);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return saidas; 
    }

    
}

