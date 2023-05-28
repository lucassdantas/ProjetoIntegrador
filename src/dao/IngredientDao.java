
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
         "insert into ingredients(nameI, priceI, weightI, quantityI, typeI, creationI, updateI, statusI) values (?,?,?,?,?,?,?,?,);") ;
            sql.setString(1, ingredient.getName());
            sql.setFloat(2, ingredient.getPrice());
            sql.setFloat(3, ingredient.getWeight());
            sql.setFloat(3, ingredient.getQuantity());
            sql.setString(4, ingredient.getType());
            sql.setString(5, (ingredient.getToStringCreation()));
            sql.setString(6, (ingredient.getToStringUpdate()));
            sql.setString(7, ingredient.getStatus());
            
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
                ingredient.setName(rs.getString("nameI"));
                ingredient.setPrice(rs.getFloat("priceI"));
                ingredient.setWeight(rs.getFloat("weightI"));
                ingredient.setQuantity(rs.getInt("quantityI"));
                ingredient.setType(rs.getString("typeI"));
                ingredient.setToLocalDateTimeCreation(rs.getString("creationI"));
                ingredient.setToLocalDateTimeUpdate(rs.getString("updateI"));
                ingredient.setStatus(rs.getString("statusI"));
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
            sql.setString(1, ingrediente.getName());
            sql.setFloat(2, ingrediente.getPrice());
            sql.setFloat(3, ingrediente.getWeight());
            sql.setInt(4, ingrediente.getQuantity());
            sql.setString(5, ingrediente.getType());
            sql.setString(6, ingrediente.getToStringCreation());
            sql.setString(7, ingrediente.getToStringUpdate());
            sql.setString(8, ingrediente.getStatus());
            sql.setString(9, ingrediente.getStatus());
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
                ingredient.setPrice(rs.getFloat("priceI"));
                ingredient.setWeight(rs.getFloat("weightI"));
                ingredient.setQuantity(rs.getInt("quantityI"));
                ingredient.setType(rs.getString("typeI"));
                ingredient.setToLocalDateTimeCreation(rs.getString("creationI"));
                ingredient.setToLocalDateTimeUpdate(rs.getString("updateI"));
                ingredient.setStatus(rs.getString("statusI"));
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
