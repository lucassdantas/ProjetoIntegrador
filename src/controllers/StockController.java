/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.InputDAO;
import dao.SnackDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Input;
import models.Snack;

/**
 *
 * @author 42labinfo
 */
public class StockController {

 public void readJTable(javax.swing.JTable table) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        InputDAO dao = new InputDAO();
        
        for (Input input: dao.readAll()){
            modelo.addRow(new Object[]{
                input.getId(),
                input.getIngredientId(),
                input.getInputQuantity(),
                input.getInputCost(),
                input.getInputDate(),
                input.getInputStatus(),
            
 
            
            
            });
        }       
    }
    
    public void readJTableBusca(String search,javax.swing.JTable table ) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        InputDAO dao = new InputDAO();
        
        for (Input input: dao.search(search)){
            modelo.addRow(new Object[]{
                input.getId(),
                input.getIngredientId(),
                input.getInputQuantity(),
                input.getInputCost(),
                input.getInputDate(),
                input.getInputStatus(),
            
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

    



