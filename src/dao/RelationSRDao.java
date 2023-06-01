
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
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
public class RelationSRDao {
    
    public void create(RelationSR relationSR) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into relationSR(requestId, snackId, creationSR, updateSR, statusSR) values (?,?,?,?,?);") ;
            sql.setInt(1, relationSR.getRequestId());
            sql.setInt(2, relationSR.getSnackId());
            sql.setString(4, relationSR.getToStringCreation());
            sql.setString(5, relationSR.getToStringUpdate());
            sql.setString(6, relationSR.getStatus());
            
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
    
    
    public List<RelationSR> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<RelationSR> relations = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relationSR;");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSR relation = new RelationSR();
                relation.setRequestId(rs.getInt("requestId"));
                relation.setSnackId(rs.getInt("snackId"));
                relation.setToLocalDateTimeCreation(rs.getString("creationSR"));
                relation.setToLocalDateTimeUpdate(rs.getString("updateSR"));
                relation.setStatus(rs.getString("statusSR"));

                //requestTable
                output.setRequestName(rs.getString("nameR"));
                output.setRequestValue(rs.getFloat("valueR"));
                //output.setRequestCreation(rs.getString("creationR"));
                //output.setRequestUpdate(rs.getString("updeteR"));
                output.setStatus(rs.getString("statusR"));
                
                //sanckTable
                output.setSanckName(rs.getString("nameS"));
                output.setSanckCost(rs.getFloat("costS"));
                output.setSanckPrice(rs.getFloat("priceS"));
                output.setSancktWeight(rs.getFloat("weightS"));
                //output.setSanckCreation(rs.getString("creationS"));
                //output.setSanckUpdate(rs.getString("updeteS"));
                output.setStatus(rs.getString("statuss"));            
                output.setSanckMinQuantity(rs.getFloat("minQuantityS")); 
                
                relations.add(relation);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relations;
      
    }
    
    
    public void update(RelationSR relationSR) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE relationSR SET snackId = ?, requestId = ?, quantitySR = ?,  = ?, creationSR = ?, updateSR = ?, statusSR = ? where snackId = ? AND ingredientId = ?;");
            sql.setInt(1, relationSR.getSnackId());
            sql.setInt(2, relationSR.getRequestId());
            sql.setString(3, relationSR.getToStringCreation());
            sql.setString(4, relationSR.getToStringUpdate());
            sql.setString(5, relationSR.getStatus());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(RelationSR request) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM relationsSI WHERE snackId = ? AND ingredientId = ?");
            sql.setInt(1, request.getSnackId());
            sql.setInt(2, request.getRequestId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<RelationSR> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<RelationSR> relations = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relationsr INNER JOIN ingredient, snack WHERE namel LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSR relation = new RelationSR();
                relation.setSnackId(rs.getInt("snackId"));
                relation.setRequestId(rs.getInt("requestId"));
                relation.setToLocalDateTimeCreation(rs.getString("creationSR"));
                relation.setToLocalDateTimeUpdate(rs.getString("updateSR"));
                relation.setStatus(rs.getString("statusSR"));
                relations.add(relation);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relations; 
    }

    
}
