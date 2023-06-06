/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
//import dao.LoginDao;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        txtSenhaVisivel.setVisible(false);
        btn_passwordOcultar.setVisible(false);
    }
    
    /*public boolean checkLogin(String login, String senha){
         return login.equals("usuario")&& senha.equals("123");
     }*/
        public void entrar (){
            if(!txtLogin.getText().isEmpty() && !txtSenha.getText().isEmpty()){
            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            /*
            LoginDao dao = new LoginDao(this);
            
            try {
                dao.loginSistema(login,senha);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
}
    

    @SuppressWarnings("unchecked")
     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnEntrar = new views.styles.Mybtn3();
        iconUser = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        btn_passwordVisualizar = new javax.swing.JButton();
        btn_passwordOcultar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtSenhaVisivel = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCopyright = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));
        setMaximumSize(new java.awt.Dimension(460, 630));
        setMinimumSize(new java.awt.Dimension(460, 630));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 360, 93, 34));

        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        iconUser.setToolTipText("");
        iconUser.setMaximumSize(new java.awt.Dimension(25, 25));
        iconUser.setMinimumSize(new java.awt.Dimension(25, 25));
        iconUser.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel3.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 245, 20, 30));

        iconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        iconPassword.setMaximumSize(new java.awt.Dimension(25, 25));
        iconPassword.setMinimumSize(new java.awt.Dimension(25, 25));
        iconPassword.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel3.add(iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 305, 20, 30));

        btn_passwordVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/senha visualizar - resized.png"))); // NOI18N
        btn_passwordVisualizar.setBorderPainted(false);
        btn_passwordVisualizar.setContentAreaFilled(false);
        btn_passwordVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_passwordVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordVisualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_passwordVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 305, 30, 30));

        btn_passwordOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/senha oculta - resized.png"))); // NOI18N
        btn_passwordOcultar.setBorder(null);
        btn_passwordOcultar.setBorderPainted(false);
        btn_passwordOcultar.setContentAreaFilled(false);
        btn_passwordOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_passwordOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordOcultarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_passwordOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 305, 30, 30));

        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtSenha.setMaximumSize(new java.awt.Dimension(281, 38));
        txtSenha.setMinimumSize(new java.awt.Dimension(281, 38));
        txtSenha.setPreferredSize(new java.awt.Dimension(281, 38));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        jPanel3.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 290, -1));

        txtSenhaVisivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtSenhaVisivel.setMaximumSize(new java.awt.Dimension(281, 38));
        txtSenhaVisivel.setMinimumSize(new java.awt.Dimension(281, 38));
        txtSenhaVisivel.setPreferredSize(new java.awt.Dimension(281, 38));
        txtSenhaVisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaVisivelActionPerformed(evt);
            }
        });
        txtSenhaVisivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaVisivelKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaVisivelKeyReleased(evt);
            }
        });
        jPanel3.add(txtSenhaVisivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 290, -1));

        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        txtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLogin.setMargin(new java.awt.Insets(15, 15, 15, 15));
        txtLogin.setMaximumSize(new java.awt.Dimension(281, 38));
        txtLogin.setMinimumSize(new java.awt.Dimension(281, 38));
        txtLogin.setSelectionStart(50);
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel3.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 290, 38));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jPanel1.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel1.setMinimumSize(new java.awt.Dimension(38, 38));
        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 38, 38));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jPanel2.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel2.setMinimumSize(new java.awt.Dimension(38, 38));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 38, 38));

        lblCopyright.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Copyright © 2023. Todos os direitos reservados ·Privacy·Terms");
        lblCopyright.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg login.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 460, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaVisivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaVisivelKeyReleased
        txtSenha.setText(txtSenhaVisivel.getText());
    }//GEN-LAST:event_txtSenhaVisivelKeyReleased

    private void txtSenhaVisivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaVisivelKeyPressed
        txtSenha.setText(txtSenhaVisivel.getText());
    }//GEN-LAST:event_txtSenhaVisivelKeyPressed

    private void txtSenhaVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaVisivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaVisivelActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        entrar();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        txtSenhaVisivel.setText(txtSenha.getText());
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        }
        txtSenhaVisivel.setText(txtSenha.getText());
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
       entrar();
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btn_passwordOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passwordOcultarActionPerformed
        btn_passwordOcultar.setVisible(false);
        btn_passwordVisualizar.setVisible(true);

        if(controle == 0){
            txtSenha.setVisible(false);
            txtSenhaVisivel.setVisible(true);

            controle = 1;
        }
        // Deixa a senha invisivel..
        else{
            txtSenha.setVisible(true);
            txtSenhaVisivel.setVisible(false);
            controle = 0;
        }
    }//GEN-LAST:event_btn_passwordOcultarActionPerformed

    private void btn_passwordVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passwordVisualizarActionPerformed
        btn_passwordVisualizar.setVisible(false);
        btn_passwordOcultar.setVisible(true);

        // Deixa a senha  visivel..

        if(controle == 0){
            txtSenha.setVisible(false);
            txtSenhaVisivel.setVisible(true);
            controle = 1;
        }
        // Deixa a senha invisivel..
        else{
            txtSenha.setVisible(true);
            txtSenhaVisivel.setVisible(false);
            controle = 0;
        }
    }//GEN-LAST:event_btn_passwordVisualizarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    //Entrar - Aqui estamos realizando o login

    int controle = 0;
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new TelaLogin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.styles.Mybtn3 btnEntrar;
    private javax.swing.JButton btn_passwordOcultar;
    private javax.swing.JButton btn_passwordVisualizar;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSenhaVisivel;
    // End of variables declaration//GEN-END:variables
}
