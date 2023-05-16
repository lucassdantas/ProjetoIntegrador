/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.Instant;
import java.time.Instant;

/**
 *
 * @author 42labinfo
 */
public class Entity {
    protected int id;
    protected Instant creation;
    protected Instant update;
    protected String status;
    
    public Entity() {}
    public Entity(int id, Instant creation, Instant update, String status){
        this.id= id;
        this.creation = creation;
        this.update = update;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getCreation() {
        return creation;
    }

    public void setCreation(Instant creation) {
        this.creation = creation;
    }

    public Instant getUpdate() {
        return update;
    }

    public void setUpdate(Instant update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     
            
}
