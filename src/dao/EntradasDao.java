/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Entradas;
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
public class EntradasDao {
    
    public void create(Entradas entrada) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into cliente(peso_e, custo_e, quantidade_e, criacao_e, atualizacao_e, status_e, id_ingrediente) values (?,?,?,?,?,?,?)") ;
            sql.setFloat(1, entrada.getWeight());
            sql.setFloat(2, entrada.getCost());
            sql.setInt(3, entrada.getQuantity());
            sql.setTimestamp(4, entrada.getCreation());
            sql.executeUpdate();
            
            JOptionPane.showMessageDialog(
                    null, "Cadastrado com sucesso!");
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(
                   null, "Erro ao Cadastrar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, sql);
        }
        
    }
    
    
    public List<Cliente> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM cliente");
            rs = sql.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setRg(rs.getString("rg"));
                c.setCpf(rs.getString("cpf"));
                c.setCep(rs.getString("cep"));
                c.setEndereco(rs.getString("endereco"));
                clientes.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return clientes;
      
    }
    
    
    public void update(Cliente c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update cliente set nome = ?, telefone = ?, email = ?, rg = ?, cpf = ?, cep = ?, endereco = ? where id = ?");
            sql.setString(1, c.getNome());
            sql.setString(2, c.getTelefone());
            sql.setString(3, c.getEmail());
            sql.setString(4, c.getRg());
            sql.setString(5, c.getCpf());
            sql.setString(6, c.getCep());
            sql.setString(7, c.getEndereco());            
            sql.setInt(8, c.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(Cliente c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM cliente WHERE id = ?");
            sql.setInt(1, c.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<Cliente> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                c.setEmail(rs.getString("email"));
                c.setRg(rs.getString("rg"));
                c.setCpf(rs.getString("cpf"));
                c.setCep(rs.getString("cep"));
                c.setEndereco(rs.getString("endereco"));
                clientes.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return clientes; 
    }

    
}
