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


public class FichaEditar {

   public void StockEdit (javax.swing.JTextField snackId,javax.swing.JTextField ingredientId, javax.swing.JTextField quantity, javax.swing.JTextField weight ) {
     if(!snackId.getText().isEmpty() && !ingredientId.getText().isEmpty() && !quantity.getText().isEmpty() && !weight.getText().isEmpty()){
            
            //model
            RelationSI relationSI = new RelationSI();
            
            //dao
            RelationSIDao dao = new RelationSIDao();
            
            
            //txtUnitMediumEdit
           
         
            // int
            relationSI.setSnackId(Integer.parseInt(snackId.getText()));
            relationSI.setIngredientId(Integer.parseInt(ingredientId.getText()));
            relationSI.setQuantity(Integer.parseInt(quantity.getText()));
            relationSI.setWeight(Float.parseFloat(weight.getText()));
            
            //snackTable
            relationSI.setSnackName(snackName.getText());
            relationSI.setSnackCost(Float.parseFloat(snackCost.getText()));
            relationSI.setSnackPrice(Float.parseFloat(snackQuantity.getText()));
            relationSI.setSnackWeight(Float.parseFloat(snackWeight.getText()));
            relationSI.setSnackCreation(snackCreation.getText());
            relationSI.setSnackUpdate(snackUpdate.getText());
            relationSI.setSnackMinQuantity(snackMinQuantity.getText());
            
            //ingredient
            relationSI.setingredientName(ingredientName.getText());
            relationSI.setingredientPrice(Float.parseFloat(ingredientPrice.getText()));
            relationSI.setingredientWeight(Float.parseFloat(ingredientWeight.getText()));
            relationSI.setingredientQuantity(Integer.parseInt(Quantity.getText()));
            relationSI.setingredientType(ingredientType.getText());
            relationSI.setingredientCreation(ingredientCreation.getText());
            relationSI.setingredientUpdate(ingredientUpdate.getText());
         
            
           
                  
            
            
            
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
