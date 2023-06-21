
package controllers;

import dao.DataSheetDAO;
import dao.IngredientDAO;
import dao.OrdersDAO;
import dao.SnackDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
import views.spinner.Spinner;


public final class OrdersController {
    private JTable dsTable;
    private JTable orderTable;
    private final List<JTextField> fields;
    
    private List<Snack> snacks;
    private List<Ingredient> ingredients;
    private List<DataSheet> dataSheets;
    private List<DataSheet> currentDS;
    private List<ImageIcon> snackImages;
    
    private Ingredient ingredient;
    private Orders order;
    private JTextField totalField;
    private Spinner quantitySpinner;
    private Combobox comboBox;
    private JLabel snackPhotoLabel;
    public OrdersController() throws SQLException {
        this.snacks = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.dataSheets = new ArrayList<>();
        this.currentDS = new ArrayList<>();
        this.fields = new ArrayList<>();
        
        this.order = new Orders();
    }
    
    public void main() throws SQLException{
        this.readOrdersTable();
        this.searchDataSheet();
        this.searchSnack();
        this.searchIngredient();
        this.setComboBoxOptions();
        this.readDataSheetTable(this.comboBox.getSelectedIndex());
    }
    public void setItems(JTable dsTable, JTable orderTable, Combobox combobox, JTextField orderTotalValueField, Spinner spinner, JLabel photo){
        this.setDSJTable(dsTable);
        this.setOrderTable(orderTable);
        this.setComboBox(combobox);
        this.totalField = orderTotalValueField;
        this.quantitySpinner = spinner;
        this.snackPhotoLabel = photo;
        
    }
    public void search() throws SQLException{
        this.searchDataSheet();
        this.searchIngredient();
        this.searchSnack();
    }
    public void resetCombobox(){
        this.comboBox.removeAllItems();
    }
    public void resetAndUpdate() throws SQLException{
       // this.resetCombobox();
        this.search();
        this.setComboBoxOptions();
    }
    
    public void setComboBox(Combobox comboBox){
        this.comboBox = comboBox;
    }
    
    public void setDSJTable(JTable table){
        this.dsTable = table;
    }
    public void setOrderTable(JTable table){
        this.orderTable = table;
    }
    public void setSnacks(Snack snack){
        this.snacks.add(snack);
    }
    public void setIngredients(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
    public void setCurrentDS(DataSheet ds){
        this.currentDS.add(ds);
    }
    
    public List<Snack> getSnacks(){
        return this.snacks;
    }
    
    public void searchDataSheet() throws SQLException{
        DataSheetDAO dao = new DataSheetDAO();
        this.dataSheets = dao.readAllBySnack();
    }
    public void searchIngredient() throws SQLException{
        IngredientDAO dao = new IngredientDAO();
        for(int i = 0; i < dataSheets.size(); i++){
            this.ingredient = dao.searchById(dataSheets.get(i).getDsIngredientId());
            this.setIngredients(dataSheets.get(i).getIngredient());
        }
    }
    public void searchSnack() throws SQLException{
        SnackDAO dao = new SnackDAO();
        for(int i = 0; i < dataSheets.size(); i++){
            this.setSnacks(dao.searchById(dataSheets.get(i).getDsSnackId()));
        }
    }
    
    public JTable getDSJTable(){
        return this.dsTable;
    }
    public List<JTextField> getFields(){
        return this.fields;
    }
    
    public List<DataSheet> getCurrentDS(){
        return this.currentDS;
    }
    @SuppressWarnings("unchecked")
    public void setComboBoxOptions(){
        this.resetCombobox();
        for(int i = 0; i < this.dataSheets.size(); i++){
            this.comboBox.addItem(this.dataSheets.get(i).getSnack().getSnackTitle());
        }
        this.comboBox.setSelectedIndex(0);

       
    }
    @SuppressWarnings("unchecked")
    public void readDataSheetTable(int index) throws SQLException{
        if(index > this.dataSheets.size() || index < 0){
            index = 0 ;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) this.dsTable.getModel();        
        this.dsTable.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        this.order = new Orders();
        DataSheetDAO dao = new DataSheetDAO();
        
        this.currentDS = new ArrayList<>();
        
        
        int snackId = this.dataSheets.get(index).getDsSnackId();
        for (DataSheet dataSheet: dao.searchBySnackId(snackId)){
            this.currentDS.add(dataSheet);
            this.order.sumCost(dataSheet.getDsQuantity()* dataSheet.getIngredient().getIngredientUnitCost());
            
            model.addRow(new Object[]{
                dataSheet.getIngredient().getIngredientName(),
                dataSheet.getDsQuantity(),
                dataSheet.getIngredient().getIngredientUnitOfMeasure(),
            });
        } 
    }
    @SuppressWarnings("unchecked")
    public void readOrdersTable() throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.orderTable.getModel();        
        this.orderTable.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        OrdersDAO dao = new OrdersDAO();
        
        int i = 0;
        
            for (Orders orders: dao.readAll()){
                
                float OrderQuantity = orders.getOrderQuantity();
               
                model.addRow(new Object[]{
                    orders.getOrderId(),
                    orders.getOrderSnackName(),
                    orders.getOrderQuantity(),
                    orders.getOrderCost(),
                    orders.getOrderUnitPrice(),
                    orders.getOrderTotalPrice(),
                    orders.getOrderDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        
                });
                
                int OrderQuantityInterger;
                
                if( OrderQuantity % 1 == 0){
                    OrderQuantityInterger = (int) OrderQuantity;
                    model.setValueAt(OrderQuantityInterger, i, 2);
                }
                
            i++;
        }       
    }
    
    @SuppressWarnings("unchecked")
    public void readJTableSearch(String search) throws SQLException{
        
        DefaultTableModel model = (DefaultTableModel) this.dsTable.getModel();        
        this.dsTable.setRowSorter(new TableRowSorter(model));
        model.setNumRows(0);
        
        OrdersDAO dao = new OrdersDAO();
        int i = 0;
        
            for (Orders orders: dao.readAll()){
                
                float OrderQuantity = orders.getOrderQuantity();
               
                model.addRow(new Object[]{
                    orders.getOrderId(),
                    orders.getSnack().getSnackTitle(),
                    orders.getOrderQuantity(),
                    orders.getOrderCost(),
                    orders.getOrderUnitPrice(),
                    orders.getOrderTotalPrice(),
                    orders.getOrderDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                        
                });
                
                int OrderQuantityInterger;
                
                if( OrderQuantity % 1 == 0){
                    OrderQuantityInterger = (int) OrderQuantity;
                    model.setValueAt(OrderQuantityInterger, i, 2);
                }
                
            i++;
        }       
    }
    public void calcTotalValue(){
        int index = this.comboBox.getSelectedIndex();
        if(index > this.dataSheets.size() || index < 0){
            index = 0;
        }
        float snackValue =  this.dataSheets.get(index).getSnack().getSnackSellingPrice();
        this.totalField.setText(String.valueOf(Float.parseFloat(String.valueOf( this.quantitySpinner.getValue())) * snackValue));
    }
    public void setSnackImage(){
        int index = this.comboBox.getSelectedIndex();
        if(index > this.dataSheets.size() || index < 0){
            index = 0;
        }
        ImageIcon image = new ImageIcon(this.dataSheets.get(index).getSnack().getSnackImageUrl());
        this.snackPhotoLabel.setIcon(image);
    }
    
    public boolean buildSnack() throws SQLException{
        int index = this.comboBox.getSelectedIndex();
        Snack snack = this.snacks.get(index);
        Orders order = new Orders();
        float unitPrice = 0;
        
        
        LocalDate time = LocalDate.now();
        this.order.setOrderSnackId(snack.getId());
        this.order.setOrderSnackName(snack.getSnackTitle());
        this.order.setOrderQuantity(Integer.parseInt(String.valueOf(this.quantitySpinner.getValue())));
       // this.order.getOrderCost();
        this.order.setOrderUnitPrice((float) snack.getSnackSellingPrice());
        this.order.setOrderTotalPrice(Float.parseFloat(this.totalField.getText()));
        this.order.setOrderDate(time);
        
        IngredientDAO ingredientDAO = new IngredientDAO();
        DataSheetDAO dsDAO = new DataSheetDAO();
        
        //List<DataSheet> dsSnack = dsDAO.searchBySnackId(this.dataSheets.get(index).getSnack().getId());
        for(int i = 0; i < currentDS.size(); i++){
            int ingredientId = currentDS.get(i).getIngredient().getId();
            ingredientDAO.removeStock(currentDS.get(i).getDsQuantity(), ingredientId);
        }
        
        if(this.add(this.order)){
            return true;
        }else{
            return false;
        }
    }
    public void clean (List <javax.swing.JTextField> fields){
        fields.forEach((field) -> {
                field.setText("");
        });
        try {
            this.readOrdersTable();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao acessar o Banco de dador" + ex);
        }
    }

    public boolean add (Orders order) throws SQLException{
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
            OrdersDAO dao = new OrdersDAO();
            try {
                dao.addOrder(order);
                this.clean(this.fields);
                this.readOrdersTable();
                
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
            
            orders.setOrderSnackId(Integer.parseInt(String.valueOf(dsTable.getValueAt(dsTable.getSelectedRow(), 0))));
            orders.setOrderQuantity(Integer.parseInt(String.valueOf(dsTable.getValueAt(dsTable.getSelectedRow(), 1))));
            orders.setOrderCost(Float.parseFloat(fields.get(2).getText()));
            orders.setOrderUnitPrice(Float.parseFloat(fields.get(3).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(4).getText()));
            orders.setOrderTotalPrice(Float.parseFloat(fields.get(5).getText()));
        //  orders.setSnack(fields.get(6).getText());

                try {
                    dao.updateOrder(orders);
                    this.readOrdersTable();
                    return true;
                } catch (SQLException ex) {
                    System.out.print(ex);
                    return false;
                }
            }
        
        
    }
    public void delete() throws SQLException{
        if (this.dsTable.getSelectedRow() != -1){
            int answer = JOptionPane.showConfirmDialog(null,
                    "Confirma a Exclusão do Registro?", 
                    "Exclusão de Registro",OK_CANCEL_OPTION);
            if(answer == 0){
                Orders orders = new Orders();
                OrdersDAO dao = new OrdersDAO();                
                orders.setOrderId((int) this.dsTable.getValueAt(this.dsTable.getSelectedRow(), 0));
              /*  
                try {
                    dao.deleteOrder(orders.getId);
                } catch (SQLException ex) {
                    System.out.print(ex);
                }
                */
                this.readOrdersTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Selecione um serviço na tabela abaixo!");
        }
    }
}
    



