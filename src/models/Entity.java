/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    public String timeToString(LocalDateTime time){
        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedTime = time.format(formatPattern);
        return formattedTime;
    }
    
    public LocalDateTime stringToTime(String time){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime newTime = LocalDateTime.parse(time, dateFormat);
        return newTime;
    }
    //retorna data de criacao no tipo String
    public String getToStringCreation(){
        return this.timeToString(this.creation);
    }
    
    public void setToStringCreation(String time){
        this.creation = this.stringToTime(time);
    }
    
    public String getToStringUpdate(){
        return this.timeToString(this.update);
    }
    
    public void setToStringUpdate(String time){
        this.update = this.stringToTime(time);
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
