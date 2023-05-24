/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import dao.LoginDao;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        txtSenhaVisivel.setVisible(false);
        btn_passwordOcultar.setVisible(false);
    }
    
    public boolean checkLogin(String login, String senha){
         return login.equals("usuario")&& senha.equals("123");
     }
    

    @SuppressWarnings("unchecked")
     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_passwordVisualizar = new javax.swing.JButton();
        btn_passwordOcultar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtSenhaVisivel = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        btnEntrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));
        setMaximumSize(new java.awt.Dimension(445, 635));
        setMinimumSize(new java.awt.Dimension(445, 635));
        setPreferredSize(new java.awt.Dimension(445, 635));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(25, 25));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/password.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 324, 20, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jPanel2.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel2.setMinimumSize(new java.awt.Dimension(38, 38));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 320, 38, 38));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        jPanel1.setMaximumSize(new java.awt.Dimension(38, 38));
        jPanel1.setMinimumSize(new java.awt.Dimension(38, 38));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 252, 38, 38));

        btn_passwordVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha oculta - resized.png"))); // NOI18N
        btn_passwordVisualizar.setBorderPainted(false);
        btn_passwordVisualizar.setContentAreaFilled(false);
        btn_passwordVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_passwordVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordVisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_passwordVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 324, 30, 30));

        btn_passwordOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha visualizar - resized.png"))); // NOI18N
        btn_passwordOcultar.setBorder(null);
        btn_passwordOcultar.setBorderPainted(false);
        btn_passwordOcultar.setContentAreaFilled(false);
        btn_passwordOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_passwordOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordOcultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_passwordOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 324, 30, 30));

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
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 320, 281, 38));

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
        getContentPane().add(txtSenhaVisivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 320, 281, 38));

        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setToolTipText("");
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
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 252, 281, 38));

        btnEntrar1.setBackground(new java.awt.Color(192, 192, 192));
        btnEntrar1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setText("ENTRAR");
        btnEntrar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192)));
        btnEntrar1.setContentAreaFilled(false);
        btnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar1.setMaximumSize(new java.awt.Dimension(93, 34));
        btnEntrar1.setMinimumSize(new java.awt.Dimension(93, 34));
        btnEntrar1.setOpaque(true);
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 375, 93, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 440, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Entrar - Aqui estamos realizando o login
    public void entrar (){
            if(!txtLogin.getText().isEmpty() && !txtSenha.getText().isEmpty()){
            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            
            
            LoginDao dao = new LoginDao();
            
            
            try {
                dao.loginSistema(login,senha);
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    
    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
        }
        txtSenhaVisivel.setText(txtSenha.getText());
    }//GEN-LAST:event_txtSenhaKeyPressed
int controle = 0;
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

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        // Senha visivel 
  
         txtSenhaVisivel.setText(txtSenha.getText());
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtSenhaVisivelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaVisivelKeyPressed
        // Senha visivel 
        
        txtSenha.setText(txtSenhaVisivel.getText());
    }//GEN-LAST:event_txtSenhaVisivelKeyPressed

    private void txtSenhaVisivelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaVisivelKeyReleased
       txtSenha.setText(txtSenhaVisivel.getText());
    }//GEN-LAST:event_txtSenhaVisivelKeyReleased

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaVisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaVisivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaVisivelActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        entrar();
    }//GEN-LAST:event_btnEntrar1ActionPerformed

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

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JButton btn_passwordOcultar;
    private javax.swing.JButton btn_passwordVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSenhaVisivel;
    // End of variables declaration//GEN-END:variables
}
