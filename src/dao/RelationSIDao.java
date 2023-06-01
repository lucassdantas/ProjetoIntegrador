
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.RelationSI;
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
public class RelationSIDao {
    
    public void create(RelationSI relationSI) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into relationSI(snackId, ingredientId, quantitySI, weightSI, creationSI, updateSI, statusSI) values (?,?,?,?,?,?,?);") ;
            sql.setInt(1, relationSI.getSnackId());
            sql.setInt(2, relationSI.getIngredientId());
            sql.setInt(3, relationSI.getQuantity());
            sql.setFloat(4, relationSI.getWeight());
            sql.setString(3, relationSI.getToStringCreation());
            sql.setString(4, relationSI.getToStringUpdate());
            sql.setString(5, relationSI.getStatus());
            
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
    
    
    public List<RelationSI> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<RelationSI> relations = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relationSI;");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relation = new RelationSI();
                relation.setSnackId(rs.getInt("snackId"));
                relation.setIngredientId(rs.getInt("ingredientId"));
                relation.setQuantity(rs.getInt("quantitySI"));
                relation.setWeight(rs.getFloat("weightSI"));
                relation.setToLocalDateTimeCreation(rs.getString("creationSI"));
                relation.setToLocalDateTimeUpdate(rs.getString("updateSI"));
                relation.setStatus(rs.getString("statusSI"));

                 //ingredientTable
                relation.setIngredientName(rs.getString("nameI"));
                relation.setIngredientPrice(rs.getFloat("priceI"));
                relation.setIngredientWeight(rs.getFloat("weightI"));
                relation.setIngredientQuantity(rs.getInt("quantityI"));
                relation.setIngredientType(rs.getString("typeI"));
                //relation.setIngredientCreation(rs.getString("creationI"));
                //relation.setIngredientUpdate(rs.getString("updeteI"));
                relation.setStatus(rs.getString("statusI"));

                //sanckTable
                relation.setSanckName(rs.getString("nameS"));
                relation.setSanckCost(rs.getFloat("costS"));
                relation.setSanckPrice(rs.getFloat("priceS"));
                relation.setSancktWeight(rs.getFloat("weightS"));
                //relation.setSanckCreation(rs.getString("creationS"));
                //relation.setSanckUpdate(rs.getString("updeteS"));
                relation.setStatus(rs.getString("statuss"));            
                relation.setSanckMinQuantity(rs.getFloat("minQuantityS"));

                relations.add(relation);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relations;
      
    }
    
    
    public void update(RelationSI relationSI) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE relationSI SET snackId = ?, ingredientId = ?, quantitySI = ?, weightSI = ?, creationSI = ?, updateSI = ?, statusSI = ? where snackId = ? AND ingredientId = ?;");
            sql.setInt(1, relationSI.getSnackId());
            sql.setInt(2, relationSI.getIngredientId());
            sql.setInt(3, relationSI.getQuantity());
            sql.setFloat(4, relationSI.getWeight());
            sql.setString(3, relationSI.getToStringCreation());
            sql.setString(4, relationSI.getToStringUpdate());
            sql.setString(5, relationSI.getStatus());
            sql.setInt(6, relationSI.getSnackId());
            sql.setInt(7, relationSI.getIngredientId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(RelationSI request) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM relationSI WHERE snackId = ? AND ingredientId = ?");
            sql.setInt(1, request.getSnackId());
            sql.setInt(2, request.getIngredientId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<RelationSI> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<RelationSI> relacoes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relations WHERE namel LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relacao = new RelationSI();
                relacao.setSnackId(rs.getInt("snackId"));
                relacao.setIngredientId(rs.getInt("ingredientId"));
                relacao.setQuantity(rs.getInt("quantitySI"));
                relacao.setWeight(rs.getFloat("weightSI"));
                relacao.setToLocalDateTimeCreation(rs.getString("creationSI"));
                relacao.setToLocalDateTimeUpdate(rs.getString("updateSI"));
                relacao.setStatus(rs.getString("statusSI"));
                relacoes.add(relacao);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relacoes; 
    }

    
}

