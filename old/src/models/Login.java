/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author 42labinfo
 */
public class Login {
    
      //decraração dos atributos
    private String login;
    private String senha;
    
    
    // métodos construtores =  atalho=> (ctrl + espaço)
     public Login() {
    }
    
     public Login(String login,String senha ) {
        this.login = login;
        this. senha = senha;
    } 
     
    //metodos getters and setters =  atalho=> (alt + inset)

   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
}
