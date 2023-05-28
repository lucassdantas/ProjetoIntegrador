
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
import models.RelationSR;


//=============================================ATENÇÃO =========================================
//>>>>>>>>>> PRECISAMOS VER COMO FAZER CHAVE COMPOSTA PARA O MODEL DESSA ENTIDADE <<<<<<<<<<<<<<

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
         "insert into output (taskId, lunchId, ingredientId, creationOut, updateOut, statusOut) values (?,?,?,?,?,?);") ;
         sql.setInt(1, output.getId_task());
         sql.setInt(2, output.getId_lunch());
         sql.setInt(3, output.getId_ingredient());
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
            sql = con.prepareStatement("SELECT * FROM output;");
            rs = sql.executeQuery();
            while(rs.next()){
                Output output = new Output();
                output.setId_lunch(rs.getInt("lunchId"));
                output.setId_task(rs.getInt("taskId"));
                output.setId_ingredient(rs.getInt("ingredientId"));
                output.setCreation(rs.getString("creationOut").toLocalDateTime());
                output.setUpdate(rs.getString("updateOut").toLocalDateTime());
                output.setStatus(rs.getString("statusOut"));
                outputs.add(output);
            }
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
            sql = con.prepareStatement("UPDATE output SET taskId =?, lunchId = ?, ingredientId = ?, creationOut = ?, updateOut = ?, statusOut = ? where lunchId = ? AND ingredientId = ? AND taskId =?;");
            sql.setInt(1, outputs.getId_task());
            sql.setInt(2, outputs.getId_lunch());
            sql.setInt(3,outputs.getId_ingredient());
            sql.setString(4, .valueOf(outputs.getCreation()));
            sql.setString5, .valueOf(outputs.getUpdate()));
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
            sql = con.prepareStatement("DELETE FROM output WHERE lunchId = ? AND ingredientId = ? AND taskId =?;");
            sql.setInt(1, outputs.getId_lunch());
            sql.setInt(2, outputs.getId_ingredient());
            sql.setInt(3, outputs.getId_task());
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
            sql = con.prepareStatement("select outputI.*, ingredientes.nome from outputI INNER JOIN ingredientes ON outputI.ingredientId = ingredientes.id_ingrediente INNER JOIN tanks ON outputI.tankId = tanks.tankId INNER JOIN lunch ON outputId.lunch = lunch.lunchId;"); 
            /*Corrigir, por Inner Join.  select output_i.*, ingredientes.nome from output_i INNER JOIN ingredientes ON output_i.id_ingrediente = ingredientes.id_ingrediente INNER JOIN pedidos ON output_i.id_pedido = pedidos.id_pedido INNER JOIN lanches ON output_i.id_lanche = lanches.id_lanche;*/

            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Output output = new Output();
                output.setId_lunch(rs.getInt("lunchId"));
                output.setId_ingredient(rs.getInt("ingredientId"));
                output.setCreation(rs.getString("creationId").toLocalDateTime());
                output.setUpdate(rs.getString("updateId").toLocalDateTime());
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

