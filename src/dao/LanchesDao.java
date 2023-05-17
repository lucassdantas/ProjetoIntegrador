/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import java.security.Timestamp;
import models.Lanches;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;



/**
 *
 * @author 42labinfo
 */
public class LanchesDao {
    
    public void create(Lanches lanche) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into lanches(nome_l, custo_l, preco_l, peso_l, criacao_l, atualizacao_l, q_minima_l, status_l) values (?,?,?,?,?,?,?,?);") ;
            sql.setString(1, lanche.getName());
            sql.setFloat(2, lanche.getCost());
            sql.setFloat(3, lanche.getPrice());
            sql.setFloat(4, lanche.getWeight());
            sql.setTimestamp(5, Timestamp.valueOf(lanche.getCreation()));
            sql.setTimestamp(6, Timestamp.valueOf(lanche.getUpdate()));
            sql.setInt(7, lanche.getMinQuantity());
            sql.setString(8, lanche.getStatus());
            
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
    
    
    public List<Lanches> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Lanches> lanches = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM lanches;");
            rs = sql.executeQuery();
            while(rs.next()){
                Lanches lanche = new Lanches();
                lanche.setId(rs.getInt("id_lanche"));
                lanche.setName(rs.getString("nome"));
                lanche.setCost(rs.getFloat("custo_l"));
                lanche.setPrice(rs.getFloat("preco_l"));
                lanche.setWeight(rs.getFloat("peso_l"));
                lanche.setCreation(rs.getTimestamp("criacao_l").toLocalDateTime());
                lanche.setUpdate(rs.getTimestamp("atualizacao_l").toLocalDateTime());
                lanche.setMinQuantity(rs.getInt("q_minima_l"));
                lanche.setStatus(rs.getString("status_l"));
                lanches.add(lanche);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return lanches;
      
    }
    
    
    public void update(Lanches lanche) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE lanches SET nome_l, custo_l, preco_l, peso_l, criacao_l, atualizacao_l, q_minima_l, status_l where id_lanche = ?;");
            sql.setString(1, lanche.getName());
            sql.setFloat(2, lanche.getCost());
            sql.setFloat(3, lanche.getPrice());
            sql.setFloat(4, lanche.getWeight());
            sql.setTimestamp(5, Timestamp.valueOf(lanche.getCreation()));
            sql.setTimestamp(6, Timestamp.valueOf(lanche.getUpdate()));
            sql.setInt(7, lanche.getMinQuantity());
            sql.setString(8, lanche.getStatus());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Lanches lanche) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM lanches WHERE id_lanche = ?");
            sql.setInt(1, lanche.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Lanches> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Lanches> lanches = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM lanches WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Lanches lanche = new Lanches();
                lanche.setId(rs.getInt("id_lanche"));
                lanche.setName(rs.getString("nome"));
                lanche.setCost(rs.getFloat("custo_l"));
                lanche.setPrice(rs.getFloat("preco_l"));
                lanche.setWeight(rs.getFloat("peso_l"));
                lanche.setCreation(rs.getTimestamp("criacao_l").toLocalDateTime());
                lanche.setUpdate(rs.getTimestamp("atualizacao_l").toLocalDateTime());
                lanche.setMinQuantity(rs.getInt("q_minima_l"));
                lanche.setStatus(rs.getString("status_l"));
                lanches.add(lanche);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return lanches; 
    }

    
}
