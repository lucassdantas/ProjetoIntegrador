/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Ingredient;

/**
 *
 * @author Lucas Dantas
 */
public class StockController {
    
    private JTable table;
    private final List<JTextField> fields;

    public StockController() {
        this.fields = new ArrayList<>();
    }
    
    public void setJTable(JTable table){
        this.table = table;
    }
    public void setFields(javax.swing.JTextField field){
        this.fields.add(field);
    }
    public JTable getTable(){
        return this.table;
    }
    public List<JTextField> getFields(){
        return this.fields;
    }
    
     public void setFieldsValue(){
        for (int i = 0; i < this.fields.size(); i++){
            fields.get(i).setText(String.valueOf(table.getValueAt(table.getSelectedRow(), i+1)));
        }
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
                ingredient.getIngredientStock(),
                ingredient.getIngredientMinQuantity(),
                ingredient.getIngredientUnitOfMeasure(),
                ingredient.calcStatus(),
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
                ingredient.getIngredientStock(),
                ingredient.getIngredientMinQuantity(),
                ingredient.getIngredientUnitOfMeasure(),
                ingredient.calcStatus(),
            });
        }       
    }

    public void clean (List <javax.swing.JTextField> fields){
        fields.forEach((field) -> {
                field.setText("");
        });
        try {
            this.readJTable();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o Banco de dador" + ex);
        }
    }

    public boolean add (List <javax.swing.JTextField> fields) throws SQLException{
        boolean isEmpty = false;
        for(int i = 0; i > fields.size(); i++){
            if(fields.get(i).getText().isEmpty()){
                System.out.print("the field "+i+" is empty");
                isEmpty = true;
                break;
            }
        }
        if(isEmpty){
            return false;
        } else{
            Ingredient ingredient = new Ingredient();
            IngredientDAO dao = new IngredientDAO();
            
            ingredient.setIngredientName(fields.get(0).getText());
            ingredient.setIngredientUnitCost(Float.parseFloat(fields.get(1).getText()));
            ingredient.setIngredientUnitQuantity(Float.parseFloat(fields.get(2).getText()));
            ingredient.setIngredientMinQuantity(Float.parseFloat(fields.get(3).getText()));
            ingredient.setIngredientUnitOfMeasure(fields.get(4).getText());
            
            try {
                dao.addIngredient(ingredient);
                this.clean(this.fields);
                this.readJTable();
                return true;
            } catch (SQLException ex) {
                System.out.print(ex);
                return false;
            }
        }
    }
    
    public boolean update(List <javax.swing.JTextField> fields) throws SQLException{
            boolean isEmpty = false;
            for(int i = 0; i > fields.size(); i++){
                System.out.print(fields.get(i));
                if(fields.get(i).getText().isEmpty()){
                    System.out.print("the field "+i+" is empty");
                    isEmpty = true;
                    break;
                }
            }
            if(isEmpty){
                 JOptionPane.showMessageDialog(null,
                        "Preencha todos os campos");
                return false;
            } else{
                Ingredient ingredient = new Ingredient();
                IngredientDAO dao = new IngredientDAO();

                ingredient.setId(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0))));
                ingredient.setIngredientName(fields.get(0).getText());
                ingredient.setIngredientUnitCost(Float.parseFloat(fields.get(1).getText()));
                ingredient.setIngredientUnitQuantity(Float.parseFloat(fields.get(2).getText()));
                ingredient.setIngredientMinQuantity(Float.parseFloat(fields.get(3).getText()));
                ingredient.setIngredientUnitOfMeasure(fields.get(4).getText());

                try {
                    dao.updateIngredient(ingredient);
                    this.readJTable();
                    return true;
                } catch (SQLException ex) {
                    System.out.print(ex);
                    return false;
                }
            }
        
        
    }
    
    public void delete() throws SQLException{
        if (this.table.getSelectedRow() != -1){
            int answer = JOptionPane.showConfirmDialog(null,
                    "Confirma a Exclusão do Registro?", 
                    "Exclusão de Registro",OK_CANCEL_OPTION);
            if(answer == 0){
                Ingredient ingredient = new Ingredient();
                IngredientDAO dao = new IngredientDAO();                
                ingredient.setId((int) this.table.getValueAt(
                        this.table.getSelectedRow(), 0));
                
                try {
                    dao.deleteIngredient(ingredient.getId());
                } catch (SQLException ex) {
                    System.out.print(ex);
                }
                
                this.readJTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Selecione um serviço na tabela abaixo!");
        }
    }
}
