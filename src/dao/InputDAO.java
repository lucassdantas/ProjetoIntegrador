
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Input;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import models.Ingredient;

public class InputDAO {
    private final Connection connection;

    public InputDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public List<Input> readAll() throws SQLException {
        List<Input> inputs = new ArrayList<>();
        String query = "SELECT input.*, ingredient.* FROM input INNER JOIN ingredient ON input.inputIngredientId = ingredient.ingredientId ";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Input input = new Input();
                input.setId(resultSet.getInt("inputId"));
                input.setIngredientId(resultSet.getInt("ingredientId"));
                input.setInputQuantity(resultSet.getFloat("inputQuantity"));
                input.setInputCost(resultSet.getFloat("inputCost"));
                input.setInputDate((resultSet.getDate("inputDate")).toLocalDate());
                input.setInputStatus(resultSet.getString("inputStatus"));
                
                Ingredient ingredient = new Ingredient();
                ingredient.setId(resultSet.getInt("ingredientId"));
                ingredient.setIngredientName(resultSet.getString("ingredientName"));
                ingredient.setIngredientMinQuantity(resultSet.getFloat("ingredientMinQuantity"));
                ingredient.setIngredientUnitOfMeasure(resultSet.getString("ingredientUnitOfMeasure"));
                ingredient.setIngredientUnitCost(resultSet.getFloat("ingredientUnitCost"));
                ingredient.setIngredientStatus(resultSet.getString("ingredientStatus"));
                ingredient.setIngredientStock(resultSet.getFloat("ingredientStock"));
                ingredient.setIngredientStockStatus(resultSet.getString("ingredientStockStatus"));
                ingredient.setIngredientUnitQuantity(resultSet.getFloat("ingredientUnitQuantity"));
                
                input.setIngredient(ingredient);
                inputs.add(input);
            }
        }
        return inputs;
    }

    public List<Input> search(String searchTerm) throws SQLException {
        List<Input> inputs = new ArrayList<>();
        String query = "SELECT input.*, ingredient.* FROM input INNER JOIN ingredient ON input.inputIngredientId = ingredient.ingredientId WHERE ingredient.ingredientName LIKE ? ";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + searchTerm + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Input input = new Input();
                    input.setId(resultSet.getInt("inputId"));
                    input.setIngredientId(resultSet.getInt("ingredientId"));
                    input.setInputQuantity(resultSet.getFloat("inputQuantity"));
                    input.setInputCost(resultSet.getFloat("inputCost"));
                    input.setInputDate(resultSet.getDate("inputDate").toLocalDate());
                    input.setInputStatus(resultSet.getString("inputStatus"));
                    
                    Ingredient ingredient = new Ingredient();
                    ingredient.setId(resultSet.getInt("ingredientId"));
                    ingredient.setIngredientName(resultSet.getString("ingredientName"));
                    ingredient.setIngredientMinQuantity(resultSet.getFloat("ingredientMinQuantity"));
                    ingredient.setIngredientUnitOfMeasure(resultSet.getString("ingredientUnitOfMeasure"));
                    ingredient.setIngredientUnitCost(resultSet.getFloat("ingredientUnitCost"));
                    ingredient.setIngredientStatus(resultSet.getString("ingredientStatus"));
                    ingredient.setIngredientStock(resultSet.getFloat("ingredientStock"));
                    ingredient.setIngredientStockStatus(resultSet.getString("ingredientStockStatus"));
                    ingredient.setIngredientUnitQuantity(resultSet.getFloat("ingredientUnitQuantity"));

                    input.setIngredient(ingredient);
                    inputs.add(input);
                }
            }
        }
        return inputs;
    }

    public void addInput(Input input) throws SQLException, ParseException {
        String query = "INSERT INTO input (inputIngredientId, inputQuantity, inputCost, inputDate, inputStatus) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, input.getIngredient().getId());
            statement.setFloat(2, input.getInputQuantity());
            statement.setFloat(3, input.getInputCost());
            statement.setDate(4, Date.valueOf(input.getInputDate()));
            statement.setString(5, input.getInputStatus());
            statement.executeUpdate();
        }
    }

    public void updateInput(Input input) throws SQLException {
        String query = "UPDATE input SET inputIngredientId = ?, inputQuantity = ?, inputCost = ?, inputDate = ?, " +
                "inputStatus = ? WHERE inputId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, input.getIngredient().getId());
            statement.setFloat(2, input.getInputQuantity());
            statement.setFloat(3, input.getInputCost());
            statement.setDate(4, Date.valueOf( input.getInputDate()));
            statement.setString(5, input.getInputStatus());
            statement.setInt(6, input.getId());
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
    public void deleteByIngredientId(int id) throws SQLException {
        String query = "DELETE FROM input WHERE inputIngredientId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
