/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import AppPackage.AnimationClass;
import controllers.SnackController;
import dao.SnackDAO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import models.Snack;

/**
 *
 * @author Work.Studies
 */
public class SnackAdd extends javax.swing.JFrame {

    
AnimationClass ac = new AnimationClass();


//Instanciar objeto para o fluxo de bytes.
  private FileInputStream fis;
  
//variavel global para armazebar o tamanho da imagem(bytes)
private int tamanho;     

    
    private SnackController snackController;
    public SnackAdd() {
        initComponents();
        this.snackController = new SnackController();
        IconManager.setIcon(this);
    }
    public void setJTable(JTable table){
        this.snackController.setJTable(table);
    }
    public void searchFields(){
        this.snackController.setFields(snackNameField);
        this.snackController.setFields(snackSellingPriceField);
        this.snackController.setTextArea(snackDescriptionField);
    }
    
    private void carregarFoto(){
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens(*.PNG, *.JPG,*.JPEG","png","jpg", "jpeg"));
        jfc.showOpenDialog(this);
        int resultado = jfc.showOpenDialog(this);
        if(resultado == JFileChooser.APPROVE_OPTION) {
            try{
                fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(foto));               
                lblFoto.updateUI();
            } catch (Exception e ) {
                System.out.println(e);
            }
        }
    }     
    
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        areaEntradas_entrada = new javax.swing.JInternalFrame();
        panelEntradas1 = new javax.swing.JPanel();
        snackNameField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        colorBtn19 = new javax.swing.JPanel();
        colorBtn20 = new javax.swing.JPanel();
        snackSellingPriceField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        snackDescriptionField = new views.text.area.AreaText();

        fotoVP = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();

        jLabel35 = new javax.swing.JLabel();
        carregarFoto = new javax.swing.JButton();
        snackCancelButton = new views.styles.Mybtn();
        snackSaveButton = new views.styles.Mybtn();

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

        snackNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackNameField.setName(""); // NOI18N
        panelEntradas1.add(snackNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 45));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel32.setText("Produtos/lanche");
        panelEntradas1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, 30));

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

        snackSellingPriceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackSellingPriceField.setName(""); // NOI18N
        panelEntradas1.add(snackSellingPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, 45));

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(126, 126, 126));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("recomendação: 200 x 200 pixels");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelEntradas1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 70, 210, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel34.setText("Descrição");
        panelEntradas1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 30));

        snackDescriptionField.fixTextArea(jScrollPane1);
        snackDescriptionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        snackDescriptionField.setColumns(20);
        snackDescriptionField.setRows(5);
        snackDescriptionField.setMaximumSize(new java.awt.Dimension(232, 18));
        jScrollPane1.setViewportView(snackDescriptionField);

        panelEntradas1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 450, 120));

        lblFoto.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setText("FOTO");
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);


        javax.swing.GroupLayout fotoVPLayout = new javax.swing.GroupLayout(fotoVP);
        fotoVP.setLayout(fotoVPLayout);
        fotoVPLayout.setHorizontalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        fotoVPLayout.setVerticalGroup(
            fotoVPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)

        );

        panelEntradas1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel35.setText("Preço de venda (R$)");
        panelEntradas1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 30));

        carregarFoto.setBackground(new java.awt.Color(246, 246, 246));
        carregarFoto.setForeground(new java.awt.Color(126, 126, 126));
        carregarFoto.setText("escolher arquivo");
        carregarFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        carregarFoto.setContentAreaFilled(false);
        carregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carregarFoto.setOpaque(true);
        carregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarFotoActionPerformed(evt);
            }
        });
        panelEntradas1.add(carregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 320, 120, 23));

        snackCancelButton.setText("CANCELAR");
        snackCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackCancelButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(snackCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 129, 40));

        snackSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check mark.png"))); // NOI18N
        snackSaveButton.setText("SALVAR");
        snackSaveButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snackSaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        snackSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snackSaveButtonActionPerformed(evt);
            }
        });
        panelEntradas1.add(snackSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 129, 40));

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

    private void snackCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackCancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_snackCancelButtonActionPerformed

    private void snackSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snackSaveButtonActionPerformed
        try {
            snackController.add(snackController.getFields(), snackController.getTextArea());
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(IngredientEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_snackSaveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarFotoActionPerformed
        JButton selecionarImagemButton = carregarFoto;
        selecionarImagemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();
                        String filePath = selectedFile.getPath();
                        
                        int id = Integer.parseInt((String) snackController.getTable().getValueAt(snackController.getTable().getSelectedRow(), 0));
                        SnackDAO snackDAO;
                        Snack snackModel = new Snack();
                        snackModel.setSnackImageUrl(filePath);
                        snackModel.setId(id);
                    try {
                        snackDAO = new SnackDAO();
                        snackDAO.addImageUrl(snackModel);

                    } catch (SQLException ex) {
                        Logger.getLogger(SnackAdd.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        System.out.println(filePath); // working
                    }
                }
        });
            carregarFoto();
    }//GEN-LAST:event_carregarFotoActionPerformed

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
            java.util.logging.Logger.getLogger(SnackAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnackAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnackAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnackAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SnackAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame areaEntradas_entrada;
    private javax.swing.JButton carregarFoto;
    private javax.swing.JPanel colorBtn19;
    private javax.swing.JPanel colorBtn20;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel lblFoto;

    private javax.swing.JPanel panelEntradas1;
    private views.styles.Mybtn snackCancelButton;
    private views.text.area.AreaText snackDescriptionField;
    private javax.swing.JTextField snackNameField;
    private views.styles.Mybtn snackSaveButton;
    private javax.swing.JTextField snackSellingPriceField;
    // End of variables declaration//GEN-END:variables
}
