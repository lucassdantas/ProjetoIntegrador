/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.IngredientController;
import controllers.InputController;
import controllers.StockController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import models.Ingredient;

/**
 *
 * @author Work.Studies
 */
public class InputAdd extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueEntrada
     */
    InputController inputController;
    public InputAdd() {

        initComponents();
        IconManager.setIcon(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        inputAddSearchField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        inputAddIngredientNameField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        inputAddUnityOfMeasureField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        inputAddQuantityField = new javax.swing.JTextField();
        inputAddCostField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        inputAddDateField = new javax.swing.JTextField();
        inputAddCancelButton = new views.styles.Mybtn();
        inputAddSaveButton = new views.styles.Mybtn();
        inputAddSearchButton = new views.styles.Mybtn2();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaEntradas_entrada.setBackground(new java.awt.Color(255, 255, 255));
        areaEntradas_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        areaEntradas_entrada.setMaximumSize(new java.awt.Dimension(900, 650));
        areaEntradas_entrada.setMinimumSize(new java.awt.Dimension(900, 650));
        areaEntradas_entrada.setPreferredSize(new java.awt.Dimension(900, 650));
        areaEntradas_entrada.setVisible(true);
        areaEntradas_entrada.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEntradas1.setBackground(new java.awt.Color(255, 255, 255));
        panelEntradas1.setMaximumSize(new java.awt.Dimension(1690, 1020));
        panelEntradas1.setMinimumSize(new java.awt.Dimension(1690, 1020));
        panelEntradas1.setPreferredSize(new java.awt.Dimension(1690, 1020));
        panelEntradas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setBackground(new java.awt.Color(103, 103, 103));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel29.setOpaque(true);
        panelEntradas1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, 45));

        inputAddSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddSearchField.setName(""); // NOI18N
        panelEntradas1.add(inputAddSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 45));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel31.setText("id");
        panelEntradas1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        inputAddIngredientNameField.setEditable(false);
        inputAddIngredientNameField.setBackground(new java.awt.Color(243, 243, 243));
        inputAddIngredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddIngredientNameField.setName(""); // NOI18N
        inputAddIngredientNameField.setOpaque(true);
        panelEntradas1.add(inputAddIngredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Ingrediente");
        panelEntradas1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        colorBtn19.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout colorBtn19Layout = new javax.swing.GroupLayout(colorBtn19);
        colorBtn19.setLayout(colorBtn19Layout);
        colorBtn19Layout.setHorizontalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn19Layout.setVerticalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas1.add(colorBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 570, 10, 40));

        colorBtn20.setBackground(new java.awt.Color(117, 166, 119));

        javax.swing.GroupLayout colorBtn20Layout = new javax.swing.GroupLayout(colorBtn20);
        colorBtn20.setLayout(colorBtn20Layout);
        colorBtn20Layout.setHorizontalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        colorBtn20Layout.setVerticalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelEntradas1.add(colorBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 570, 10, 40));

        inputAddUnityOfMeasureField.setEditable(false);
        inputAddUnityOfMeasureField.setBackground(new java.awt.Color(243, 243, 243));
        inputAddUnityOfMeasureField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddUnityOfMeasureField.setName(""); // NOI18N
        inputAddUnityOfMeasureField.setOpaque(true);
        panelEntradas1.add(inputAddUnityOfMeasureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 140, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Und. medida");
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Quantidade");
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 140, 30));

        inputAddQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddQuantityField.setName(""); // NOI18N
        panelEntradas1.add(inputAddQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 45));

        inputAddCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddCostField.setName(""); // NOI18N
        panelEntradas1.add(inputAddCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, 45));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel35.setText("Custo");
        panelEntradas1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("Data");
        panelEntradas1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 30));

        inputAddDateField.setEditable(false);
        inputAddDateField.setBackground(new java.awt.Color(243, 243, 243));
        inputAddDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputAddDateField.setName(""); // NOI18N
        inputAddDateField.setOpaque(true);
        panelEntradas1.add(inputAddDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 140, 45));

        inputAddCancelButton.setText("CANCELAR");
        inputAddCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddCancelButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(inputAddCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 129, 40));

        inputAddSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        inputAddSaveButton.setText("SALVAR");
        inputAddSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputAddSaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        inputAddSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddSaveButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(inputAddSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 129, 40));

        inputAddSearchButton.setText("OK");
        inputAddSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddSearchButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(inputAddSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 50, 47, 47));

        areaEntradas_entrada.getContentPane().add(panelEntradas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 900, 660));

        jDesktopPane1.add(areaEntradas_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 940, 710));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setJTable(JTable table){
        this.inputController.setJTable(table);
    }
    public void setStockController(StockController controller){
        this.inputController.setStockController(controller);
    }
    public void setController (InputController controller){
        this.inputController = controller;
    }
    public void searchFields(){
        this.inputController.setFields(inputAddSearchField);
        this.inputController.setFields(inputAddIngredientNameField);
        this.inputController.setFields(inputAddQuantityField);
        this.inputController.setFields(inputAddUnityOfMeasureField);
        this.inputController.setFields(inputAddCostField);
        this.inputController.setFields(inputAddDateField);
    }
    public void setDateField(){
        this.inputController.setDateField();
    }
    public void setIngredientModel(Ingredient ingredient){
        this.inputController.setIngredients(ingredient);
    }
    
    private void inputAddCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddCancelButtonActionPerformed
       dispose();
    }//GEN-LAST:event_inputAddCancelButtonActionPerformed

    private void inputAddSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddSaveButtonActionPerformed
        try {
            this.inputController.add(inputController.getFields());
        } catch (SQLException ex) {
            Logger.getLogger(InputAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(InputAdd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inputAddSaveButtonActionPerformed

    private void inputAddSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddSearchButtonActionPerformed
        try {
            inputController.searchIngredient(Integer.parseInt(inputAddSearchField.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(DataSheetAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputAddSearchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InputAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private views.styles.Mybtn inputAddCancelButton;
    private javax.swing.JTextField inputAddCostField;
    private javax.swing.JTextField inputAddDateField;
    private javax.swing.JTextField inputAddIngredientNameField;
    private javax.swing.JTextField inputAddQuantityField;
    private views.styles.Mybtn inputAddSaveButton;
    private views.styles.Mybtn2 inputAddSearchButton;
    private javax.swing.JTextField inputAddSearchField;
    private javax.swing.JTextField inputAddUnityOfMeasureField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEntradas1;
    // End of variables declaration//GEN-END:variables
}
