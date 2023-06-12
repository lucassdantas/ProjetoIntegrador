
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConnectionFactory.ConnectionFactory;
import models.Snack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SnackDAO {
    private final Connection connection;

    public SnackDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public List<Snack> readAll() throws SQLException {
        List<Snack> snacks = new ArrayList<>();
        String query = "SELECT * FROM snack";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Snack snack = new Snack();
                snack.setId(resultSet.getInt("snackId"));
                snack.setSnackTitle(resultSet.getString("snackTitle"));
                snack.setSnackSellingPrice(resultSet.getFloat("snackSellingPrice"));
                snack.setSnackDescription(resultSet.getString("snackDescription"));
                snack.setSnackImageUrl(resultSet.getString("snackImageUrl"));
                snack.setSnackStatus(resultSet.getString("snackStatus"));
                snacks.add(snack);
            }
        }
        return snacks;
    }
    
    public List<Snack> search(String searchTerm) throws SQLException {
        List<Snack> snacks = new ArrayList<>();
        String query = "SELECT * FROM snack WHERE snackTitle LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + searchTerm + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Snack snack = new Snack();
                    snack.setId(resultSet.getInt("snackId"));
                    snack.setSnackTitle(resultSet.getString("snackTitle"));
                    snack.setSnackSellingPrice(resultSet.getFloat("snackSellingPrice"));
                    snack.setSnackDescription(resultSet.getString("snackDescription"));
                    snack.setSnackImageUrl(resultSet.getString("snackImageUrl"));
                    snack.setSnackStatus(resultSet.getString("snackStatus"));
                    snacks.add(snack);
                }
            }
        }
        return snacks;
    }
    public Snack searchById(int id) throws SQLException {
        Snack snack = new Snack();
        String query = "SELECT * FROM snack WHERE snackId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    snack.setId(resultSet.getInt("snackId"));
                    snack.setSnackTitle(resultSet.getString("snackTitle"));
                    snack.setSnackSellingPrice(resultSet.getFloat("snackSellingPrice"));
                    snack.setSnackDescription(resultSet.getString("snackDescription"));
                    snack.setSnackImageUrl(resultSet.getString("snackImageUrl"));
                    snack.setSnackStatus(resultSet.getString("snackStatus"));
                }
            }
        }
        return snack;
    }

    public void addSnack(Snack snack) throws SQLException {
        String query = "INSERT INTO snack (snackTitle, snackSellingPrice, snackDescription, snackImageUrl, snackStatus) " +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, snack.getSnackTitle());
            statement.setFloat(2, snack.getSnackSellingPrice());
            statement.setString(3, snack.getSnackDescription());
            statement.setString(4, snack.getSnackImageUrl());
            statement.setString(5, snack.getSnackStatus());
            statement.executeUpdate();
        }
    }

    public void updateSnack(Snack snack) throws SQLException {
        String query = "UPDATE snack SET snackTitle = ?, snackSellingPrice = ?, snackDescription = ?, " +
                "snackImageUrl = ?, snackStatus = ? WHERE snackId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, snack.getSnackTitle());
            statement.setFloat(2, snack.getSnackSellingPrice());
            statement.setString(3, snack.getSnackDescription());
            statement.setString(4, snack.getSnackImageUrl());
            statement.setString(5, snack.getSnackStatus());
            statement.setInt(6, snack.getId());
            statement.executeUpdate();
        }
    }

    public void deleteSnack(int snackId) throws SQLException {
        String query = "DELETE FROM snack WHERE snackId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, snackId);
            statement.executeUpdate();
        }
    }
}
