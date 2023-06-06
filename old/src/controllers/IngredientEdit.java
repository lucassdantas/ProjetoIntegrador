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
import views.IngredientesCadastro;
import views.IngredientesEditar;

/**
 *
 * @author Luiz Felipe
 */
public class IngredientEdit {
     //Adicionar 
    public void IngredienteEditterAdd(javax.swing.JTextField txtIngredientEdit, javax.swing.JTextField txtCostEdit, javax.swing.JTextField txtQuantityUnitEdit,javax.swing.JTextField txtQuantityMinEdit, javax.swing.JTextField txtMediumUnitEdit ) {
     if(!txtIngredientEdit.getText().isEmpty() && !txtCostEdit.getText().isEmpty() && !txtQuantityUnitEdit.getText().isEmpty() && !txtQuantityMinEdit.getText().isEmpty() && !txtMediumUnitEdit.getText().isEmpty()){
            
            //model
            Ingredient ingredient = new Ingredient();
            
            //dao
            IngredientDao dao = new IngredientDao();
            
            //model
            ingredient.setName(txtIngredientEdit.getText());
            ingredient.setPrice(Float.parseFloat(txtCostEdit.getText()));
            ingredient.setWeight(Float.parseFloat(txtQuantityUnitEdit.getText()));
            ingredient.setQuantity(Integer.parseInt(txtMediumUnitEdit.getText()));
            
            
            try {
                //dao
                dao.create(ingredient);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(IngredientesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
   
    
    
}
