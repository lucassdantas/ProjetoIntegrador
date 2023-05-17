/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author 42labinfo
 */
public class Entradas extends Entity{
    public Entradas(){}
    
    private float weight;
    private float cost;
    private int quantity;
    private int id_ingredient;

    public Entradas(float weight, float cost, int quantity, int id_ingredient, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.weight = weight;
        this.cost = cost;
        this.quantity = quantity;
        this.id_ingredient = id_ingredient;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(int id_ingredient) {
        this.id_ingredient = id_ingredient;
    }
    
  
    
}
