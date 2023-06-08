/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.InputDAO;
import dao.SnackDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.Input;
import models.Snack;

/**
 *
 * @author 42labinfo
 */
public class StockController {

  
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
        
        InputDAO dao = new InputDAO();
        
            for (Input input: dao.readAll()){
                 model.addRow(new Object[]{
                input.getId(),
                input.getIngredientId(),
                input.getInputQuantity(),
                input.getInputCost(),
                input.getInputDate(),
                input.getInputStatus(),
            
 
            
            
            });
        }       
    }
    
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        InputDAO dao = new InputDAO();
        
        for (Input input: dao.search(search)){
            model.addRow(new Object[]{
                input.getId(),
                input.getIngredientId(),
                input.getInputQuantity(),
                input.getInputCost(),
                input.getInputDate(),
                input.getInputStatus(),
               
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
                isEmpty = true;
                break;
            }
        }
        if(!isEmpty){
            return false;
        } else{
            Input input = new Input();
            InputDAO dao = new InputDAO();
            
            input.setIngredientId(Integer. parseInt(fields.get(0).getText()));
            input.setInputQuantity(Integer. parseInt(fields.get(1).getText()));
            input.setInputCost(Float.parseFloat(fields.get(2).getText()));
           //input.setInputDate((fields.get(3).getText()));
            input.setInputStatus(fields.get(3).getText());
            
            try {
                dao.addInput(input);
                return true;
            } catch (SQLException ex) {
                System.out.print(ex);
                return false;
            }
        }
    }
             
  }       
    

   


    



