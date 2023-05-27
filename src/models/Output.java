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
public class Output extends DefaultAttributes{
   public Output(){};
    
    private int requestId;
    private int snackId;
    private int ingredientId;

    public Output(int requestId, int snackId, int ingredientId, LocalDateTime creation, LocalDateTime update, String status) {
        super(creation, update, status);
        this.requestId = requestId;
        this.snackId = snackId;
        this.ingredientId = ingredientId;

    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getSnackId() {
        return snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
}
