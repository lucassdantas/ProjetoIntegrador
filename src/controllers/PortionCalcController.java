/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 42labinfo
 */
public class PortionCalcController {
    public List<String> fields = new ArrayList<String>();
    public PortionCalcController(){};
    public void checkField (String field){
        if (!field.isEmpty()){
            this.addField(field);
        } else{
            this.rmField(field);
        }
    };
    public void addField (String field){
        this.fields.add(field);
    };
    
    public void rmField(String field){
        this.fields.remove(field);
    }
}
