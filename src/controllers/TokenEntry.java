/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.RelationSIDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.RelationSI;

/**
 *
 * @author Luiz Felipe
 */
public class TokenEntry {
 
     public void StockOpen (javax.swing.JTextField snackId,javax.swing.JTextField ingredientId, javax.swing.JTextField quantityTokenEntry, javax.swing.JTextField weightTokenEntry ) {
     if(!snackId.getText().isEmpty() && !ingredientId.getText().isEmpty() && !quantityTokenEntry.getText().isEmpty() && !weightTokenEntry.getText().isEmpty()){
            
            //model
            RelationSI relationSI = new RelationSI();
            
            //dao
            RelationSIDao dao = new RelationSIDao();
            
            
            //txtUnitMediumEdit
           
         
            // int
            relationSI.setSnackId(Integer.parseInt(snackId.getText()));
            relationSI.setIngredientId(Integer.parseInt(ingredientId.getText()));
            relationSI.setQuantity(Integer.parseInt(quantityTokenEntry.getText()));
            relationSI.setWeight(Float.parseFloat(weightTokenEntry.getText()));
            
            //snackTable
            relationSI.setSnackName(snackNameTokenEntry.getText());
            relationSI.setSnackCost(Float.parseFloat(snackCostTokenEntry.getText()));
            relationSI.setSnackPrice(Float.parseFloat(snackQuantityTokenEntry.getText()));
            relationSI.setSnackWeight(Float.parseFloat(snackWeightTokenEntry.getText()));
            relationSI.setSnackCreation(snackCreationTokenEntry.getText());
            relationSI.setSnackUpdate(snackUpdateTokenEntry.getText());
            relationSI.setSnackMinQuantity(snackMinQuantityTokenEntry.getText());
            
            //ingredient
            relationSI.setingredientName(ingredientNameTokenEntry.getText());
            relationSI.setingredientPrice(Float.parseFloat(ingredientPriceTokenEntry.getText()));
            relationSI.setingredientWeight(Float.parseFloat(ingredientWeightTokenEntry.getText()));
            relationSI.setingredientQuantity(Integer.parseInt(QuantityTokenEntry.getText()));
            relationSI.setingredientType(ingredientTypeTokenEntry.getText());
            relationSI.setingredientCreation(ingredientCreationTokenEntry.getText());
            relationSI.setingredientUpdate(ingredientUpdateTokenEntry.getText());
         
            
           
                  
            
            
            
            try {
                //dao
                dao.create(relationSI);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(FichaEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  

    
}


