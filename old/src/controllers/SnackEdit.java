/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.SnackDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Snack;
import views.LanchesEditar;

public class SnackEdit {
 
    //Adicionar 
    public void SnackEdit (javax.swing.JTextField txtProdutoSnackEdit, javax.swing.JTextField txtCostSnackEdit, javax.swing.JTextField txtPrecoSnackEdit, javax.swing.JTextField txtQuantityUnitSnackEdit, javax.swing.JTextField txtMediumUnitSnackEdit, javax.swing.JTextField txtTypeSnackEdit ) {
     if(!txtProdutoSnackEdit.getText().isEmpty() && !txtCostSnackEdit.getText().isEmpty() && !txtPrecoSnackEdit.getText().isEmpty() && !txtQuantityUnitSnackEdit.getText().isEmpty() && !txtMediumUnitSnackEdit.getText().isEmpty() && !txtTypeSnackEdit.getText().isEmpty() ){
            
            //model
            Snack snack = new Snack();
            
            //dao
            SnackDao dao = new SnackDao();
            
            //model
            snack.setName(txtProdutoSnackEdit.getText());
            //snack.setCost(Float.parseFloat(txtCostSnackEdit.getText()));
            snack.setPrice(Float.parseFloat(txtPrecoSnackEdit.getText()));
            //snack.setWeight(Float.parseFloat(txtQuantityUnitSnackEdit.getText()));
            //snack.setMinQuantity(Integer.parseInt(txtMediumUnitSnackEdit.getText()));
            snack.setType(txtTypeSnackEdit.getText());
            
            try {
                //dao
                dao.create(snack);
            } catch (SQLException ex) {
                //aviso de erro
                Logger.getLogger(LanchesEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
     }  
    
}


