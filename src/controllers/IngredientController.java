

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.DataSheetDAO;
import dao.IngredientDAO;
import dao.InputDAO;
import java.io.File;
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
import java.util.Scanner;
import java.math.BigDecimal;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import models.Snack;
import views.text.area.AreaText;



/**
 *
 * @author Lucas Dantas
 */
public class IngredientController {
    
    private List<Ingredient> ingredients;
    private JTable table;
    private final List<JTextField> fields;
    private views.text.area.AreaText textArea;
    private String imageUrl;
    public IngredientController() {
        this.fields = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.textArea = new views.text.area.AreaText();   
    }
    
    public void setJTable(JTable table){
        this.table = table;
    }
    public void setFields(javax.swing.JTextField field){
        this.fields.add(field);
    }
    
     public void setTextArea(views.text.area.AreaText textArea){
        this.textArea = textArea;
    }
    
     public void setImageUrl(String url){
        this.imageUrl = url;
    } 
    
     public views.text.area.AreaText getTextArea(){
        return this.textArea;
    } 
     
    public JTable getTable(){
        return this.table;
    }
    public List<JTextField> getFields(){
        return this.fields;
    }
    
     public List<Ingredient> getSnacks(){
        return this.ingredients;
    }
    
    /**
     *
     */
    public void setFieldsValue(){
        for (int i = 0; i < this.fields.size(); i++){
            fields.get(i).setText(String.valueOf(table.getValueAt(table.getSelectedRow(), i+1)));
        }
    }
     
      public ImageIcon getImageByIndex(int i){
        String imagePath = ingredients.get(i).getIngredientImageUrl();
        ImageIcon image = new ImageIcon("productImages/default.jpg");
        System.out.println(imagePath);
        if(new File(imagePath).isFile()){
             image = new ImageIcon(ingredients.get(i).getIngredientImageUrl());
        }
        return image;
    }

     public void setFieldsValue (){
        for (int i = 0; i < this.fields.size(); i++){
            fields.get(i).setText(String.valueOf(table.getValueAt(table.getSelectedRow(), i+1)));
        }
        this.textArea.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 3)));
          
     }
     
     
     
     
     
     
     
     
     
    public void readJTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        IngredientDAO dao = new IngredientDAO();
        int i = 0;

        for (Ingredient ingredient : dao.readAll()) {
            
            float unitCost = ingredient.getIngredientUnitCost();
            float unitQuantity = ingredient.getIngredientUnitQuantity();
            float minQuantity = ingredient.getIngredientMinQuantity();

            model.addRow(new Object[]{
              ingredient.getId(),
              ingredient.getIngredientName(),
              unitCost,
              unitQuantity,
              minQuantity,
              ingredient.getIngredientUnitOfMeasure()
                    
            });
            
            int unitQuantityInteger;
            int minQuantityInteger;
            
            if( unitQuantity % 1 == 0){
                unitQuantityInteger = (int) unitQuantity;
                model.setValueAt(unitQuantityInteger, i, 3);
            }
            if(minQuantity % 1 == 0){
                minQuantityInteger = (int) minQuantity;
                model.setValueAt(minQuantityInteger, i, 4);
            }
            i++;
          }
        }       
    
    
  public void readJTableSearch(String search) throws SQLException {
    DefaultTableModel model = (DefaultTableModel) this.table.getModel();
    this.table.setRowSorter(new TableRowSorter(model));
    model.setNumRows(0);

    IngredientDAO dao = new IngredientDAO();

    int i = 0;
    
    for (Ingredient ingredient : dao.search(search)) {
        
            float unitCost = ingredient.getIngredientUnitCost();
            float unitQuantity = ingredient.getIngredientUnitQuantity();
            float minQuantity = ingredient.getIngredientMinQuantity();

            model.addRow(new Object[]{
                ingredient.getId(),
                ingredient.getIngredientName(),
                unitCost,
                unitQuantity,
                minQuantity,
                ingredient.getIngredientUnitOfMeasure()
            });
                int unitQuantityInteger;
                int minQuantityInteger;
            
                if( unitQuantity % 1 == 0){
                    unitQuantityInteger = (int) unitQuantity;
                    model.setValueAt(unitQuantityInteger, i, 3);
                }
                if(minQuantity % 1 == 0){
                    minQuantityInteger = (int) minQuantity;
                    model.setValueAt(minQuantityInteger, i, 4);
                }
            
            i++;

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
            ingredient.setIngredientUnitCost(Float.parseFloat(fields.get(1).getText().replaceAll("," , ".")));
            ingredient.setIngredientUnitQuantity(Float.parseFloat(fields.get(2).getText().replaceAll("," , ".")));
            ingredient.setIngredientMinQuantity(Float.parseFloat(fields.get(3).getText().replaceAll("," , ".")));
            ingredient.setIngredientUnitOfMeasure(fields.get(4).getText());
            ingredient.setIngredientImageUrl("productImages/default.jpg");
              if(!this.imageUrl.isEmpty()){
             ingredient.setIngredientImageUrl(this.imageUrl);
            }           
            
             try {
                dao.addIngredient(ingredient);
                this.ingredients = new ArrayList<>();
                this.clean(this.fields, this.textArea);
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
                ingredient.setIngredientUnitCost(Float.parseFloat(fields.get(1).getText().replaceAll("," , ".")));
                ingredient.setIngredientUnitQuantity(Float.parseFloat(fields.get(2).getText().replaceAll("," , ".")));
                ingredient.setIngredientMinQuantity(Float.parseFloat(fields.get(3).getText().replaceAll("," , ".")));
                ingredient.setIngredientUnitOfMeasure(fields.get(4).getText());
                if(!this.imageUrl.isEmpty()){
                    ingredient.setIngredientImageUrl(this.imageUrl);
                }
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
                DataSheetDAO dsDAO = new DataSheetDAO();
                InputDAO inputDAO = new InputDAO();
                ingredient.setId((int) this.table.getValueAt(
                        this.table.getSelectedRow(), 0));
                
                try {
                    inputDAO.deleteByIngredientId(ingredient.getId());
                    dsDAO.deleteByIngredientId(ingredient.getId());
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

    private void clean(List<JTextField> fields, AreaText textArea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFields(JLabel ingredientImageUrl) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
