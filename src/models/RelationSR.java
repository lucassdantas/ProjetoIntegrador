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
    
    private int requestId;
    private int snackId;
    
    public RelationSR(int requestId, int snackId, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation, update, status);
        this.requestId = requestId;
        this.snackId = snackId;
      
    }

    public int getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(int requestId){
        this.requestId = requestId;
    }
    public int getSnackId() {
        return snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
    }

  

}
