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
abstract class Entity {
    protected int id;
    protected LocalDateTime creation;
    protected LocalDateTime update;
    protected String status;
    
    public Entity() {}
    public Entity(int id, LocalDateTime creation, LocalDateTime update, String status){
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
    //retorna data de criacao no tipo String
    public String getToStringCreation(){
        return creation;
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
