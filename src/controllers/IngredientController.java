/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Ingredient;

/**
 *
 * @author Lucas Dantas
 */
public class IngredientController {
    
    private JTable table;
    private List<JTextField> fields;
    
    public void setJTable(JTable table){
        this.table = table;
    }
    public void setFields(JTextField field){
        this.fields.add(field);
    }
    
    public JTable getTable(){
        return this.table;
    }
    public List<JTextField> getFields(){
        return this.fields;
    }
    public void readJTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        IngredientDAO dao = new IngredientDAO();
        
        for (Ingredient ingredient: dao.readAll()){
            model.addRow(new Object[]{
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
    
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        IngredientDAO dao = new IngredientDAO();
        
        for (Ingredient ingredient: dao.search(search)){
            model.addRow(new Object[]{
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
            this.readJTable();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o Banco de dador" + ex);
        }
    }

    public void add (List <javax.swing.JTextField> Fields) throws SQLException{
        final boolean isEmpty = false;
        Fields.forEach((field) -> {
            if(field.getText().isEmpty()){
                isEmpty = true;
            }
        });
        if(!isEmpty){
            
            Ingredient ingredient = new Ingredient();
            IngredientDAO dao = new IngredientDAO();
            
            ingredient.setIngredientName(Fields.get(0).getText());
            ingredient.setIngredientUnitCost(Float.parseFloat(Fields.get(1).getText()));
            ingredient.setIngredientUnitQuantity(Float.parseFloat(Fields.get(2).getText()));
            ingredient.setIngredientMinQuantity(Float.parseFloat(Fields.get(3).getText()));
            ingredient.setIngredientUnitOfMeasure(Fields.get(4).getText());
            
            
            try {
                dao.addIngredient(ingredient);
            } catch (SQLException ex) {
                System.out.print(ex);
            }
        }
    }
}
