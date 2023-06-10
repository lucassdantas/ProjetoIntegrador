/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas Dantas
 */
public class Snack extends EntityId{
    private String snackTitle;
    private float  snackSellingPrice;
    private String snackDescription;
    private String snackImageUrl;
    private String snackStatus;
    public Snack() {
    }

    public Snack( String snackTitle, float snackSellingPrice, String snackDescription, String snackImageUrl, String snackStatus, int id, LocalDateTime creation, LocalDateTime update, String status) {
        super(id, creation, update, status);
        this.snackTitle = snackTitle;
        this.snackSellingPrice = snackSellingPrice;
        this.snackDescription = snackDescription;
        this.snackImageUrl = snackImageUrl;
        this.snackStatus = snackStatus;
    }


    public String getSnackTitle() {
        return snackTitle;
    }

    public void setSnackTitle(String snackTitle) {
        this.snackTitle = snackTitle;
    }

    public float getSnackSellingPrice() {
        return snackSellingPrice;
    }

    public void setSnackSellingPrice(float snackSellingPrice) {
        this.snackSellingPrice = snackSellingPrice;
    }

    public String getSnackDescription() {
        return snackDescription;
    }

    public void setSnackDescription(String snackDescription) {
        this.snackDescription = snackDescription;
    }

    public String getSnackImageUrl() {
        return snackImageUrl;
    }

    public void setSnackImageUrl(String snackImageUrl) {
        this.snackImageUrl = snackImageUrl;
    }

    public String getSnackStatus() {
        return snackStatus;
    }

    public void setSnackStatus(String snackStatus) {
        this.snackStatus = snackStatus;
    }
    
    
}
