
package dao;


import ConnectionFactory.ConnectionFactory;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.User;
public class UserDao {
    
public void create(User user) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into users (login, password, type, nameU, photoU, creationU, updateU, statusU) values (?,?,?,?,?,?,?,?,?);") ;
            sql.setString(1, user.getLogin());
            sql.setString(2, user.getPassword());
            sql.setString(3, user.getType());
            sql.setString(4, user.getName());
            sql.setString(5, user.getPhoto());
            sql.setString(6, user.getToStringCreation());
            sql.setString(7, user.getToStringUpdate());
            sql.setString(8, user.getStatus());
            
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
    
    
    public List<User> read() throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<User> users = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM user;");
            rs = sql.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("userId"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setType(rs.getString("typeU"));
                user.setName(rs.getString("nameU"));
                user.setPhoto(rs.getString("photoU"));
                user.setToLocalDateTimeCreation(rs.getString("creationU"));
                user.setToLocalDateTimeUpdate(rs.getString("updateU"));
                user.setStatus(rs.getString("statusU"));
                users.add(user);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return users;
    }
    
    public void update(User user) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update users set login = ?, password = ?, typeU = ?, nameU = ?, photoU = ? creationU = ?, updateU = ?, statusU = ? where id = ?");
           
            sql.setString(1, user.getLogin());
            sql.setString(2, user.getPassword());
            sql.setString(3, user.getType());
            sql.setString(4, user.getName());
            sql.setString(5, user.getPhoto());
            sql.setString(6, user.getToStringCreation());
            sql.setString(7, user.getToStringUpdate());
            sql.setString(8, user.getStatus());
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(User user) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM users WHERE userId = ?");
            sql.setInt(1, user.getId());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql);
        }
    }
    
     
    public List<User> readBusca(String busca) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        
        List<User> users = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM users WHERE nome LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
               User user = new User();
                user.setId(rs.getInt("userId"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setType(rs.getString("typeU"));
                user.setName(rs.getString("nameU"));
                user.setToLocalDateTimeCreation(rs.getString("creationU"));
                user.setToLocalDateTimeUpdate(rs.getString("updateU"));
                user.setStatus(rs.getString("statusU"));
                users.add(user);
           
               
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return users; 
    }

    
}





 