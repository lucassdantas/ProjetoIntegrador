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
public class RelationSR {
    public RelationSR(){};
    
    private int id_task;
    private int id_lunch;
    private LocalDateTime creation;
    private LocalDateTime update;
    private String status;

    public RelationSR(int id_task, int id_lunch, LocalDateTime creation, LocalDateTime update, String status) {
        this.id_task = id_task;
        this.id_lunch = id_lunch;
        this.creation = creation;
        this.update = update;
        this.status = status;
    }

    public int getId_task() {
        return id_task;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public int getId_lunch() {
        return id_lunch;
    }

    public void setId_lunch(int id_lunch) {
        this.id_lunch = id_lunch;
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
