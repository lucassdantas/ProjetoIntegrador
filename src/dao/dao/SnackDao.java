
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Snack;
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
public class SnackDao {
    
    public void create(Snack snack) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into snacks(nameS, costS, priceS, weightS, creationS, updateS, minQuantityS, statusS) values (?,?,?,?,?,?,?,?);") ;
            sql.setString(1, snack.getName());
            sql.setFloat(2, snack.getCost());
            sql.setFloat(3, snack.getPrice());
            sql.setFloat(4, snack.getWeight());
            sql.setString(5, snack.getToStringCreation());
            sql.setString(6, snack.getToStringUpdate());
            sql.setInt(7, snack.getMinQuantity());
            sql.setString(8, snack.getStatus());
            
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
    
    
    public List<Snack> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Snack> snacks = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM snack;");
            rs = sql.executeQuery();
            while(rs.next()){
                Snack snack = new Snack();
                snack.setId(rs.getInt("id_snack"));
                snack.setName(rs.getString("nameS"));
                snack.setCost(rs.getFloat("costS"));
                snack.setPrice(rs.getFloat("priceS"));
                snack.setWeight(rs.getFloat("weightS"));
                snack.setToLocalDateTimeCreation(rs.getString("creationS"));
                snack.setToLocalDateTimeUpdate(rs.getString("updateS"));
                snack.setMinQuantity(rs.getInt("whitS"));
                snack.setStatus(rs.getString("statusS"));
                snacks.add(snack);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return snacks;
      
    }
    
    
    public void update(Snack snack) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE snacks SET nameS, costS, priceS, weightS, creationS, updateS, whitS, statusS where snackId = ?;");
            sql.setString(1, snack.getName());
            sql.setFloat(2, snack.getCost());
            sql.setFloat(3, snack.getPrice());
            sql.setFloat(4, snack.getWeight());
            sql.setString(5, snack.getToStringCreation());
            sql.setString(6, snack.getToStringUpdate());
            sql.setInt(7, snack.getMinQuantity());
            sql.setString(8, snack.getStatus());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Snack snack) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM snacks WHERE snackId = ?");
            sql.setInt(1, snack.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Snack> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Snack> snacks = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM snacks WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Snack snack = new Snack();
                snack.setId(rs.getInt("snackId"));
                snack.setName(rs.getString("name"));
                snack.setCost(rs.getFloat("costS"));
                snack.setPrice(rs.getFloat("priceS"));
                snack.setWeight(rs.getFloat("weightS"));
                snack.setToLocalDateTimeCreation(rs.getString("creationS"));
                snack.setToLocalDateTimeUpdate(rs.getString("updateS"));
                snack.setMinQuantity(rs.getInt("whitS"));
                snack.setStatus(rs.getString("statusS"));
                snacks.add(snack);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return snacks; 
    }

    
}