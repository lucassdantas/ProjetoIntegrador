/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Lucas Dantas
 */
public class Input extends EntityId{
    private int inputId;
    private int ingredientId;
    private float inputQuantity;
    private float inputCost;
    private Date inputDate;
    private String inputStatus;
    private Ingredient ingredient;
    public Input() {
    }

    public Input(int inputId, int ingredientId, int inputQuantity, float inputCost, Date inputDate, String inputStatus, int id, LocalDateTime creation, LocalDateTime update, String status, Ingredient ingredient) {
        super(id, creation, update, status);
        this.inputId = inputId;
        this.ingredientId = ingredientId;
        this.inputQuantity = inputQuantity;
        this.inputCost = inputCost;
        this.inputDate = inputDate;
        this.inputStatus = inputStatus;
        this.ingredient = ingredient;
    }

    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public float getInputQuantity() {
        return inputQuantity;
    }

    public void setInputQuantity(float inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public float getInputCost() {
        return inputCost;
    }

    public void setInputCost(float inputCost) {
        this.inputCost = inputCost;
    }
    public String getStringDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = String.valueOf(formatter.format(this.inputDate));
        return stringDate;
    }
    
    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputStatus() {
        return inputStatus;
    }

    public void setInputStatus(String inputStatus) {
        this.inputStatus = inputStatus;
    }
 
    public void setIngredient(Ingredient ingredient){
        this.ingredient = ingredient;
    }
    public Ingredient getIngredient(){
        return this.ingredient;
    }
}
