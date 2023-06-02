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
public class Request extends EntityId{
    public Request(){};
    
    private String name;
    private float value;
   
    //snackTable
    private String snackName;
    private float snackCost;
    private float snackPrice;
    private float snackWeight;
    private String snackCreation;
    private String snackUpdate;
    private int snackMinQuantity;
    private int snackId;
    
    public Request(String name, float value, int id, LocalDateTime creation, LocalDateTime update, String status, int snackId) {
        super(id, creation, update, status);
        this.name = name;
        this.value = value;
        this.snackId = snackId;
        
    }

    public int getSnackId() {
        return this.snackId;
    }

    public void setSnackId(int snackid) {
        this.snackId = snackid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
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

    public float getSnackWeight() {
        return snackWeight;
    }

    public void setSnackWeight(float snackWeight) {
        this.snackWeight = snackWeight;
    }
    
    
}
