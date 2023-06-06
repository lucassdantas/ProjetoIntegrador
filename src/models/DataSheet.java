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
public class DataSheet extends EntityMultipleId {
    private int dsSnackId;
    private int dsIngredientId;
    private int dsQuantity;
    private float dsTotalCost;
    private String dsStatus;
    
    private Snack snack;
    private Ingredient ingredient;

    public int getDsSnackId() {
        return dsSnackId;
    }

    public void setDsSnackId(int dsSnackId) {
        this.dsSnackId = dsSnackId;
    }

    public int getDsIngredientId() {
        return dsIngredientId;
    }

    public void setDsIngredientId(int dsIngredientId) {
        this.dsIngredientId = dsIngredientId;
    }

    public int getDsQuantity() {
        return dsQuantity;
    }

    public void setDsQuantity(int dsQuantity) {
        this.dsQuantity = dsQuantity;
    }

    public float getDsTotalCost() {
        return dsTotalCost;
    }

    public void setDsTotalCost(float dsTotalCost) {
        this.dsTotalCost = dsTotalCost;
    }

    public String getDsStatus() {
        return dsStatus;
    }

    public void setDsStatus(String dsStatus) {
        this.dsStatus = dsStatus;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}

