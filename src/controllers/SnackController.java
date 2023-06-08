/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.IngredientDAO;
import dao.SnackDAO;
import java.sql.SQLException;
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
import models.Snack;

/**
 *
 * @author 42labinfo
 */
public class SnackController {
    
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
        
        DefaultTableModel modelo = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(modelo));
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
    
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        SnackDAO dao = new SnackDAO();
        
        for (Snack snack: dao.search(search)){
            model.addRow(new Object[]{
                snack.getId(),
                snack.getSnackTitle(),
                snack.getSnackSellingPrice(),
                snack.getSnackDescription(),
                snack.getSnackImageUrl(),
                snack.getSnackStatus(),
               
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
            Snack snack = new Snack();
            SnackDAO dao = new SnackDAO();
            
            snack.setSnackTitle(fields.get(0).getText());
            snack.setSnackSellingPrice(Float.parseFloat(fields.get(1).getText()));
            snack.setSnackDescription(fields.get(2).getText());
            snack.setSnackImageUrl(fields.get(3).getText());
            snack.setSnackStatus(fields.get(4).getText());
            
            try {
                dao.addSnack(snack);
                return true;
            } catch (SQLException ex) {
                System.out.print(ex);
                return false;
            }
        }
    }
    

     
    public void delete(int id) throws SQLException{
        if (this.table.getSelectedRow() != -1){
            int answer = JOptionPane.showConfirmDialog(null,
                    "Confirma a Exclusão do Registro?", 
                    "Exclusão de Registro",OK_CANCEL_OPTION);
            if(answer == 0){
                Snack snack = new Snack();
                SnackDAO dao = new SnackDAO();                
                snack.setId((int) this.table.getValueAt(
                        this.table.getSelectedRow(), 0));
                
                try {
                    dao.deleteSnack(snack.getId());
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

