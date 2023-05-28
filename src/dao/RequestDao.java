
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Request;
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
public class RequestDao {
    
    public void create(Request request) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into s(nameR, valueR, creationR, updateR, statusR) values (?,?,?,?,?);") ;
            sql.setString(1, request.getName());
            sql.setFloat(2, request.getValue());
            sql.setString(3, request.getToStringCreation());
            sql.setString(4, request.getToStringUpdate());
            sql.setString(5, request.getStatus());
            
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
    
    
    public List<Request> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Request> s = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM requests;");
            rs = sql.executeQuery();
            while(rs.next()){
                Request request = new Request();
                request.setId(rs.getInt("requestId"));
                request.setName(rs.getString("nameR"));
                request.setValue(rs.getFloat("valueR"));
                request.setToLocalDateTimeCreation(rs.getString("creationR"));
                request.setToLocalDateTimeUpdate(rs.getString("updateR"));
                request.setStatus(rs.getString("statusR"));
                requests.add(request);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return requests;
      
    }
    
    
    public void update(Request resquest) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE resquests SET nameR, valueR, creationR, upadateR, statusR where resquestId = ?;");
            sql.setString(1, resquest.getName());
            sql.setFloat(2, resquest.getValue());
            sql.setString(3, resquest.getToStringCreation());
            sql.setString(4, resquest.getToStringUpdate());
            sql.setString(5, resquest.getStatus());
            sql.setInt(6, resquest.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Request request) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM requests WHERE requestId = ?");
            sql.setInt(1, request.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Request> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Request> requestR = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM request WHERE namel LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Request request = new Request();
                request.setId(rs.getInt("requestId"));
                request.setName(rs.getString("nameR"));
                request.setValue(rs.getFloat("valueR"));
                request.setToLocalDateTimeCreation(rs.getString("creationR"));
                request.setToLocalDateTimeUpdate(rs.getString("updateR"));
                request.setStatus(rs.getString("statusR"));
                requests.add(request);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return requests; 
    }

    
}
