
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
    
    public void create(Snack lanche) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into lanches(nome_l, custo_l, preco_l, peso_l, criacao_l, atualizacao_l, q_minima_l, status_l) values (?,?,?,?,?,?,?,?);") ;
            sql.setString(1, lanche.getName());
            sql.setFloat(2, lanche.getCost());
            sql.setFloat(3, lanche.getPrice());
            sql.setFloat(4, lanche.getWeight());
            sql.setString(5, lanche.getToStringCreation());
            sql.setString(6, lanche.getToStringUpdate());
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
    
    
    public List<Snack> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Snack> lanches = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM lanches;");
            rs = sql.executeQuery();
            while(rs.next()){
                Snack lanche = new Snack();
                lanche.setId(rs.getInt("id_lanche"));
                lanche.setName(rs.getString("nome"));
                lanche.setCost(rs.getFloat("custo_l"));
                lanche.setPrice(rs.getFloat("preco_l"));
                lanche.setWeight(rs.getFloat("peso_l"));
                lanche.setToLocalDateTimeCreation(rs.getString("criacao_l"));
                lanche.setToLocalDateTimeUpdate(rs.getString("atualizacao_l"));
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
    
    
    public void update(Snack lanche) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE lanches SET nome_l, custo_l, preco_l, peso_l, criacao_l, atualizacao_l, q_minima_l, status_l where id_lanche = ?;");
            sql.setString(1, lanche.getName());
            sql.setFloat(2, lanche.getCost());
            sql.setFloat(3, lanche.getPrice());
            sql.setFloat(4, lanche.getWeight());
            sql.setString(5, lanche.getToStringCreation());
            sql.setString(6, lanche.getToStringUpdate());
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
    
    public void delete(Snack lanche) throws SQLException{
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
    
     
    public List<Snack> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Snack> lanches = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM lanches WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Snack lanche = new Snack();
                lanche.setId(rs.getInt("id_lanche"));
                lanche.setName(rs.getString("nome"));
                lanche.setCost(rs.getFloat("custo_l"));
                lanche.setPrice(rs.getFloat("preco_l"));
                lanche.setWeight(rs.getFloat("peso_l"));
                lanche.setToLocalDateTimeCreation(rs.getString("criacao_l"));
                lanche.setToLocalDateTimeUpdate(rs.getString("atualizacao_l"));
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