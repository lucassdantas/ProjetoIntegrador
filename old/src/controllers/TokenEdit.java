/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDao;
import dao.RelationSIDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Ingredient;
import models.RelationSI;


public class TokenEdit {

   public void TokenEdit (javax.swing.JTextField snackId,javax.swing.JTextField ingredientId, javax.swing.JTextField quantityTokenEdit, javax.swing.JTextField weightTokenEdit ) {
     if(!snackId.getText().isEmpty() && !ingredientId.getText().isEmpty() && !quantityTokenEdit.getText().isEmpty() && !weightTokenEdit.getText().isEmpty()){
            
            //model
            RelationSI relationSI = new RelationSI();
            
            //dao
            RelationSIDao dao = new RelationSIDao();
            
            
            //txtUnitMediumEdit
           
         
            // int
            relationSI.setSnackId(Integer.parseInt(snackId.getText()));
            relationSI.setIngredientId(Integer.parseInt(ingredientId.getText()));
            relationSI.setQuantity(Integer.parseInt(quantityTokenEdit.getText()));
            relationSI.setWeight(Float.parseFloat(weightTokenEdit.getText()));
            
            //snackTable
            relationSI.setSnackName(snackNameTokenEdit.getText());
            relationSI.setSnackCost(Float.parseFloat(snackCostTokenEdit.getText()));
            relationSI.setSnackPrice(Float.parseFloat(snackQuantityTokenEdit.getText()));
            relationSI.setSnackWeightTokenEdit(Float.parseFloat(snackWeightTokenEdit.getText()));
            relationSI.setSnackCreation(snackCreationTokenEdit.getText());
            relationSI.setSnackUpdate(snackUpdateTokenEdit.getText());
            relationSI.setSnackMinQuantityTokenEdit(snackMinQuantityTokenEdit.getText());
            
            //ingredient
            relationSI.setingredientName(ingredientNameTokenEdit.getText());
            relationSI.setingredientPrice(Float.parseFloat(ingredientPriceTokenEdit.getText()));
            relationSI.setingredientWeight(Float.parseFloat(ingredientWeightTokenEdit.getText()));
            relationSI.setingredientQuantity(Integer.parseInt(QuantityTokenEdit.getText()));
            relationSI.setingredientType(ingredientTypeTokenEdit.getText());
            relationSI.setingredientCreation(ingredientCreationTokenEdit.getText());
            relationSI.setingredientUpdate(ingredientUpdateTokenEdit.getText());
         
            
           
                  
            
            
            
            try {
                //dao
                dao.create(relationSI);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(FichaEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  

    
}
