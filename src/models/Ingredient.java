/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas Dantas
 */
public class Ingredient extends EntityId{
    private String ingredientName;
    private float ingredientMinQuantity;
    private String ingredientUnitOfMeasure;
    private float ingredientUnitCost;
    private String ingredientStatus;
    private float ingredientStock;
    private String ingredientStockStatus;
    private float ingredientUnitQuantity;

    public Ingredient() {
    }

    public Ingredient( String ingredientName, float ingredientMinQuantity, String ingredientUnitOfMeasure, float ingredientUnitCost, String ingredientStatus, float ingredientStock, String ingredientStockStatus, float ingredientUnitQuantity, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.ingredientName = ingredientName;
        this.ingredientMinQuantity = ingredientMinQuantity;
        this.ingredientUnitOfMeasure = ingredientUnitOfMeasure;
        this.ingredientUnitCost = ingredientUnitCost;
        this.ingredientStatus = ingredientStatus;
        this.ingredientStock = ingredientStock;
        this.ingredientStockStatus = ingredientStockStatus;
        this.ingredientUnitQuantity = ingredientUnitQuantity;
    }

    

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public float getIngredientMinQuantity() {
        return ingredientMinQuantity;
    }

    public void setIngredientMinQuantity(float ingredientMinQuantity) {
        this.ingredientMinQuantity = ingredientMinQuantity;
    }

    public String getIngredientUnitOfMeasure() {
        return ingredientUnitOfMeasure;
    }

    public void setIngredientUnitOfMeasure(String ingredientUnitOfMeasure) {
        this.ingredientUnitOfMeasure = ingredientUnitOfMeasure;
    }

    public float getIngredientUnitCost() {
        return ingredientUnitCost;
    }

    public void setIngredientUnitCost(float ingredientUnitCost) {
        this.ingredientUnitCost = ingredientUnitCost;
    }

    public String getIngredientStatus() {
        return ingredientStatus;
    }

    public void setIngredientStatus(String ingredientStatus) {
        this.ingredientStatus = ingredientStatus;
    }

    public float getIngredientStock() {
        return ingredientStock;
    }

    public void setIngredientStock(float ingredientStock) {
        this.ingredientStock = ingredientStock;
    }

    public String getIngredientStockStatus() {
        return ingredientStockStatus;
    }

    public void setIngredientStockStatus(String ingredientStockStatus) {
        this.ingredientStockStatus = ingredientStockStatus;
    }
    
    public float getIngredientUnitQuantity(){
        return this.ingredientUnitQuantity;
    }
    
    public void setIngredientUnitQuantity(float ingredientUnitQuantity){
        this.ingredientUnitQuantity = ingredientUnitQuantity;
    }
   
    
}
