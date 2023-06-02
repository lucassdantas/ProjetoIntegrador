/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author 42labinfo
 */
public class PortionCalcController {
    private List<String> itemField = new ArrayList<String>();
    private List<String> qntField = new ArrayList<String>();
    private List<String> unityField = new ArrayList<String>();
    private List<String> costField = new ArrayList<String>();
    public PortionCalcController(){};
    
    public String checkField (String field){
        if (!field.isEmpty()){
            return field;
        } else{
            return "0";
        }
    }

    public ListIterator<String> getItemField() {
        return qntField.listIterator();
    }

    public void setItemField(String itemField) {
        this.itemField.add(itemField);
    }

    public ListIterator<String> getQntField() {
        return qntField.listIterator();
    }

    public void setQntField(String qntField) {
        this.qntField.add(qntField);
    }

    public ListIterator<String> getUnityField() {
        return qntField.listIterator();
    }

    public void setUnityField(String unityField) {
        this.unityField.add(unityField);
    }

    public ListIterator<String> getCostField() {
        return qntField.listIterator();
    }

    public void setCostField(String costField) {
        this.costField.add(costField);
    }
    
    
    
 
}
