/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Ingredientes;
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
public class testDao {
    
    public void create(Ingredientes ingrediente) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into ingredientes(nome, preco_i, peso_i, quantidade_i, tipo_i, status_i) values (?,?,?,?,?,?);") ;
            sql.setString(1, ingrediente.getName());
            sql.setFloat(2, ingrediente.getPrice());
            sql.setFloat(3, ingrediente.getWeight());
            sql.setInt(4, ingrediente.getQuantity());
            sql.setString(5, ingrediente.getType());
         
            sql.setString(6, ingrediente.getStatus());
            
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
    
    
    public List<Ingredientes> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Ingredientes> ingredientes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM ingredientes;");
            rs = sql.executeQuery();
            while(rs.next()){
                Ingredientes ingrediente = new Ingredientes();
                ingrediente.setId(rs.getInt("id_ingrediente"));
                ingrediente.setName(rs.getString("nome"));
                ingrediente.setPrice(rs.getFloat("preco_i"));
                ingrediente.setWeight(rs.getFloat("peso_i"));
                ingrediente.setQuantity(rs.getInt("quantidade_i"));
                ingrediente.setType(rs.getString("tipo_i"));
              //  ingrediente.setCreation(rs.getTimestamp("craicao_i").toLocalDateTime());
              //  ingrediente.setUpdate(rs.getTimestamp("atualizacao_i").toLocalDateTime());
                ingrediente.setStatus(rs.getString("status_i"));
                ingredientes.add(ingrediente);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return ingredientes;
      
    }
    
    
    public void update(Ingredientes ingrediente) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update ingredientes set nome = ?, preco_i = ?, peso_i = ?, quantidade_i = ?, tipo_i = ?, status_i = ? where id = ?");
            sql.setString(1, ingrediente.getName());
            sql.setFloat(2, ingrediente.getPrice());
            sql.setFloat(3, ingrediente.getWeight());
            sql.setInt(4, ingrediente.getQuantity());
            sql.setString(5, ingrediente.getType());
         
            sql.setString(6, ingrediente.getStatus());
        
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Ingredientes ingrediente) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM ingredientes WHERE id_ingrediente = ?");
            sql.setInt(1, ingrediente.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Ingredientes> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Ingredientes> ingredientes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM ingredientes WHERE nome LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
               Ingredientes ingrediente = new Ingredientes();
                ingrediente.setId(rs.getInt("id_ingrediente"));
                ingrediente.setName(rs.getString("nome"));
                ingrediente.setPrice(rs.getFloat("preco_i"));
                ingrediente.setWeight(rs.getFloat("peso_i"));
                ingrediente.setQuantity(rs.getInt("quantidade_i"));
                ingrediente.setType(rs.getString("tipo_i"));
           
                ingrediente.setStatus(rs.getString("status_i"));
                ingredientes.add(ingrediente);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return ingredientes; 
    }
}