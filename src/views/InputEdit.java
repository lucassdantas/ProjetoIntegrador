/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.InputController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import models.Ingredient;
import models.Input;
import models.Snack;

/**
 *
 * @author Work.Studies
 */
public class InputEdit extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueEntrada
     */
    private InputController inputController;
    public InputEdit() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        inputEditIdField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        inputEditIngredientField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        inputEditUnityOfMeasureField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        inputEditQuantityField = new javax.swing.JTextField();
        inputEditCostField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        inputEditDateField = new javax.swing.JTextField();
        inputEditCancelButton = new views.styles.Mybtn();
        inputEditSaveButton = new views.styles.Mybtn();

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

        inputEditIdField.setEditable(false);
        inputEditIdField.setBackground(new java.awt.Color(243, 243, 243));
        inputEditIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditIdField.setName(""); // NOI18N
        inputEditIdField.setOpaque(true);
        panelEntradas1.add(inputEditIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 45));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel31.setText("id");
        panelEntradas1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        inputEditIngredientField.setEditable(false);
        inputEditIngredientField.setBackground(new java.awt.Color(243, 243, 243));
        inputEditIngredientField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditIngredientField.setName(""); // NOI18N
        inputEditIngredientField.setOpaque(true);
        panelEntradas1.add(inputEditIngredientField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 300, 45));

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

        inputEditUnityOfMeasureField.setEditable(false);
        inputEditUnityOfMeasureField.setBackground(new java.awt.Color(243, 243, 243));
        inputEditUnityOfMeasureField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditUnityOfMeasureField.setName(""); // NOI18N
        inputEditUnityOfMeasureField.setOpaque(true);
        panelEntradas1.add(inputEditUnityOfMeasureField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 140, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Und. medida");
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 140, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Quantidade");
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 140, 30));

        inputEditQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditQuantityField.setName(""); // NOI18N
        panelEntradas1.add(inputEditQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 45));

        inputEditCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditCostField.setName(""); // NOI18N
        panelEntradas1.add(inputEditCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, 45));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel35.setText("Custo");
        panelEntradas1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("Data");
        panelEntradas1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 30));

        inputEditDateField.setEditable(false);
        inputEditDateField.setBackground(new java.awt.Color(243, 243, 243));
        inputEditDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        inputEditDateField.setName(""); // NOI18N
        inputEditDateField.setOpaque(true);
        panelEntradas1.add(inputEditDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 140, 45));

        inputEditCancelButton.setText("CANCELAR");
        inputEditCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEditCancelButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(inputEditCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 129, 40));

        inputEditSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        inputEditSaveButton.setText("SALVAR");
        inputEditSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inputEditSaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        inputEditSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEditSaveButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(inputEditSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 129, 40));

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

    private void inputEditCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEditCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_inputEditCancelButtonActionPerformed
    public void setController(InputController inputController){
        this.inputController = inputController;
        System.out.print(inputController.getIngredients().size());
    }
    private void inputEditSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEditSaveButtonActionPerformed
        try {
            this.inputController.update(this.inputController.getFields());
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(InputEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(InputEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputEditSaveButtonActionPerformed
    public void setJTable(JTable table){
        this.inputController.setJTable(table);
    }
    public void setIngredientModel(){
        this.inputController.setIngredient(inputController.getIngredients().get(inputController.getTable().getSelectedRow()));
    }
    public void setInputModel(){
        this.inputController.setInputModel(inputController.getInputs().get(inputController.getTable().getSelectedRow()));
    }
    public void searchFields(){
        this.inputController.resetFields();
        this.inputController.setFields(inputEditIdField);
        this.inputController.setFields(inputEditIngredientField);
        this.inputController.setFields(inputEditQuantityField);
        this.inputController.setFields(inputEditUnityOfMeasureField);
        this.inputController.setFields(inputEditCostField);
        this.inputController.setFields(inputEditDateField);
    }
    public void setFieldsValue(){
        this.inputController.setFieldsValue();
    }
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
            java.util.logging.Logger.getLogger(InputEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private views.styles.Mybtn inputEditCancelButton;
    private javax.swing.JTextField inputEditCostField;
    private javax.swing.JTextField inputEditDateField;
    private javax.swing.JTextField inputEditIdField;
    private javax.swing.JTextField inputEditIngredientField;
    private javax.swing.JTextField inputEditQuantityField;
    private views.styles.Mybtn inputEditSaveButton;
    private javax.swing.JTextField inputEditUnityOfMeasureField;
    private javax.swing.JDesktopPane jDesktopPane1;
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
