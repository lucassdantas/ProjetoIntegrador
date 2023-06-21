/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import conexao.ConnectionFactory;
import ConnectionFactory.ConnectionFactory;
import models.Login;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import views.StockViews;
import views.TelaLogin;


/**
 *
 * @author 42labinfo
 */
public class LoginDao {
    
    private final TelaLogin view;
    private final Connection connection;
    
    public LoginDao(TelaLogin view) throws SQLException{
        this.connection = ConnectionFactory.getConnection();
        this.view = view;
    }
    
    public void create(Login usuario) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;

    try{
        sql=con.prepareStatement("insert into usuario(login,senha) values (?,?)");
        sql.setString(1,usuario.getLogin());
         sql.setString(2,usuario.getSenha());
       
        
        sql.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
        
        
    }catch(SQLException ex){
        
        JOptionPane.showMessageDialog(null,"Erro ao Cadastrar:" + ex);
        
    }finally{
        ConnectionFactory.closeConnection(con, sql);
        
    }

        }

    public List<Login> read(){
        
        return null;

    }
    
    
    
    public void update(Login login){
       
    }

    
    public void delete(Login login){
        
    }
    
    
    public List<Login> readBusca(){
        return null;
    }
    
    public void loginSistema(String login, String senha) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        String nomeUsuario = null;

        int achei = 0;
        
          try{
            
            sql = con.prepareStatement("select * from usuario");
            rs = sql.executeQuery();
          
            
           while(rs.next()){
               String user = rs.getString("login");
               String password = rs.getString("senha");
               nomeUsuario = rs.getString("login");
               
               if (login.equals(user) && senha.equals(password)){
                   
                   // caso o login e senha estejam corretos, irá executar a ação abaixo.
                   //JOptionPane.showMessageDialog(null, "Usuário e senha corretos.");
                   
                   new StockViews().setVisible(true);
                   this.view.dispose();
                   
                   achei = 1;
                   break;
               }   
               }
                   
               if(achei == 0){
                   JOptionPane.showMessageDialog(null, "Usuário ou Senha incorretos");
               }else {
            JOptionPane.showMessageDialog(null, "Olá! Seja bem-vindo, " + nomeUsuario + "."); 
               }
   
            }catch(SQLException ex){
                      JOptionPane.showMessageDialog(null,"Erro ao acessar o Banco de Dados" + ex);
        }finally{
           ConnectionFactory.closeConnection(con, sql);
        }
    }
}
    
    
    
