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
public class RelationSI extends Entity {
    public RelationSI(){};
    
    private int snackId;
    private int ingredientId;
    private int quantity;
    private float weight;
    private LocalDateTime creation;
    private LocalDateTime update;
    private String status;

    public RelationSI(int snackId, int ingredientId, int quantity, float weight, LocalDateTime creation, LocalDateTime update, String status) {
        this.snackId = snackId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
        this.weight = weight;
        this.creation = creation;
        this.update = update;
        this.status = status;
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

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
