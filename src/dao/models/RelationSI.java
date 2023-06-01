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
public class RelationSI extends EntityMultipleId {
    public RelationSI(){};
    
    private int snackId;
    private int ingredientId;
    private int quantity;
    private float weight;
    
    
    //snackTable
    private String snackName;
    private float snackCost;
    private float snackPrice;
    private float snackWeight;
    private String snackCreation;
    private String snackUpdate;
    private int snackMinQuantity;
    
    //ingredientTable
    private String ingredientName;
    private float ingredientPrice;
    private float ingredientWeight;
    private int ingredientQuantity;
    private String ingredientType;
    private String ingredientCreation;
    private String ingredientUpdate;
    

    public RelationSI(int snackId, int ingredientId, int quantity, float weight, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation,update,status);
        this.snackId = snackId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getSnackId() {
        return this.snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public float getSnackCost() {
        return snackCost;
    }

    public void setSnackCost(float snackCost) {
        this.snackCost = snackCost;
    }

    public float getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(float snackPrice) {
        this.snackPrice = snackPrice;
    }

    public float getSnackWeight() {
        return snackWeight;
    }

    public void setSnackWeight(float snackWeight) {
        this.snackWeight = snackWeight;
    }

    public String getSnackCreation() {
        return snackCreation;
    }

    public void setSnackCreation(String snackCreation) {
        this.snackCreation = snackCreation;
    }

    public String getSnackUpdate() {
        return snackUpdate;
    }

    public void setSnackUpdate(String snackUpdate) {
        this.snackUpdate = snackUpdate;
    }

    public int getSnackMinQuantity() {
        return snackMinQuantity;
    }

    public void setSnackMinQuantity(int snackMinQuantity) {
        this.snackMinQuantity = snackMinQuantity;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
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

    public String getIngredientUpdate() {
        return ingredientUpdate;
    }

    public void setIngredientUpdate(String ingredientUpdate) {
        this.ingredientUpdate = ingredientUpdate;
    }
    
       
}