
package controllers;

import dao.DataSheetDAO;
import dao.IngredientDAO;
import dao.OrdersDAO;
import dao.SnackDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import models.DataSheet;
import models.Ingredient;
import models.Orders;
import models.Snack;
import views.combobox.Combobox;


public final class OrdersController {
    private JTable table;
    private final List<JTextField> fields;
    private List<Snack> snacks;
    private List<Ingredient> ingredients;
    private List<DataSheet> dataSheets;
    private Ingredient ingredient;
    private Combobox comboBox;
    public OrdersController(JTable table, Combobox comboBox) throws SQLException {
        this.snacks = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.dataSheets = new ArrayList<>();
        this.fields = new ArrayList<>();
        this.setJTable(table);
        this.setComboBox(comboBox);
        this.readJTable();
       /* 
        this.searchDataSheet();
        this.searchSnack();
        this.searchIngredient();
        this.setComboBoxOptions();*/
    }
    
    public void setComboBox(Combobox comboBox){
        this.comboBox = comboBox;
    }
    public void setJTable(JTable table){
        this.table = table;
    }
    public void setFields(javax.swing.JTextField field){
        this.fields.add(field);
    }
    public void setSnacks(Snack snack){
        this.snacks.add(snack);
    }
    
    public void searchDataSheet() throws SQLException{
        DataSheetDAO dao = new DataSheetDAO();
        this.dataSheets = dao.readAll();
    }
    
    public void searchIngredient() throws SQLException{
        IngredientDAO dao = new IngredientDAO();
        for(int i = 0; i < dataSheets.size(); i++){
            
            this.ingredient = dao.searchById(dataSheets.get(i).getDsIngredientId());
        }
    }
    
    public void searchSnack() throws SQLException{
        SnackDAO dao = new SnackDAO();
        for(int i = 0; i < dataSheets.size(); i++){
            this.setSnacks(dao.searchById(dataSheets.get(i).getDsSnackId()));
        }
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
    
    public void setComboBoxOptions(){
        for(int i = 0; i < this.snacks.size(); i++){
            this.comboBox.addItem(this.snacks.get(i).getSnackTitle());
        }
    }
    public void readDataSheetTable(int id) throws SQLException{
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        OrdersDAO dao = new OrdersDAO();
        /*
        for (DataSheet dataSheet: dao.searchById(id)){
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
        }      */ 
    }
    public void readJTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        OrdersDAO dao = new OrdersDAO();
        
        for (Orders orders: dao.readAll()){
            model.addRow(new Object[]{
                orders.getOrderId(),
                orders.getOrderSnackId(),
                orders.getOrderQuantity(),
                orders.getOrderCost(),
                orders.getOrderUnitPrice(),
                orders.getOrderTotalPrice(),
                orders.getOrderDate(),
                orders.getSnack(),
            });
        }       
    }
    
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.table.getModel();        
        this.table.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        OrdersDAO dao = new OrdersDAO();
        
        for (Orders orders: dao.search(search)){
            model.addRow(new Object[]{
                orders.getOrderId(),
                orders.getOrderSnackId(),
                orders.getOrderQuantity(),
                orders.getOrderCost(),
                orders.getOrderUnitPrice(),
                orders.getOrderTotalPrice(),
                orders.getOrderDate(),
                orders.getSnack()
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
            Orders orders = new Orders();
            OrdersDAO dao = new OrdersDAO();
            
            orders.setOrderSnackId(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0))));
            orders.setOrderQuantity(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 1))));
            orders.setOrderCost(Float.parseFloat(fields.get(2).getText()));
            orders.setOrderUnitPrice(Float.parseFloat(fields.get(3).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(4).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(5).getText()));
        //  orders.setSnack(fields.get(4).getText());
            
            
     
            
            try {
                dao.addOrder(orders);
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
               Orders orders = new Orders();
               OrdersDAO dao = new OrdersDAO();
            
            orders.setOrderSnackId(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0))));
            orders.setOrderQuantity(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 1))));
            orders.setOrderCost(Float.parseFloat(fields.get(2).getText()));
            orders.setOrderUnitPrice(Float.parseFloat(fields.get(3).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(4).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(5).getText()));
        //  orders.setSnack(fields.get(6).getText());

                try {
                    dao.updateOrder(orders);
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
               Orders orders = new Orders();
               OrdersDAO dao = new OrdersDAO();                
                orders.setOrderId((int) this.table.getValueAt(
                        this.table.getSelectedRow(), 0));
              /*  
                try {
                    dao.deleteOrder(orders.getId);
                } catch (SQLException ex) {
                    System.out.print(ex);
                }
                */
                this.readJTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Selecione um serviço na tabela abaixo!");
        }
    }
}
    



