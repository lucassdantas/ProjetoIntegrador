/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Lucas Dantas
 */
public class Orders {
    private int orderId;
    private int orderSnackId;
    private int orderQuantity;
    private float orderCost;
    private float orderUnitPrice;
    private float orderTotalPrice;
    private Date orderDate;
    private Snack snack;
    
    public Orders(){};
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderSnackId() {
        return orderSnackId;
    }

    public void setOrderSnackId(int orderSnackId) {
        this.orderSnackId = orderSnackId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public float getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }

    public float getOrderUnitPrice() {
        return orderUnitPrice;
    }

    public void setOrderUnitPrice(float orderUnitPrice) {
        this.orderUnitPrice = orderUnitPrice;
    }

    public float getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(float orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }
}

