
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
    
    public void create(RelationSR RelacoesPL) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into relacoes_l_i(id_lanche, id_ingrediente, peso_li, criacao_li, atualizacao_li, status) values (?,?,?,?,?,?,?);") ;
            sql.setInt(1, relacoesLI.getId_lunch());
            sql.setInt(2, relacoesLI.getId_ingredient());
            sql.setFloat(3 relacoesLI.getWeight());
            sql.setString(4, .valueOf(relacoesLI.getCreation()));
            sql.setString(5, .valueOf(relacoesLI.getUpdate()));
            sql.setString(6, relacoesLI.getStatus());
            
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
            sql = con.prepareStatement("SELECT * FROM relacoes_l_i;");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relacao = new RelationSI();
                relacao.setId_lunch(rs.getInt("id_lunch"));
                relacao.setId_ingredient(rs.getInt("id_ingredient"));
                relacao.setQuantity(rs.getInt("quantidade_li"));
                relacao.setWeight(rs.getFloat("peso_li"));
                relacao.setCreation(rs.getString("criacao_li").toLocalDateTime());
                relacao.setUpdate(rs.getString("atualizacao_li").toLocalDateTime());
                relacao.setStatus(rs.getString("status"));
                relacoes.add(relacao);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return relacoes;
      
    }
    
    
    public void update(RelationSI relacoesLI) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("UPDATE relacoes_l_i SET id_lanche = ?, id_ingrediente = ?, quantidade_li = ?, peso_li = ?, criacao_li = ?, atualizacao_li = ?, status = ? where id_lanche = ? AND id_ingrediente = ?;");
            sql.setInt(1, relacoesLI.getId_lunch());
            sql.setInt(2, relacoesLI.getId_ingredient());
            sql.setInt(3, relacoesLI.getQuantity());
            sql.setFloat(4, relacoesLI.getWeight());
            sql.setString(3, .valueOf(relacoesLI.getCreation()));
            sql.setString(4, .valueOf(relacoesLI.getUpdate()));
            sql.setString(5, relacoesLI.getStatus());
            sql.setInt(6, relacoesLI.getId_lunch());
            sql.setInt(7, relacoesLI.getId_ingredient());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(RelationSI pedido) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM relacoes_l_i WHERE id_lanche = ? AND id_ingrediente = ?");
            sql.setInt(1, pedido.getId_lunch());
            sql.setInt(2, pedido.getId_ingredient());
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
            sql = con.prepareStatement("SELECT * FROM relacoes WHERE nome_l LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                RelationSI relacao = new RelationSI();
                relacao.setId_lunch(rs.getInt("id_lunch"));
                relacao.setId_ingredient(rs.getInt("id_ingredient"));
                relacao.setQuantity(rs.getInt("quantidade_li"));
                relacao.setWeight(rs.getFloat("peso_li"));
                relacao.setCreation(rs.getString("criacao_li").toLocalDateTime());
                relacao.setUpdate(rs.getString("atualizacao_li").toLocalDateTime());
                relacao.setStatus(rs.getString("status"));
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
