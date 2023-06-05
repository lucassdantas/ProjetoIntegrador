/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to StockEntry this template
 */
package controllers;

import dao.IngredientDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Ingredient;
import views.EstoqueEditar;
import views.EstoqueEntrada;

/**
 *
 * @author 42labinfo
 */
public class StockEntry {
    
public void StockEntry (javax.swing.JTextField txtIdStockEntry,javax.swing.JTextField txtIngredientStockEntry, javax.swing.JTextField txtUnitMediumStockEntry, javax.swing.JTextField txtQuantityStockEntry,javax.swing.JTextField txtCostStockEntry, javax.swing.JTextField txtDateStockEntry ) {
     if(!txtIdStockEntry.getText().isEmpty() && !txtIngredientStockEntry.getText().isEmpty() && !txtUnitMediumStockEntry.getText().isEmpty() && !txtQuantityStockEntry.getText().isEmpty() && !txtCostStockEntry.getText().isEmpty() && !txtDateStockEntry.getText().isEmpty()){
            
            //model
            Ingredient ingredient = new Ingredient();
            
            //dao
            IngredientDao dao = new IngredientDao();
            
            
            //txtUnitMediumStockEntry
            //ingredient.setName(txtIdStockEntry.getText());
            ingredient.setName(txtIngredientStockEntry.getText());
            ingredient.setPrice(Float.parseFloat(txtUnitMediumStockEntry.getText()));
            ingredient.setWeight(Float.parseFloat(txtQuantityStockEntry.getText()));
            ingredient.setQuantity(Integer.parseInt(txtCostStockEntry.getText()));
            ingredient.setType(txtDateStockEntry.getText());
            
            
            try {
                //dao
                dao.create(ingredient);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(EstoqueEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
   
    
    
}

    

