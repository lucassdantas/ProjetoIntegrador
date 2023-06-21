/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.IngredientController;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Work.Studies
 */
public class IngredientAdd extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueEntrada
     */
    private final IngredientController ingredientController;

    public IngredientAdd() {
        initComponents();
        ingredientController = new IngredientController();
        //IconManager.setIcon(this);
        this.setIcon();
    }
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo icon program.png")));
    }
    public void setJTable(JTable table){
        this.ingredientController.setJTable(table);
    }
    public void searchFields(){
        this.ingredientController.setFields(ingredientNameField);
        this.ingredientController.setFields(ingredientCostField);
        this.ingredientController.setFields(ingredientUnityQuantityField);
        this.ingredientController.setFields(ingredientMinQuantityField);
        this.ingredientController.setFields(ingredientMediaField);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        ingredientNameField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        ingredientAddSaveButton = new views.styles.Mybtn();
        ingredientAddCancelButton = new views.styles.Mybtn();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        ingredientCostField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ingredientUnityQuantityField = new javax.swing.JTextField();
        ingredientMinQuantityField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        ingredientMediaField = new javax.swing.JTextField();
        ingredientAddPhoto = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

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

        ingredientNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientNameField.setName(""); // NOI18N
        ingredientNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientNameFieldActionPerformed(evt);
            }
        });
        panelEntradas1.add(ingredientNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Ingrediente");
        panelEntradas1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 30));

        ingredientAddSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        ingredientAddSaveButton.setText("SALVAR");
        ingredientAddSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ingredientAddSaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ingredientAddSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientAddSaveButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(ingredientAddSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 129, 40));

        ingredientAddCancelButton.setText("CANCELAR");
        ingredientAddCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientAddCancelButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(ingredientAddCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 129, 40));

        colorBtn19.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout colorBtn19Layout = new javax.swing.GroupLayout(colorBtn19);
        colorBtn19.setLayout(colorBtn19Layout);
        colorBtn19Layout.setHorizontalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorBtn19Layout.setVerticalGroup(
            colorBtn19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelEntradas1.add(colorBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 570, 10, 40));

        colorBtn20.setBackground(new java.awt.Color(117, 166, 119));

        javax.swing.GroupLayout colorBtn20Layout = new javax.swing.GroupLayout(colorBtn20);
        colorBtn20.setLayout(colorBtn20Layout);
        colorBtn20Layout.setHorizontalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorBtn20Layout.setVerticalGroup(
            colorBtn20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelEntradas1.add(colorBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 570, 10, 40));

        ingredientCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientCostField.setName(""); // NOI18N
        ingredientCostField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingredientCostFieldKeyTyped(evt);
            }
        });
        panelEntradas1.add(ingredientCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, 45));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Qnt. Unitária");
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel35.setText("Custo Unitário (R$)");
        panelEntradas1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 30));

        ingredientUnityQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientUnityQuantityField.setName(""); // NOI18N
        ingredientUnityQuantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingredientUnityQuantityFieldKeyTyped(evt);
            }
        });
        panelEntradas1.add(ingredientUnityQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 140, 45));

        ingredientMinQuantityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientMinQuantityField.setName(""); // NOI18N
        ingredientMinQuantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingredientMinQuantityFieldKeyTyped(evt);
            }
        });
        panelEntradas1.add(ingredientMinQuantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 140, 45));

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel36.setText("Qnt. Mínima");
        panelEntradas1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel37.setText("Und. Medida");
        panelEntradas1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 30));

        ingredientMediaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        ingredientMediaField.setName(""); // NOI18N
        ingredientMediaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingredientMediaFieldKeyTyped(evt);
            }
        });
        panelEntradas1.add(ingredientMediaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 140, 45));

        ingredientAddPhoto.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        ingredientAddPhoto.setForeground(new java.awt.Color(255, 255, 255));
        ingredientAddPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingredientAddPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productImages/default.jpg"))); // NOI18N
        ingredientAddPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingredientAddPhoto.setMaximumSize(new java.awt.Dimension(225, 225));
        panelEntradas1.add(ingredientAddPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 200, 200));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(126, 126, 126));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("recomendação: 200 x 200 pixels");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 70, 210, 30));

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
    
    private void ingredientAddCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientAddCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_ingredientAddCancelButtonActionPerformed

    private void ingredientAddSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientAddSaveButtonActionPerformed
        try {
            ingredientController.add(ingredientController.getFields());
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(IngredientEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingredientAddSaveButtonActionPerformed

    private void ingredientNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredientNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingredientNameFieldActionPerformed

    private void ingredientCostFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientCostFieldKeyTyped
            String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
    }                             
    }//GEN-LAST:event_ingredientCostFieldKeyTyped

    private void ingredientUnityQuantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientUnityQuantityFieldKeyTyped
           String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
    }                             
    }//GEN-LAST:event_ingredientUnityQuantityFieldKeyTyped

    private void ingredientMinQuantityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientMinQuantityFieldKeyTyped
           String caracteres = "0123456789.,";
         if (!caracteres.contains(evt.getKeyChar() + "")) {
             
              evt.consume();
    }                             
    }//GEN-LAST:event_ingredientMinQuantityFieldKeyTyped

    private void ingredientMediaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingredientMediaFieldKeyTyped
                         
    }//GEN-LAST:event_ingredientMediaFieldKeyTyped
    
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
            java.util.logging.Logger.getLogger(IngredientAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngredientAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngredientAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngredientAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngredientAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private views.styles.Mybtn ingredientAddCancelButton;
    private javax.swing.JLabel ingredientAddPhoto;
    private views.styles.Mybtn ingredientAddSaveButton;
    private javax.swing.JTextField ingredientCostField;
    private javax.swing.JTextField ingredientMediaField;
    private javax.swing.JTextField ingredientMinQuantityField;
    private javax.swing.JTextField ingredientNameField;
    private javax.swing.JTextField ingredientUnityQuantityField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEntradas1;
    // End of variables declaration//GEN-END:variables
}
