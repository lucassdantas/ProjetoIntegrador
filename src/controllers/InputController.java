/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.EntradasDao;
import dao.IngredientesDao;
import dao.LanchesDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Entradas;
import models.Ingredientes;
import models.Lanches;

/**
 *
 * @author Lucas Dantas
 */
public class InputController {
    public static void readJTable(javax.swing.JTable tblEstoque) throws java.sql.SQLException{
        DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
        tblEstoque.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        EntradasDao inputDao = new EntradasDao();
        for (Entradas inputs: inputDao.read()){
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
        EntradasDao inputDao = new EntradasDao();
        for (Entradas inputs: inputDao.readBusca(pesquisar)){
            modelo.addRow(new Object[]{
                inputs.getId(),
                inputs.getToStringCreation(),
                inputs.getToStringUpdate()
            });
        }
    }  
}
