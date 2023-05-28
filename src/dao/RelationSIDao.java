
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

//=============================================ATENÇÃO =========================================
//>>>>>>>>>> PRECISAMOS VER COMO FAZER CHAVE COMPOSTA PARA O MODEL DESSA ENTIDADE <<<<<<<<<<<<<<

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
            sql.setInt(1, relationSI.getsnackId());
            sql.setInt(2, relationSI.getingredientId());
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
        
        List<RelationSI> relacoes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relationSI;");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relation = new RelationSI();
                relation.setsnackId(rs.getInt("snackId"));
                relation.setId_ingredient(rs.getInt("ingredientId"));
                relation.setQuantity(rs.getInt("quantitySI"));
                relation.setWeight(rs.getFloat("weightSI"));
                relation.setCreation(rs.getString("creationSI").toLocalDateTime());
                relation.setUpdate(rs.getString("updateSI").toLocalDateTime());
                relation.setStatus(rs.getString("statusSI"));
                relations.add(relation);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relacoes;
      
    }
    
    
    public void update(RelationSI relationSI) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE relationSI SET snackId = ?, ingredientId = ?, quantitySI = ?, weightSI = ?, creationSI = ?, updateSI = ?, statusSI = ? where snackId = ? AND ingredientId = ?;");
            sql.setInt(1, relationSI.getsnackId());
            sql.setInt(2, relationSI.getingredientId());
            sql.setInt(3, relationSI.getQuantity());
            sql.setFloat(4, relationSI.getWeight());
            sql.setString(3, .valueOf(relationSI.getCreation()));
            sql.setString(4, .valueOf(relationSI.getUpdate()));
            sql.setString(5, relationSI.getStatus());
            sql.setInt(6, relationSI.getsnackId());
            sql.setInt(7, relationSI.getingredientId());
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
        
        List<RelationSI> relacoes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM relations WHERE namel LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relacao = new RelationSI();
                relacao.setsnackId(rs.getInt("snackId"));
                relacao.setingredientId(rs.getInt("ingredientId"));
                relacao.setQuantity(rs.getInt("quantitySI"));
                relacao.setWeight(rs.getFloat("weightSI"));
                relacao.setCreation(rs.getString("creationSI").toLocalDateTime());
                relacao.setUpdate(rs.getString("updateSI").toLocalDateTime());
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

