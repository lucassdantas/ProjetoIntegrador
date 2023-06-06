/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.InputDao;
import dao.IngredientDao;
import dao.SnackDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Input;
import models.Ingredient;
import models.Snack;

/**
 *
 * @author Lucas Dantas
 */
public class InputController {
    public static void readJTable(javax.swing.JTable tblEstoque) throws java.sql.SQLException{
        DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
        tblEstoque.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        InputDao inputDao = new InputDao();
        for (Input inputs: inputDao.read()){
            modelo.addRow(new Object[]{
                inputs.getId(),
                inputs.getWeight(),
                inputs.getQuantity(),
            
            });
        }
    }
    
    public static void readJTablePesquisar(String pesquisar, javax.swing.JTable tblEstoque) throws java.sql.SQLException{
        DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
        tblEstoque.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        InputDao inputDao = new InputDao();
        for (Input inputs: inputDao.readBusca(pesquisar)){
            modelo.addRow(new Object[]{
                inputs.getId(),
                inputs.getToStringCreation(),
                inputs.getToStringUpdate()
            });
        }
    }  
}
