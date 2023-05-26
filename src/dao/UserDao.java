
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
    
public void create(User usuario) throws SQLException{
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement(
         "insert into usuarios (login, senha, tipo_u, nome_u, foto_u, criacao_u, atualizacao_u, status_u) values (?,?,?,?,?,?,?,?,?);") ;
            sql.setString(1, usuario.getLogin());
            sql.setString(2, usuario.getPassword());
            sql.setString(3, usuario.getType());
            sql.setString(4, usuario.getName());
            sql.setString(5, usuario.getPhoto());
            sql.setString(6, usuario.getToStringCreation());
            sql.setString(7, usuario.getToStringUpdate());
            sql.setString(8, usuario.getStatus());
            
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
        
        List<User> usuarios = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM usuario;");
            rs = sql.executeQuery();
            while(rs.next()){
                User usuario = new User();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setPassword(rs.getString("password"));
                usuario.setType(rs.getString("type_u"));
                usuario.setName(rs.getString("name_u"));
                usuario.setPhoto(rs.getString("foto_u"));
                usuario.setToLocalDateTimeCreation(rs.getString("craicao_u"));
                usuario.setToLocalDateTimeUpdate(rs.getString("atualizacao_u"));
                usuario.setStatus(rs.getString("status_u"));
                usuarios.add(usuario);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return usuarios;
    }
    
    public void update(User usuario) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        ResultSet rs = null;
        try{
            sql = con.prepareStatement("update usuarios set login = ?, senha = ?, tipo_u = ?, nome_u = ?, foto_u = ? criacao_u = ?, atualizacao_i = ?, status_i = ? where id = ?");
           
            sql.setString(1, usuario.getLogin());
            sql.setString(2, usuario.getPassword());
            sql.setString(3, usuario.getType());
            sql.setString(4, usuario.getName());
            sql.setString(5, usuario.getPhoto());
            sql.setString(6, usuario.getToStringCreation());
            sql.setString(7, usuario.getToStringUpdate());
            sql.setString(8, usuario.getStatus());
            JOptionPane.showMessageDialog(null, "Sucesso");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            ConnectionFactory.closeConnection(con,sql,rs);
        }
    }
    
    public void delete(User usuario) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement sql = null;
        
        try{
            sql = con.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?");
            sql.setInt(1, usuario.getId());
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
        
        List<User> usuarios = new ArrayList<>();
        try{
            sql = con.prepareStatement("SELECT * FROM usuarios WHERE nome LIKE ?");
            sql.setString(1, "%"+busca+"%");
            rs = sql.executeQuery();
            while(rs.next()){
               User usuario = new User();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setLogin(rs.getString("login"));
                usuario.setPassword(rs.getString("senha"));
                usuario.setType(rs.getString("tipo_u"));
                usuario.setName(rs.getString("nome_u"));
                usuario.setToLocalDateTimeCreation(rs.getString("criacao_u"));
                usuario.setToLocalDateTimeUpdate(rs.getString("atualizacao_u"));
                usuario.setStatus(rs.getString("status_u"));
                usuarios.add(usuario);
           
               
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            ConnectionFactory.closeConnection(con, sql, rs);
        }
        return usuarios; 
    }

    
}





 