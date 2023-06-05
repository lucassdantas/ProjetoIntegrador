/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Ingredient;
import views.EstoqueEditar;

import views.IngredientesCadastro;

public class StockEdit {
 

    public void StockEdit (javax.swing.JTextField txtIdStockEdit,javax.swing.JTextField txtIngredientStockEdit, javax.swing.JTextField txtUnitMediumStockEdit, javax.swing.JTextField txtQuantityStockEdit,javax.swing.JTextField txtCostStockEdit, javax.swing.JTextField txtDateStockEdit ) {
     if(!txtIdStockEdit.getText().isEmpty() && !txtIngredientStockEdit.getText().isEmpty() && !txtUnitMediumStockEdit.getText().isEmpty() && !txtQuantityStockEdit.getText().isEmpty() && !txtCostStockEdit.getText().isEmpty() && !txtDateStockEdit.getText().isEmpty()){
            
            //model
            Ingredient ingredient = new Ingredient();
            
            //dao
            IngredientDao dao = new IngredientDao();
            
            //txtUnitMediumStockEdit
            //ingredient.setName(txtIdEdit.getText());
            ingredient.setName(txtIngredientStockEdit.getText());
            ingredient.setPrice(Float.parseFloat(txtUnitMediumStockEdit.getText()));
            ingredient.setWeight(Float.parseFloat(txtQuantityStockEdit.getText()));
            ingredient.setQuantity(Integer.parseInt(txtCostStockEdit.getText()));
            ingredient.setType(txtDateStockEdit.getText());
            
            try {
                //dao
                dao.create(ingredient);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(EstoqueEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
   
    
    
}
