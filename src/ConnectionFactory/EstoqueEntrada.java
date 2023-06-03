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

/**
 *
 * @author 42labinfo
 */
public class EstoqueEntrada {
    
public void StockEdit (javax.swing.JTextField txtIdEdit,javax.swing.JTextField txtIngredientEdit, javax.swing.JTextField txtUnitMediumEdit, javax.swing.JTextField txtQuantityEdit,javax.swing.JTextField txtCostEdit, javax.swing.JTextField txtDateEdit ) {
     if(!txtIdEdit.getText().isEmpty() && !txtIngredientEdit.getText().isEmpty() && !txtUnitMediumEdit.getText().isEmpty() && !txtQuantityEdit.getText().isEmpty() && !txtCostEdit.getText().isEmpty() && !txtDateEdit.getText().isEmpty()){
            
            //model
            Ingredient ingredient = new Ingredient();
            
            //dao
            IngredientDao dao = new IngredientDao();
            
            
            //txtUnitMediumEdit
            //ingredient.setName(txtIdEdit.getText());
            ingredient.setName(txtIngredientEdit.getText());
            ingredient.setPrice(Float.parseFloat(txtUnitMediumEdit.getText()));
            ingredient.setWeight(Float.parseFloat(txtQuantityEdit.getText()));
            ingredient.setQuantity(Integer.parseInt(txtCostEdit.getText()));
            ingredient.setType(txtDateEdit.getText());
            
            
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

    

