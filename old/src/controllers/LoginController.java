
package controllers;

import dao.UserDao;

/**
 *
 * @author Lucas Dantas
 */
public class LoginController {
 
    public void LoginController(javax.swing.JTextField txtLogin,javax.swing.JPasswordField txtSenha){
            if(!txtLogin.getText().isEmpty () && !txtSenha.getText().isEmpty()){
            
            String Login = txtLogin.getText();
            String Password = txtSenha.getText();
            
            UserDao dao = new UserDao();
            dao.userDao(Login,Password);
          }
    }
  }

