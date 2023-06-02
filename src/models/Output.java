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
public class Output extends EntityMultipleId{
   public Output(){};
    
    private int requestId;
    private int snackId;
    private int ingredientId;
    
    //ingredientTable
    private String ingredientName;
    private float ingredientPrice;
    private float ingredientWeight;
    private int ingredientQuantity;
    private String ingredientType;
    private String ingredientCreation;
    private String ingredientUpdate;
    
    //requestTable
    private String requestName;
    private float requestValue;  
    private String requestCreation;
    private String requestUpdate;
    
    //snackTable
    private String snackName;
    private float snackCost;
    private float snackPrice;
    private float snackWeight;
    private String snackCreation;
    private String snackUpdate;
    private int snackMinQuantity;
       
    
    public Output(int requestId, int snackId, int ingredientId, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation, update, status);
        this.requestId = requestId;
        this.snackId = snackId;
        this.ingredientId = ingredientId;

    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getSnackId() {
        return snackId;
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

    public String getIngredientType() {
        return ingredientType;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public String getIngredientUpdate() {
        return ingredientUpdate;
    }

    public void setIngredientUpdate(String ingredientUpdate) {
        this.ingredientUpdate = ingredientUpdate;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public float getRequestValue() {
        return requestValue;
    }

    public void setRequestValue(float requestValue) {
        this.requestValue = requestValue;
    }

    public String getRequestUpdate() {
        return requestUpdate;
    }

    public void setRequestUpdate(String requestUpdate) {
        this.requestUpdate = requestUpdate;
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

    public int getsnackMinQuantity() {
        return snackMinQuantity;
    }

    public void setsnackMinQuantity(int snackMinQuantity) {
        this.snackMinQuantity = snackMinQuantity;
    }

    public int getIngredientQuantity() {
        return ingredientQuantity;
    }

    public void setIngredientQuantity(int ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public String getIngredientCreation() {
        return ingredientCreation;
    }

    public void setIngredientCreation(String ingredientCreation) {
        this.ingredientCreation = ingredientCreation;
    }

    public String getRequestCreation() {
        return requestCreation;
    }

    public void setRequestCreation(String requestCreation) {
        this.requestCreation = requestCreation;
    }

    public float getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(float snackPrice) {
        this.snackPrice = snackPrice;
    }
    
    
    
    
}
