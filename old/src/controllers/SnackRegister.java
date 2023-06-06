/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDao;
import dao.SnackDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Ingredient;
import models.Snack;
import views.IngredientesEditar;


public class SnackRegister {
   
    //Adicionar 
    public void SnackRegister (javax.swing.JTextField txtProdutoSnackRegister, javax.swing.JTextField txtCostSnackRegister, javax.swing.JTextField txtPrecoSnackRegister, javax.swing.JTextField txtQuantityUnitSnackRegister, javax.swing.JTextField txtMediumUnitSnackRegister, javax.swing.JTextField txtTypeSnackRegister ) {
     if(!txtProdutoSnackRegister.getText().isEmpty() && !txtCostSnackRegister.getText().isEmpty() && !txtPrecoSnackRegister.getText().isEmpty() && !txtQuantityUnitSnackRegister.getText().isEmpty() && !txtMediumUnitSnackRegister.getText().isEmpty() && !txtTypeSnackRegister.getText().isEmpty() ){
            
            //model
            Snack snack = new Snack();
            
            //dao
            SnackDao dao = new SnackDao();
            
            //model
            snack.setName(txtProdutoSnackRegister.getText());
            //snack.setCost(Float.parseFloat(txtCostSnackRegister.getText()));
            snack.setPrice(Float.parseFloat(txtPrecoSnackRegister.getText()));
            //snack.setWeight(Float.parseFloat(txtQuantityUnitEdit.getText()));
            //snack.setMinQuantity(Integer.parseInt(txtMediumUnitEdit.getText()));
            snack.setType(txtTypeSnackRegister.getText());
            
            try {
                //dao
                dao.create(snack);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(LanchesCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
    
}
