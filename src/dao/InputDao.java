
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Input;
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
public class InputDao {
    
    public void create(Input input) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into inputs(weightI, costI, quantityI, creationI, updateI, statusI, ingredientId) values (?,?,?,?,?,?,?)") ;
            sql.setInt(1, input.getInputQuantity());
            sql.setFloat(2, input.getInputCost());
            sql.setDate(3, input.getInputDate());
            sql.setString(4, input.getInputStatus());
            
            sql.setInt(5, input.getIngredientId());
            
            
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
    
    
    public List<Input> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Input> inputs = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT input.*, ingredient.* FROM input INNER JOIN ingredient ON input.ingredientId = ingredient.ingredientId");
            rs = sql.executeQuery();
            while(rs.next()){
                Input input = new Input();
                input.setId(rs.getInt("inputId"));
                input.setIngredientId(rs.getInt("ingredientId"));
                input.setInputQuantity(rs.getInt("costIn"));
                input.setInputCost(rs.getFloat("InputCost"));
                input.setInputDate(rs.getDate("InputDate"));
                input.setInputStatus(rs.getString("InputStatus"));
           
                
                   
                inputs.add(input);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return inputs;
      
    }
    
    
    public void update(Input input) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update inputs set weightI = ?, custI = ?, quantityI = ?, creationI = ?, updateI = ?, statusI = ?, ingredientId = ? where id = ?");
            sql.setInt(1, input.getInputQuantity());
            sql.setFloat(2, input.getInputCost());
            sql.setDate(3, input.getInputDate());
            sql.setString(3, input.getInputStatus());
          
            sql.setInt(4, input.getIngredientId());
          
            
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        
          
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Input inputs) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM inputs WHERE id = ?");
            sql.setInt(1, inputs.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Input> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Input> inputs = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT input.*, ingredients.nameI FROM snack INNER JOIN ingredients ON input.ingredientId = ingredients.ingredientId WHERE ingredients.nameI LIKE ?;");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
               Input input = new Input();
                input.setId(rs.getInt("inputId"));
               input.setInputQuantity(rs.getInt("InputQuantity"));
                input.setInputCost(rs.getFloat("InputCost"));
                input.setInputDate(rs.getDate("InputDate"));
                input.setInputStatus(rs.getString("InputStatus"));
                input.setStatus(rs.getString("statusI"));
                input.setIngredientId(rs.getInt("ingredientId"));
                inputs.add(input);
           
               
            
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return inputs; 
    }

}
