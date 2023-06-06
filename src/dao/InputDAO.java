
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Input;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InputDAO {
    private final Connection connection;

    public InputDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public List<Input> readAll() throws SQLException {
        List<Input> inputs = new ArrayList<>();
        String query = "SELECT * FROM input";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Input input = new Input();
                input.setInputId(resultSet.getInt("inputId"));
                input.setIngredientId(resultSet.getInt("ingredientId"));
                input.setInputQuantity(resultSet.getInt("inputQuantity"));
                input.setInputCost(resultSet.getFloat("inputCost"));
                input.setInputDate(resultSet.getDate("inputDate"));
                input.setInputStatus(resultSet.getString("inputStatus"));
                inputs.add(input);
            }
        }
        return inputs;
    }

    public List<Input> searchInputs(String searchTerm) throws SQLException {
        List<Input> inputs = new ArrayList<>();
        String query = "SELECT * FROM input WHERE ingredientId IN (SELECT ingredientId FROM ingredient WHERE ingredientName LIKE ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + searchTerm + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Input input = new Input();
                    input.setInputId(resultSet.getInt("inputId"));
                    input.setIngredientId(resultSet.getInt("ingredientId"));
                    input.setInputQuantity(resultSet.getInt("inputQuantity"));
                    input.setInputCost(resultSet.getFloat("inputCost"));
                    input.setInputDate(resultSet.getDate("inputDate"));
                    input.setInputStatus(resultSet.getString("inputStatus"));
                    inputs.add(input);
                }
            }
        }
        return inputs;
    }

    public void addInput(Input input) throws SQLException {
        String query = "INSERT INTO input (ingredientId, inputQuantity, inputCost, inputDate, inputStatus) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, input.getIngredientId());
            statement.setInt(2, input.getInputQuantity());
            statement.setFloat(3, input.getInputCost());
            statement.setDate(4, (Date) input.getInputDate());
            statement.setString(5, input.getInputStatus());
            statement.executeUpdate();
        }
    }

    public void updateInput(Input input) throws SQLException {
        String query = "UPDATE input SET ingredientId = ?, inputQuantity = ?, inputCost = ?, inputDate = ?, " +
                "inputStatus = ? WHERE inputId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, input.getIngredientId());
            statement.setInt(2, input.getInputQuantity());
            statement.setFloat(3, input.getInputCost());
            statement.setDate(4, (Date) input.getInputDate());
            statement.setString(5, input.getInputStatus());
            statement.setInt(6, input.getInputId());
            statement.executeUpdate();
        }
    }

    public void deleteInput(int inputId) throws SQLException {
        String query = "DELETE FROM input WHERE inputId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, inputId);
            statement.executeUpdate();
        }
    }
}
