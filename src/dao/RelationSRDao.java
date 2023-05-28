
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
         "insert into relationSR(snackId, ingredientId, weightSR, creationSR, updateSR, statusSR) values (?,?,?,?,?,?,?);") ;
            sql.setInt(1, relationSR.getsnackId());
            sql.setInt(2, relationSR.getingredientId());
            sql.setFloat(3 relationSR.getWeight());
            sql.setString(4, .valueOf(relationSR.getCreation()));
            sql.setString(5, .valueOf(relationSR.getUpdate()));
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
                RelationSR relation= new RelationSR();
                relations.setsnackId(rs.getInt("snackId"));
                relations.setingredientId(rs.getInt("ingredientId"));
                relations.setQuantity(rs.getInt("quantitySR"));
                relations.setWeight(rs.getFloat("weightSR"));
                relations.setCreation(rs.getString("creationSR").toLocalDateTime());
                relations.setUpdate(rs.getString("updateSR").toLocalDateTime());
                relations.setStatus(rs.getString("statusSR"));
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
            sql = con.prepareStatement("UPDATE relationSR SET snackId = ?, ingredientId = ?, quantitySR = ?,  = ?, creationSR = ?, updateSR = ?, statusSR = ? where snackId = ? AND ingredientId = ?;");
            sql.setInt(1, relationSR.getsnackId());
            sql.setInt(2, relationSR.getingredientId());
            sql.setInt(3, relationSR.getQuantity());
            sql.setFloat(4, relationSR.getWeight());
            sql.setString(3, .valueOf(relationSR.getCreation()));
            sql.setString(4, .valueOf(relationSR.getUpdate()));
            sql.setString(5, relationSR.getStatus());
            sql.setInt(6, relationSR.getsnack());
            sql.setInt(7, relationSR.getingredientId());
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
            sql.setInt(1, request.getsnackId());
            sql.setInt(2, request.getingredientId());
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
        
        List<RelationSI> relations = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relations WHERE namel LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relation = new RelationSI();
                relation.setsnackId(rs.getInt("snackId"));
                relation.setingredientId(rs.getInt("ingredientId"));
                relation.setQuantity(rs.getInt("quantitySR"));
                relation.setWeight(rs.getFloat("weightSR"));
                relation.setCreation(rs.getString("creationSR").toLocalDateTime());
                relation.setUpdate(rs.getString("updateSR").toLocalDateTime());
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
