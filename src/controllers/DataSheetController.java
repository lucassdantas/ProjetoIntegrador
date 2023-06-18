/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.DataSheetDAO;
import dao.IngredientDAO;
import dao.SnackDAO;
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
import models.Ingredient;
import models.Snack;

/**
 *
 * @author joao jardim
 */
public class DataSheetController {

    private JTable table;
    private final List<JTextField> ingredientFields;
    private final List<JTextField> snackFields;
    private JTextField totalValueField;
    private views.spinner.Spinner dsQuantitySpinner;
    private Snack snack;
    private List<Snack> snacksList;
    private Ingredient ingredient;
    private List<Ingredient>ingredientsList;
    private DataSheet dataSheet;
    private JTextField resultField;
    
    public DataSheetController() {
        this.ingredientFields = new ArrayList<>();
        this.snackFields = new ArrayList<>();
        this.snack = new Snack();
        this.ingredient = new Ingredient();
        this.dataSheet = new DataSheet();
        this.snacksList = new ArrayList<>();
        this.ingredientsList = new ArrayList<>();
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
    public void setDsQuantitySpinner(views.spinner.Spinner spinner){
        this.dsQuantitySpinner = spinner;
    }
    public void setTotalValueField(JTextField field){
        this.totalValueField = field;
    }
    
    public void setSnackModelList(Snack snack){
        this.snacksList.add(snack);
    }
    public void setIngredientModelList(Ingredient ingredient){
        this.ingredientsList.add(ingredient);
    }
    public void setSnackModel(Snack snack){
        this.snack = snack;
        
    }
    public void setIngredientModel(Ingredient ingredient){
        this.ingredient = ingredient;
    }
    
    public List<Snack> getSnacksList(){
        return this.snacksList;
    }
    public List<Ingredient> getIngredientsList(){
        return this.ingredientsList;
    }
    public views.spinner.Spinner getDsQuantitySpinner(){
        return this.dsQuantitySpinner;
    }
    public JTextField getTotalValueField (){
        return this.totalValueField;
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
    public void setFieldsValue(){
        snackFields.get(0).setText(String.valueOf(this.snack.getId()));
        snackFields.get(1).setText(String.valueOf(this.snack.getSnackTitle()));
        ingredientFields.get(0).setText(String.valueOf(this.ingredient.getId()));
        ingredientFields.get(1).setText(String.valueOf(this.ingredient.getIngredientName()));
        ingredientFields.get(2).setText(String.valueOf(this.ingredient.getIngredientUnitQuantity()));
        ingredientFields.get(3).setText(String.valueOf(this.ingredient.getIngredientUnitOfMeasure()));
        ingredientFields.get(4).setText(String.valueOf(this.ingredient.getIngredientUnitCost()));
        this.totalValueField.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 4)));
        this.dsQuantitySpinner.setValue(Integer.valueOf(String.valueOf(table.getValueAt(table.getSelectedRow(), 2)))); 
    }
   
    public void searchSnack(int id) throws SQLException{
        
        SnackDAO dao = new SnackDAO();
        this.snack = dao.searchById(id);
 ;
        this.getSnackFields().get(0).setText(String.valueOf(snack.getSnackTitle()));
    }
    public void searchIngredient(int id) throws SQLException{
        
        IngredientDAO dao = new IngredientDAO();
        this.ingredient = dao.searchById(id);
        this.getIngredientFields().get(0).setText(String.valueOf(ingredient.getIngredientName()));
        this.getIngredientFields().get(1).setText(String.valueOf(ingredient.getIngredientUnitQuantity()));
        this.getIngredientFields().get(2).setText(String.valueOf(ingredient.getIngredientUnitOfMeasure()));
        this.getIngredientFields().get(3).setText(String.valueOf(ingredient.getIngredientUnitCost()));
    }
    
    public float calcTotalValue(){
        float spinnerValue = Float.parseFloat(String.valueOf(this.dsQuantitySpinner.getValue()));
        float ingredientCost = Float.parseFloat((String) this.ingredientFields.get(3).getText());
        float unityQuantity = Float.parseFloat((String) this.ingredientFields.get(1).getText());
        float result = (spinnerValue * ingredientCost) / unityQuantity;
        this.totalValueField.setText(String.format("%.2f",result));
        return result;
    }
    public float calcTotalValueEditView(){
        float spinnerValue = Float.parseFloat(String.valueOf(this.dsQuantitySpinner.getValue()));
        float ingredientCost = Float.parseFloat((String) this.ingredientFields.get(4).getText());
        float unityQuantity = Float.parseFloat((String) this.ingredientFields.get(2).getText());
        float result = (spinnerValue * ingredientCost) / unityQuantity;
        this.totalValueField.setText(String.format("%.2f",result));
        return result;
    }
    public void readJTable() throws SQLException, java.sql.SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        DataSheetDAO dao = new DataSheetDAO();
        
        for (DataSheet ds: dao.readAll()){
            this.snacksList.add(ds.getSnack());
            this.ingredientsList.add(ds.getIngredient());
            
            
            model.addRow(new Object[]{
                //dataSheet.getDsSnackId(),
                ds.getSnack().getSnackTitle(),
                ds.getIngredient().getIngredientName(),
                ds.getDsQuantity(),
                ds.getIngredient().getIngredientUnitOfMeasure(),
                ds.getDsTotalCost()
            });
        }       
    }
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        DataSheetDAO dao = new DataSheetDAO();
       
        for (DataSheet dataSheet: dao.search(search)){
            this.snacksList.add(dataSheet.getSnack());
            this.ingredientsList.add(dataSheet.getIngredient());
            model.addRow(new Object[]{
               // dataSheet.getDsSnackId(),
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
    
    public boolean add (List <javax.swing.JTextField> ingredientFields, List<javax.swing.JTextField> snackFields, JTextField totalValueField, views.spinner.Spinner spinner  ) throws SQLException{
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
            this.dataSheet.setDsQuantity(Integer.parseInt(String.valueOf(spinner.getValue())));
            this.dataSheet.setDsTotalCost(Float.parseFloat(String.valueOf(totalValueField.getText().replace(",", "."))));
            this.dataSheet.setSnack(this.snack);
            this.dataSheet.setIngredient(this.ingredient);
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
     
    public boolean update(List <javax.swing.JTextField> ingredientFields, List<javax.swing.JTextField> snackFields, JTextField totalValueField, views.spinner.Spinner spinner ) throws SQLException{
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
            this.dataSheet.setDsQuantity(Integer.parseInt(String.valueOf(spinner.getValue())));
            this.dataSheet.setDsTotalCost(Float.parseFloat(String.valueOf(totalValueField.getText().replace(",", "."))));
            
            this.dataSheet.setSnack(this.snack);
            this.dataSheet.setIngredient(this.ingredient);
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
                
                try {
                    dao.deleteDataSheet(this.snacksList.get(this.table.getSelectedRow()).getId(), this.ingredientsList.get(this.table.getSelectedRow()).getId());
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