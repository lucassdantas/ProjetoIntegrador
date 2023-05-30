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
public class Input extends EntityId{
    public Input(){}
    
    private float weight;
    private float cost;
    private int quantity;
    private int ingredientId;

    //ingredientTable
    private String ingredientName;

    public Input(float weight, float cost, int quantity, int ingredientId, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.weight = weight;
        this.cost = cost;
        this.quantity = quantity;
        this.ingredientId = ingredientId;
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

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
    
    public void setIngredientName(String ingredientName){
        this.ingredientName = ingredientName;
    }
    
    public String getIngredientName(){
        return this.ingredientName;
    }
}
