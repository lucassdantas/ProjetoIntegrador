/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class User {
    
 
   private int login;
   private String password;
   
 
   //ctrl + espaço (construtores)
   public User() {
       
   }
   
   public User(int login, String password) {
       
       this.login = login;
       this.password = password;
     
   }
    
   
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   
 }   

