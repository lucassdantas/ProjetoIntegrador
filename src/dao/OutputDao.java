
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Output;
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
public class OutputDao {
    
    public void create(Output output) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into output (requestId, snackId, ingredientId, creationOut, updateOut, statusOut) values (?,?,?,?,?,?);") ;
         sql.setInt(1, output.getRequestId());
         sql.setInt(2, output.getSnackId());
         sql.setInt(3, output.getIngredientId());
         sql.setString(4, output.getToStringCreation());
         sql.setString(5, output.getToStringUpdate());
         sql.setString(6, output.getStatus());
            
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
    
    
    public List<Output> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Output> outputs = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT output.*, ingredient.*, request.*, snack.* FROM output INNER JOIN ingredient ON output.ingredientId = ingredient.ingredientId INNER JOIN request ON output.requestId = request.requestId  INNER JOIN snack ON output.snackId = snack.snackId");
            rs = sql.executeQuery();
            while(rs.next()){
                Output output = new Output();
                output.setSnackId(rs.getInt("snackId"));
                output.setRequestId(rs.getInt("requestId"));
                output.setIngredientId(rs.getInt("ingredientId"));
                output.setToLocalDateTimeCreation(rs.getString("creationOut"));
                output.setToLocalDateTimeUpdate(rs.getString("updateOut"));
                output.setStatus(rs.getString("statusOut"));
                
                //ingredientTable
                output.setIngredientName(rs.getString("nameI"));
                output.setIngredientPrice(rs.getFloat("priceI"));
                output.setIngredientWeight(rs.getFloat("weightI"));
                output.setIngredientPrice(rs.getFloat("priceI"));
                output.setIngredientQuantity(rs.getInt("QuantityI"));
                output.setIngredientType(rs.getString("TypeI"));
                //output.setIngredientCreation(rs.getString("creationI"));
                //output.setIngredientUpdate(rs.getString("updeteI"));
                output.setStatus(rs.getString("statusI")); 
                
                //requestTable
                output.setRequestName(rs.getString("nameR"));
                output.setRequestValue(rs.getFloat("valueR"));
                //output.setRequestCreation(rs.getString("creationI"));
                //output.setRequestUpdate(rs.getString("updeteI"));
                output.setStatus(rs.getString("statusR"));
                
                //sanckTable
                output.setSanckName(rs.getString("nameS"));
                output.setCost(rs.getFloat("costI"));
                output.setIngredientPrice(rs.getFloat("priceI"));
                output.setIngredientWeight(rs.getFloat("weightI"));
                output.setSanckValue(rs.getFloat("valueR"));
                //output.setSanckCreation(rs.getString("creationI"));
                //output.setSanckUpdate(rs.getString("updeteI"));
                output.setStatus(rs.getString("statusR"));            
                
                
                
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return outputs;
      
    }
    
    
    public void update(Output outputs) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE output SET requestId = ?, snackId = ?, ingredientId = ?, creationOut = ?, updateOut = ?, statusOut = ? where snackId = ? AND ingredientId = ? AND taskId =?;");
            sql.setInt(1, outputs.getRequestId());
            sql.setInt(2, outputs.getSnackId());
            sql.setInt(3,outputs.getIngredientId());
            sql.setString(4,outputs.getToStringCreation());
            sql.setString(5, outputs.getToStringUpdate());
            sql.setString(6, outputs.getStatus());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Output outputs) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM output WHERE snackId = ? AND ingredientId = ? AND taskId =?;");
            sql.setInt(1, outputs.getSnackId());
            sql.setInt(2, outputs.getIngredientId());
            sql.setInt(3, outputs.getRequestId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Output> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Output> outputs = new ArrayList<>();
        try{
            sql = con.prepareStatement("select outputI.*, ingredientes.nome from outputI INNER JOIN ingredientes ON outputI.ingredientId = ingredientes.id_ingrediente INNER JOIN tanks ON outputI.tankId = tanks.tankId INNER JOIN snack ON outputId.snack = lunch.lunchId;"); 

            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Output output = new Output();
                output.setSnackId(rs.getInt("snackId"));
                output.setIngredientId(rs.getInt("ingredientId"));
                output.setToLocalDateTimeCreation(rs.getString("creationId"));
                output.setToLocalDateTimeUpdate(rs.getString("updateId"));
                output.setStatus(rs.getString("statusId"));
                outputs.add(output);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return outputs; 
    }

    
}

