/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.DataSheetDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.DataSheet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

/**
 *
 * @author joao jardim
 */
public class DataSheetController {

    private JTable table;
    private final List<JTextField> ingredientFields;
    private final List<JTextField> snackFields;
    private Snack snack;
    private Ingredient ingredient;
    private DataSheet dataSheet 
    private JTextField resultField;
    
    public DataSheetController() {
        this.ingredientFields = new ArrayList<>();
        this.snackFields = new ArrayList<>();
        this.Snack snack = new Snack();
        this.Ingredient ingredient = new Ingredient();
        this.dataSheet = new DataSheet();
    }
    
    public void setJTable(JTable table){
        this.table = table;
    }
    public void setIngredientFields(javax.swing.JTextField field){
        this.ingredientFields.add(field);
    }
    public void setSnackFields(javax.swing.JTextField field){
        this.snackFields.add(field);
    }
    
    public JTable getTable(){
        return this.table;
    }
    public List<JTextField> getIngredientFields(){
        return this.ingredientFields;
    }
    public List<JTextField> getSnackFields(){
        return this.snackFields;
    }
    
     public void setIngredientFieldsValue(){
        for (int i = 0; i < this.ingredientFields.size(); i++){
            ingredientFields.get(i).setText(String.valueOf(table.getValueAt(table.getSelectedRow(), i+1)));
        }
    }
     public void readJTable() throws SQLException, java.sql.SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        DataSheetDAO dao = new DataSheetDAO();
        
        for (DataSheet dataSheet: dao.readAll()){
            model.addRow(new Object[]{
                dataSheet.getDsSnackId(),
                dataSheet.getSnack().getSnackTitle(),
                dataSheet.getIngredient().getIngredientName(),
                dataSheet.getDsQuantity(),
                dataSheet.getIngredient().getIngredientUnitOfMeasure(),
                dataSheet.getDsTotalCost()
            });
        }       
    }
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        DataSheetDAO dao = new DataSheetDAO();
        
        for (DataSheet dataSheet: dao.search(search)){
            model.addRow(new Object[]{
                dataSheet.getDsSnackId(),
                dataSheet.getSnack().getSnackTitle(),
                dataSheet.getIngredient().getIngredientName(),
                dataSheet.getDsQuantity(),
                dataSheet.getIngredient().getIngredientUnitOfMeasure(),
                dataSheet.getDsTotalCost()
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
     public boolean add (List <javax.swing.JTextField> ingredientFields,L ist <javax.swing.JTextField> snackFields  ) throws SQLException{
        boolean isEmpty = false;
        for(int i = 0; i > ingredientFields.size(); i++){
            if(ingredientFields.get(i).getText().isEmpty()){
                System.out.print("the field "+i+" is empty");
                isEmpty = true;
                break;
            }
        }
        for(int i = 0; i > snackFields.size(); i++){
            if(snackFields.get(i).getText().isEmpty()){
                System.out.print("the field "+i+" is empty");
                isEmpty = true;
                break;
            }
        }
        if(isEmpty){
            return false;
        } else{
            DataSheetDAO dao = new DataSheetDAO();
            this.snack.getId(Integer.parseInt(snackFields.get(0).getText()));
            this.ingredient.getId(Integer.parseInt(ingredientFields.get(0).getText()));
            this.dataSheet.setDsQuantity(Integer.parseInt(ingredientFields.get(1).getText()));
            this.dataSheet.set
            
            try {
                dao.addDataSheet(dataSheet);
                this.clean(this.ingredientFields);
                this.clean(this.snackFields);
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
                DataSheet dataSheet = new DataSheet();
                DataSheetDAO dao = new DataSheetDAO();

                dataSheet.setDsSnackId(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0))));
                dataSheet.setDsIngredientId(Integer.parseInt(fields.get(1).getText()));
                dataSheet.setDsQuantity(Integer.parseInt(fields.get(2).getText()));
                dataSheet.setDsTotalCost(Float.parseFloat(fields.get(3).getText()));

                try {
                    dao.updateDataSheet(dataSheet);
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
                DataSheet dataSheet = new DataSheet();
                DataSheetDAO dao = new DataSheetDAO();                
                dataSheet.setDsSnackId((int) this.table.getValueAt(
                        this.table.getSelectedRow(), 0));
                
                try {
                    dao.deleteDataSheet(dataSheet.getDsSnackId(), dataSheet.getDsIngredientId());
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