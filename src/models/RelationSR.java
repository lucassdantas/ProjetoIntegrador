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
    
    private int id_task;
    private int id_lunch;
    
    public RelationSR(int id_task, int id_lunch, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation, update, status);
        this.id_task = id_task;
        this.id_lunch = id_lunch;
      
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

}
