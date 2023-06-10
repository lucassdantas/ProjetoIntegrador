/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DataSheetController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Work.Studies
 */
public class DataSheetAdd extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueEntrada
     */
    private final DataSheetController dsController;

    public DataSheetAdd() {
        initComponents();
        dsController = new DataSheetController();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        dsSnackIdField = new javax.swing.JTextField();
        dsSnackIdSearchButton = new views.styles.Mybtn2();
        dsIngredientSearchButton = new views.styles.Mybtn2();
        jLabel31 = new javax.swing.JLabel();
        dsSnackNameField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        dsIngredientUnityQuantityField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        dsTotalCostField = new javax.swing.JTextField();
        dsIngredientNameField = new javax.swing.JTextField();
        dsIngredientSearchIdField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        dsUnityOfMeauseField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        dsUnityCostField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        dsIngredientUnityQuantitySpinner = new views.spinner.Spinner();
        jSeparator8 = new javax.swing.JSeparator();
        dsCancelButton = new views.styles.Mybtn();
        dsSaveButton = new views.styles.Mybtn();

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

        dsSnackIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsSnackIdField.setName(""); // NOI18N
        panelEntradas1.add(dsSnackIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, 45));

        dsSnackIdSearchButton.setText("OK");
        dsSnackIdSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsSnackIdSearchButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(dsSnackIdSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 50, 47, 45));

        dsIngredientSearchButton.setText("OK");
        dsIngredientSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsIngredientSearchButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(dsIngredientSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 190, 47, 45));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel31.setText("id");
        panelEntradas1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 100, 30));

        dsSnackNameField.setEditable(false);
        dsSnackNameField.setBackground(new java.awt.Color(243, 243, 243));
        dsSnackNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsSnackNameField.setName(""); // NOI18N
        dsSnackNameField.setOpaque(true);
        panelEntradas1.add(dsSnackNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 300, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("id Ingrediente");
        panelEntradas1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 30));

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

        dsIngredientUnityQuantityField.setEditable(false);
        dsIngredientUnityQuantityField.setBackground(new java.awt.Color(243, 243, 243));
        dsIngredientUnityQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsIngredientUnityQuantityField.setName(""); // NOI18N
        dsIngredientUnityQuantityField.setOpaque(true);
        panelEntradas1.add(dsIngredientUnityQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 140, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel33.setText("Qnt. Unitária");
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 140, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Quantidade");
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 140, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("Custo (R$)");
        panelEntradas1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 30));

        dsTotalCostField.setEditable(false);
        dsTotalCostField.setBackground(new java.awt.Color(243, 243, 243));
        dsTotalCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsTotalCostField.setName(""); // NOI18N
        dsTotalCostField.setOpaque(true);
        panelEntradas1.add(dsTotalCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 140, 45));

        dsIngredientNameField.setEditable(false);
        dsIngredientNameField.setBackground(new java.awt.Color(243, 243, 243));
        dsIngredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsIngredientNameField.setName(""); // NOI18N
        dsIngredientNameField.setOpaque(true);
        panelEntradas1.add(dsIngredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 300, 45));

        dsIngredientSearchIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsIngredientSearchIdField.setName(""); // NOI18N
        panelEntradas1.add(dsIngredientSearchIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, 45));

        jLabel30.setBackground(new java.awt.Color(103, 103, 103));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa 2.png"))); // NOI18N
        jLabel30.setOpaque(true);
        panelEntradas1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 45));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel37.setText("Ingrediente");
        panelEntradas1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, 30));

        dsUnityOfMeauseField.setEditable(false);
        dsUnityOfMeauseField.setBackground(new java.awt.Color(243, 243, 243));
        dsUnityOfMeauseField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsUnityOfMeauseField.setName(""); // NOI18N
        dsUnityOfMeauseField.setOpaque(true);
        panelEntradas1.add(dsUnityOfMeauseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 140, 45));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel38.setText("Und. medida");
        panelEntradas1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 140, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel39.setText("Custo unt. (R$)");
        panelEntradas1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 140, 30));

        dsUnityCostField.setEditable(false);
        dsUnityCostField.setBackground(new java.awt.Color(243, 243, 243));
        dsUnityCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsUnityCostField.setName(""); // NOI18N
        dsUnityCostField.setOpaque(true);
        panelEntradas1.add(dsUnityCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 140, 45));
        panelEntradas1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 830, 30));

        dsIngredientUnityQuantitySpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        dsIngredientUnityQuantitySpinner.setLabelText("");
        dsIngredientUnityQuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dsIngredientUnityQuantitySpinnerStateChanged(evt);
            }
        });
        dsIngredientUnityQuantitySpinner.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dsIngredientUnityQuantitySpinnerInputMethodTextChanged(evt);
            }
        });
        panelEntradas1.add(dsIngredientUnityQuantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 140, 45));
        panelEntradas1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 830, 30));

        dsCancelButton.setText("CANCELAR");
        dsCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsCancelButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(dsCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 129, 40));

        dsSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        dsSaveButton.setText("SALVAR");
        dsSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dsSaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsSaveButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(dsSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 129, 40));

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
        this.dsController.setJTable(table);
    }
    public void searchFields(){
        this.dsController.setSnackFields(dsSnackNameField);
        this.dsController.setIngredientFields(dsIngredientNameField);
        this.dsController.setIngredientFields(dsIngredientUnityQuantityField);
        this.dsController.setIngredientFields(dsUnityOfMeauseField);
        this.dsController.setIngredientFields(dsUnityCostField);
        this.dsController.setTotalValueField(dsTotalCostField);
        this.dsController.setDsQuantitySpinner(dsIngredientUnityQuantitySpinner);
    }
    private void dsCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_dsCancelButtonActionPerformed

    private void dsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsSaveButtonActionPerformed
        try {
            dsController.add(dsController.getIngredientFields(), dsController.getSnackFields(), dsController.getTotalValueField(), dsController.getDsQuantitySpinner());
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(IngredientEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dsSaveButtonActionPerformed

    private void dsSnackIdSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsSnackIdSearchButtonActionPerformed
        try {
            dsController.searchSnack(Integer.parseInt(dsSnackIdField.getText()));
            
        } catch (SQLException ex) {
            Logger.getLogger(DataSheetAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dsSnackIdSearchButtonActionPerformed

    private void dsIngredientSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsIngredientSearchButtonActionPerformed
        try {
            dsController.searchIngredient(Integer.parseInt(dsIngredientSearchIdField.getText()));
            
        } catch (SQLException ex) {
            Logger.getLogger(DataSheetAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dsIngredientSearchButtonActionPerformed

    private void dsIngredientUnityQuantitySpinnerInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dsIngredientUnityQuantitySpinnerInputMethodTextChanged
        dsController.calcTotalValue();
    }//GEN-LAST:event_dsIngredientUnityQuantitySpinnerInputMethodTextChanged

    private void dsIngredientUnityQuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dsIngredientUnityQuantitySpinnerStateChanged
        dsController.calcTotalValue();
    }//GEN-LAST:event_dsIngredientUnityQuantitySpinnerStateChanged

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
            java.util.logging.Logger.getLogger(DataSheetAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSheetAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSheetAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSheetAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSheetAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private views.styles.Mybtn dsCancelButton;
    private javax.swing.JTextField dsIngredientNameField;
    private views.styles.Mybtn2 dsIngredientSearchButton;
    private javax.swing.JTextField dsIngredientSearchIdField;
    private javax.swing.JTextField dsIngredientUnityQuantityField;
    private views.spinner.Spinner dsIngredientUnityQuantitySpinner;
    private views.styles.Mybtn dsSaveButton;
    private javax.swing.JTextField dsSnackIdField;
    private views.styles.Mybtn2 dsSnackIdSearchButton;
    private javax.swing.JTextField dsSnackNameField;
    private javax.swing.JTextField dsTotalCostField;
    private javax.swing.JTextField dsUnityCostField;
    private javax.swing.JTextField dsUnityOfMeauseField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel panelEntradas1;
    // End of variables declaration//GEN-END:variables
}
