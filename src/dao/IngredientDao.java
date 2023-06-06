
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Ingredient;
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
public class IngredientDao {
    
    public void create(Ingredient ingredient) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into ingredients(name, prce, weght, quantty, type, creaton, update, status) values (?,?,?,?,?,?,?,?,);") ;
            sql.setString(1, ingredient.getIngredientName());
            sql.setFloat(2, ingredient.getIngredientMinQuantity());
            sql.setString(3, ingredient.getIngredientUnitOfMeasure());
            sql.setFloat(3, ingredient.getIngredientUnitCost());
            sql.setString(4, ingredient.getIngredientStatus());
            sql.setFloat(5, (ingredient.getIngredientStock()));
            sql.setString(6, (ingredient.getIngredientStockStatus()));
            
    
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
    
    
    public List<Ingredient> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Ingredient> ingredients = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM ingredients;");
            rs = sql.executeQuery();
            while(rs.next()){
                Ingredient ingredient = new Ingredient();
                ingredient.setId(rs.getInt("ingredientId"));
                ingredient.setIngredientName(rs.getString("IngredientName"));
                ingredient.setIngredientMinQuantity(rs.getFloat("IngredientMinQuantity"));
                ingredient.setIngredientUnitOfMeasure(rs.getString("IngredientUnitOfMeasure"));
                ingredient.setIngredientUnitCost(rs.getFloat("ingredientUnitCost"));
                ingredient.setIngredientStatus(rs.getString("ingredientStatus"));
                ingredient.setIngredientStock(rs.getFloat("ingredientStock"));
                ingredient.setIngredientStockStatus(rs.getString("ingredientStockStatus"));
                
                ingredients.add(ingredient);
            } 
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return ingredients;
      
    }
    
    
    public void update(Ingredient ingrediente) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update ingredientes set nome = ?, preco_i = ?, peso_i = ?, quantidade_i = ?, tipo_i = ? criacao_i = ?, atualizacao_i = ?, status_i = ? where id = ?");
            sql.setString(1, ingrediente.getIngredientName());
            sql.setFloat(2, ingrediente.getIngredientMinQuantity());
            sql.setString(3, ingrediente.getIngredientUnitOfMeasure());
            sql.setFloat(4, ingrediente.getIngredientUnitCost());
            sql.setString(5, ingrediente.getIngredientStatus());
            sql.setFloat(6, ingrediente.getIngredientStock());
            sql.setString(7, ingrediente.getIngredientStockStatus());
           
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Ingredient ingredient) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM ingredients WHERE ingredienteI = ?");
            sql.setInt(1, ingredient.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Ingredient> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Ingredient> ingredients = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM ingredientes WHERE nome LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
               Ingredient ingredient = new Ingredient();
                ingredient.setId(rs.getInt("ingredientId"));
                ingredient.setIngredientName(rs.getString("IngredientName"));
                ingredient.setIngredientMinQuantity(rs.getFloat("IngredientMinQuantity"));
                ingredient.setIngredientUnitOfMeasure(rs.getString("ingredientUnitOfMeasure"));
                ingredient.setIngredientUnitCost(rs.getFloat("ingredientUnitCost"));
                ingredient.setIngredientStatus(rs.getString("ingredientStatus"));
                ingredient.setIngredientStock(rs.getFloat(" ingredientStock"));
                ingredient.setIngredientStockStatus(rs.getString("ingredientStockStatus"));
                ingredients.add(ingredient);
           
 
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return ingredients; 
    }

    
}
