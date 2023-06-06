/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Ingredient;

/**
 *
 * @author Lucas Dantas
 */
public class IngredientController {
    public void readJTable(javax.swing.JTable table) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        IngredientDAO dao = new IngredientDAO();
        
        for (Ingredient ingredient: dao.readAll()){
            modelo.addRow(new Object[]{
                ingredient.getId(),
                ingredient.getIngredientName(),
                ingredient.getIngredientMinQuantity(),
                ingredient.getIngredientUnitOfMeasure(),
                ingredient.getIngredientUnitCost(),
                ingredient.getIngredientStatus(),
                ingredient.getIngredientStock(),
                ingredient.getIngredientStockStatus()
            });
        }       
    }
    
    public void readJTableSearch(String search, javax.swing.JTable table ) throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();        
        table.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(0);
        
        IngredientDAO dao = new IngredientDAO();
        
        for (Ingredient ingredient: dao.search(search)){
            modelo.addRow(new Object[]{
                ingredient.getId(),
                ingredient.getIngredientName(),
                ingredient.getIngredientMinQuantity(),
                ingredient.getIngredientUnitOfMeasure(),
                ingredient.getIngredientUnitCost(),
                ingredient.getIngredientStatus(),
                ingredient.getIngredientStock(),
                ingredient.getIngredientStockStatus()
            });
        }       
    }

    public void clean (List <javax.swing.JTextField> Fields,  javax.swing.JTable table){
        Fields.forEach((field) -> {
                field.setText("");
        });
        try {
            this.readJTable(table);
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o Banco de dador" + ex);
        }
    }

    public void add ()
}
