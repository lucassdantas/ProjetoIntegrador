/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Lucas Dantas
 */
import ConnectionFactory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Orders;
import models.Snack;

public class OrdersDAO {
    private final Connection connection;

    public OrdersDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public void addOrder(Orders order) throws SQLException {
        String query = "INSERT INTO orders (orderSnackId, orderQuantity, orderCost, orderUnitPrice, orderTotalPrice, orderDate) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, order.getOrderSnackId());
            statement.setInt(2, order.getOrderQuantity());
            statement.setFloat(3, order.getOrderCost());
            statement.setFloat(4, order.getOrderUnitPrice());
            statement.setFloat(5, order.getOrderTotalPrice());
            statement.setDate(6, Date.valueOf(order.getOrderDate()));
            statement.executeUpdate();
        }
    }

    public void updateOrder(Orders order) throws SQLException {
        String query = "UPDATE orders SET orderSnackId = ?, orderQuantity = ?, orderCost = ?, " +
                "orderUnitPrice = ?, orderTotalPrice = ?, orderDate = ? WHERE orderId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, order.getOrderSnackId());
            statement.setInt(2, order.getOrderQuantity());
            statement.setFloat(3, order.getOrderCost());
            statement.setFloat(4, order.getOrderUnitPrice());
            statement.setFloat(5, order.getOrderTotalPrice());
            statement.setDate(6, Date.valueOf(order.getOrderDate()));
            statement.setInt(7, order.getOrderId());
            statement.executeUpdate();
        }
    }

    public void deleteOrder(int orderId) throws SQLException {
        String query = "DELETE FROM orders WHERE orderId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, orderId);
            statement.executeUpdate();
        }
    }

    public List<Orders> search(String snackName) throws SQLException {
        List<Orders> orders = new ArrayList<>();
        String query = "SELECT o.orderId, o.orderSnackId, o.orderQuantity, o.orderCost, o.orderUnitPrice, " +
                "o.orderTotalPrice, o.orderDate, s.snackTitle, s.snackSellingPrice, s.snackDescription, s.snackImageUrl, s.snackStatus " +
                "FROM orders o INNER JOIN snack s ON o.orderSnackId = s.snackId " +
                "WHERE s.snackTitle LIKE ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "%" + snackName + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Orders order = new Orders();
                    order.setOrderId(resultSet.getInt("orderId"));
                    order.setOrderSnackId(resultSet.getInt("orderSnackId"));
                    order.setOrderQuantity(resultSet.getInt("orderQuantity"));
                    order.setOrderCost(resultSet.getFloat("orderCost"));
                    order.setOrderUnitPrice(resultSet.getFloat("orderUnitPrice"));
                    order.setOrderTotalPrice(resultSet.getFloat("orderTotalPrice"));
                    order.setOrderDate(resultSet.getDate("orderDate").toLocalDate());

                    Snack snack = new Snack();
                    snack.setId(resultSet.getInt("orderSnackId"));
                    snack.setSnackTitle(resultSet.getString("snackTitle"));
                    snack.setSnackSellingPrice(resultSet.getFloat("snackSellingPrice"));
                    snack.setSnackDescription(resultSet.getString("snackDescription"));
                    snack.setSnackImageUrl(resultSet.getString("snackImageUrl"));
                    snack.setSnackStatus(resultSet.getString("snackStatus"));

                    order.setSnack(snack);

                    orders.add(order);
                }
            }
        }
        return orders;
    }

    public List<Orders> readAll() throws SQLException {
        List<Orders> orders = new ArrayList<>();
        String query = "SELECT o.orderId, o.orderSnackId, o.orderQuantity, o.orderCost, o.orderUnitPrice, " +
                "o.orderTotalPrice, o.orderDate, s.snackTitle, s.snackSellingPrice, s.snackDescription, s.snackImageUrl, s.snackStatus " +
                "FROM orders o INNER JOIN snack s ON o.orderSnackId = s.snackId";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Orders order = new Orders();
                order.setOrderId(resultSet.getInt("orderId"));
                order.setOrderSnackId(resultSet.getInt("orderSnackId"));
                order.setOrderQuantity(resultSet.getInt("orderQuantity"));
                order.setOrderCost(resultSet.getFloat("orderCost"));
                order.setOrderUnitPrice(resultSet.getFloat("orderUnitPrice"));
                order.setOrderTotalPrice(resultSet.getFloat("orderTotalPrice"));
                order.setOrderDate(resultSet.getDate("orderDate").toLocalDate());

                Snack snack = new Snack();
                snack.setId(resultSet.getInt("orderSnackId"));
                snack.setSnackTitle(resultSet.getString("snackTitle"));
                snack.setSnackSellingPrice(resultSet.getFloat("snackSellingPrice"));
                snack.setSnackDescription(resultSet.getString("snackDescription"));
                snack.setSnackImageUrl(resultSet.getString("snackImageUrl"));
                snack.setSnackStatus(resultSet.getString("snackStatus"));

                order.setSnack(snack);

                orders.add(order);
            }
        }
        return orders;
    }
}
   
