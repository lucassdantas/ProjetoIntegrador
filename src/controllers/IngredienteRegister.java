/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Ingredient;
import views.IngredientesCadastro;

/**
 *
 * @author 42labinfo
 */
public class IngredienteRegister {
    
    
    //Adicionar 
    public void IngredienteRegisterterAdd(javax.swing.JTextField txtIngredientRegister, javax.swing.JTextField txtCostRegister, javax.swing.JTextField txtQuantityUnitRegister,javax.swing.JTextField txtQuantityMinRegister, javax.swing.JTextField txtMediumUnitRegister ) {
     if(!txtIngredientRegister.getText().isEmpty() && !txtCostRegister.getText().isEmpty() && !txtQuantityUnitRegister.getText().isEmpty() && !txtQuantityMinRegister.getText().isEmpty() && !txtMediumUnitRegister.getText().isEmpty()){
            
            //model
            Ingredient ingredient = new Ingredient();
            
            //dao
            IngredientDao dao = new IngredientDao();
            
            //model
            ingredient.setName(txtIngredientRegister.getText());
            ingredient.setPrice(Float.parseFloat(txtCostRegister.getText()));
            ingredient.setWeight(Float.parseFloat(txtQuantityUnitRegister.getText()));
            ingredient.setQuantity(txtMediumUnitRegister.getText());
            
            
            try {
                //dao
                dao.create(ingredient);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(IngredientesCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
   
    
    

}
