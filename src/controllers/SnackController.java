/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDAO;
import dao.SnackDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Ingredient;
import models.Snack;

/**
 *
 * @author 42labinfo
 */
public class SnackController {
    
     public void readJTable(javax.swing.JTable table) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        SnackDAO dao = new SnackDAO();
        
        for (Snack snack: dao.readAll()){
            modelo.addRow(new Object[]{
                snack.getId(),
                snack.getSnackTitle(),
                snack.getSnackSellingPrice(),
                snack.getSnackDescription(),
                snack.getSnackImageUrl(),
                snack.getSnackStatus(),
            });
        }       
    }
    
    public void readJTableBusca(String search,javax.swing.JTable table ) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        SnackDAO dao = new SnackDAO();
        
        for (Snack snack: dao.search(search)){
            modelo.addRow(new Object[]{
                snack.getId(),
                snack.getSnackTitle(),
                snack.getSnackSellingPrice(),
                snack.getSnackDescription(),
                snack.getSnackImageUrl(),
                snack.getSnackStatus(),
            
                 });
             
        }       
    }

    public void limpar(){
        
        //limpar os campos
        txtId.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
        txtBusca.setText("");
        txtDescricao.grabFocus();
        
        btnAdicionar.setEnabled(true);
        txtBusca.setEnabled(true);
        btnBuscar.setEnabled(true);
        
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        
        try {
            readJTable();
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o Banco de dador" + ex);
        }
        
    }
}

