
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
            sql.setFloat(1, input.getWeight());
            sql.setFloat(2, input.getCost());
            sql.setInt(3, input.getQuantity());
            sql.setString(4, input.getToStringCreation());
            sql.setString(5, input.getToStringUpdate());
            sql.setString(6, input.getStatus());
            sql.setInt(7, input.getIngredientId());
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
                input.setWeight(rs.getFloat("weightIn"));
                input.setCost(rs.getFloat("costIn"));
                input.setQuantity(rs.getInt("quantityIn"));
                //input.setToLocalDateTimeCreation(rs.getString("creationIn"));
                //input.setToLocalDateTimeUpdate(rs.getString("updateIn"));
                input.setStatus(rs.getString("statusIn"));
                input.setIngredientId(rs.getInt("ingredientId"));
                
                //ingredientTable
                input.setIngredientName(rs.getString("nameI"));
                input.setIngredientPrice(rs.getFloat("priceI"));
                input.setIngredientWeight(rs.getFloat("weightI"));
                input.setIngredientQuantity(rs.getInt("quantityI"));
                input.setIngredientType(rs.getString("typeI"));
                //input.setIngredientCreation(rs.getString("creationI"));
                //input.setIngredientUpdate(rs.getString("updeteI"));
                input.setStatus(rs.getString("statusI"));                
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
            sql.setFloat(1, input.getWeight());
            sql.setFloat(2, input.getCost());
            sql.setInt(3, input.getQuantity());
            sql.setString(4, input.getToStringCreation());
            sql.setString(5, input.getToStringUpdate());
            sql.setString(7, input.getStatus());
            sql.setInt(8, input.getIngredientId());
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
                input.setWeight(rs.getFloat("weightI"));
                input.setCost(rs.getFloat("costI"));
                input.setQuantity(rs.getInt("quantityId"));
                input.setToLocalDateTimeCreation(rs.getString("creationI"));
                input.setToLocalDateTimeUpdate(rs.getString("updateI"));
                input.setStatus(rs.getString("statusI"));
                input.setIngredientId(rs.getInt("ingredient"));
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
