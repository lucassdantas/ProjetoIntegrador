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
public class RelationSR extends EntityMultipleId{
    public RelationSR(){};
    
    private int requestId;
    private int snackId;
    
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
    
    public RelationSR(int requestId, int snackId, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation, update, status);
        this.requestId = requestId;
        this.snackId = snackId;
      
    }

    public int getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(int requestId){
        this.requestId = requestId;
    }
    public int getSnackId() {
        return snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
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

    public String getRequestCreation() {
        return requestCreation;
    }

    public void setRequestCreation(String requestCreation) {
        this.requestCreation = requestCreation;
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

    public int getSnackMinQuantity() {
        return snackMinQuantity;
    }

    public void setSnackMinQuantity(int snackMinQuantity) {
        this.snackMinQuantity = snackMinQuantity;
    }

    public float getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(float snackPrice) {
        this.snackPrice = snackPrice;
    }

}
