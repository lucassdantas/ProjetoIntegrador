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
public class Lanches extends Entity{
    public Lanches(){}
    
    private String name;
    private float cost;
    private float price;
    private float weight;
    private int minQuantity;
    private String type;

    public Lanches(String name, float cost, float price, float weight, int minQuantity, String type, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.weight = weight;
        this.minQuantity = minQuantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
