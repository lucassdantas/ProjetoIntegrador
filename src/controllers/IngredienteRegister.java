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

/**
 *
 * @author 42labinfo
 */
public class IngredienteRegister {
    
    
    //Adicionar 
    public class IngredienteRegisterterAdd(private javax.swing.JPanel) {
     if(!txtIngredientRegister.getText().isEmpty() && !txtCostRegister.getText().isEmpty() && !txtQuantityUnitRegister.getText().isEmpty() && !txtQuantityMinRegister.getText().isEmpty() && !txtMediumUnitRegister.getText().isEmpty()){
            
            IngredientDao ingredient = new Ingredient();
            IngredientDao dao = new IngredientDao();
            
            ingredient.setIngredientRegister(txtIngredientRegister.getText());
            ingredient.setCostRegister(Float.parseFloat(txtCostiRegister.getText()));
            ingredient.setIngredientRegister(txtQuantityUniRegister.getText());
            ingredient.setIngredientRegister(txtQuantityMinRegister.getText());
            ingredient.setIngredientRegister(txttxtMediumUnitRegister.getText());
            
            
            try {
                dao.create(ingredient);
            } catch (SQLException ex) {
                Logger.getLogger(IngredientesCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
   
    
    

}
