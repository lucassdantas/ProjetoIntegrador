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
public class Relacoes_l_i {
    public Relacoes_l_i(){};
    
    private int id_lunch;
    private int id_ingredient;
    private int quantity;
    private float weight;
    private LocalDateTime creation;
    private LocalDateTime update;
    private String status;

    public Relacoes_l_i(int id_lunch, int id_ingredient, int quantity, float weight, LocalDateTime creation, LocalDateTime update, String status) {
        this.id_lunch = id_lunch;
        this.id_ingredient = id_ingredient;
        this.quantity = quantity;
        this.weight = weight;
        this.creation = creation;
        this.update = update;
        this.status = status;
    }

    public int getId_lunch() {
        return id_lunch;
    }

    public void setId_lunch(int id_lunch) {
        this.id_lunch = id_lunch;
    }

    public int getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(int id_ingredient) {
        this.id_ingredient = id_ingredient;
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
