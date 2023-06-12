
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Ingredient;

public class IngredientDAO {
    private final Connection connection;


    /**
     *
     * @throws SQLException
     */
    public IngredientDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public List<Ingredient> readAll() throws SQLException {
        List<Ingredient> ingredients = new ArrayList<>();
        String query = "SELECT * FROM ingredient";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
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
                ingredients.add(ingredient);
            }
               
        }
        return ingredients;
    }


    public List<Ingredient> search(String searchTerm) throws SQLException {
        List<Ingredient> ingredients = new ArrayList<>();
        String query = "SELECT * FROM ingredient WHERE ingredientName LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + searchTerm + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
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

                    ingredients.add(ingredient);
                }
            }
        }
        return ingredients;
    }

    public List<Ingredient> searchById(int id) throws SQLException {
        List<Ingredient> ingredients = new ArrayList<>();
        String query = "SELECT * FROM ingredient WHERE ingredientId= ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
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

                    ingredients.add(ingredient);
                }
            }
        }
        return ingredients;
    }
    
    public void addIngredient(Ingredient ingredient) throws SQLException {
        String query = "INSERT INTO ingredient (ingredientName, ingredientMinQuantity, ingredientUnitOfMeasure, " +
                "ingredientUnitCost, ingredientStatus, ingredientStock, ingredientStockStatus, ingredientUnitQuantity) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, ingredient.getIngredientName());
            statement.setFloat(2, ingredient.getIngredientMinQuantity());
            statement.setString(3, ingredient.getIngredientUnitOfMeasure());
            statement.setFloat(4, ingredient.getIngredientUnitCost());
            statement.setString(5, ingredient.getIngredientStatus());
            statement.setFloat(6, ingredient.getIngredientStock());
            statement.setString(7, ingredient.getIngredientStockStatus());
            statement.setFloat(8, ingredient.getIngredientUnitQuantity());
            statement.executeUpdate();

        }
    }
    public void addStock(Ingredient ingredient) throws SQLException {
        String query = "UPDATE ingredient SET ingredientStock = ingredientStock + ? WHERE ingredientId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setFloat(1, ingredient.getIngredientStock());
            statement.setInt(2, ingredient.getId());
            statement.executeUpdate();
        }
    }
    public void updateIngredient(Ingredient ingredient) throws SQLException {
        String query = "UPDATE ingredient SET ingredientName = ?, ingredientMinQuantity = ?, " +
                "ingredientUnitOfMeasure = ?, ingredientUnitCost = ?, ingredientStatus = ?, " +
                "ingredientStock = ?, ingredientStockStatus = ?, ingredientUnitQuantity = ? WHERE ingredientId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, ingredient.getIngredientName());
            statement.setFloat(2, ingredient.getIngredientMinQuantity());
            statement.setString(3, ingredient.getIngredientUnitOfMeasure());
            statement.setFloat(4, ingredient.getIngredientUnitCost());
            statement.setString(5, ingredient.getIngredientStatus());
            statement.setFloat(6, ingredient.getIngredientStock());
            statement.setString(7, ingredient.getIngredientStockStatus());
            statement.setFloat(8, ingredient.getIngredientUnitQuantity());
            statement.setInt(9, ingredient.getId());
            statement.executeUpdate();
        }
    }
  
    public void deleteIngredient(int ingredientId) throws SQLException {
        String query = "DELETE FROM ingredient WHERE ingredientId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, ingredientId);
            statement.executeUpdate();

        }
    }
}
