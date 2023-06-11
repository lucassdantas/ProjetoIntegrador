/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Ingredient;
import models.User;


public class UserDAO {
    
  private final Connection connection;


    /**
     *
     * @throws SQLException
     */
    public UserDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public List<User> readAll() throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM user";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                User user = new User();

                user.setLogin(resultSet.getInt("login"));
                user.setPassword(resultSet.getString("password"));
               
               
        }
        return users;
    }
  }
        public void updateUser(User user) throws SQLException {
        String query = "UPDATE login SET password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, user.getLogin());
            statement.setString(2, user.getPassword());
          
        }
      }
    public void deleteUser(int login) throws SQLException {
        String query = "DELETE FROM login WHERE password = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, login);
            statement.executeUpdate();

        }
    }
 } 
