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
    private float ingredientPrice;
    private float ingredientWeight;
    private int ingredientQuantity;
    private String ingredientType;
    private String ingredientCreation;
    private String ingredientCpdate;
    
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

    public float getIngredientPrice() {
        return ingredientPrice;
    }

    public void setIngredientPrice(float ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }

    public float getIngredientWeight() {
        return ingredientWeight;
    }

    public void setIngredientWeight(float ingredientWeight) {
        this.ingredientWeight = ingredientWeight;
    }

    public int getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(int ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public String getIngredientCreation() {
        return ingredientCreation;
    }

    public void setIngredientCreation(String ingredientCreation) {
        this.ingredientCreation = ingredientCreation;
    }

    public String getIngredientCpdate() {
        return ingredientCpdate;
    }

    public void setIngredientCpdate(String ingredientCpdate) {
        this.ingredientCpdate = ingredientCpdate;
    }

    
      
    
}
