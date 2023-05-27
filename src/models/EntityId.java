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
abstract class EntityId extends EntityMultipleId {
    protected int id;
    
    public EntityId() {}
    public EntityId(int id, LocalDateTime creation, LocalDateTime update, String status){
        super(creation, update, status);
        this.id = id; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
