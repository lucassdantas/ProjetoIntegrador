/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Lucas Dantas
 */
public class PortionResultController {

    private List<javax.swing.JTextField> itemField = new ArrayList<>();
    private List<javax.swing.JTextField> qntField = new ArrayList<>();
    private List<javax.swing.JTextField> unityField = new ArrayList<>();
    private List<javax.swing.JTextField> costField = new ArrayList<>();

    public List<javax.swing.JTextField> getItemField() {
        return itemField;
    }

    public String getItemFieldValue(int index){
        return this.itemField.get(index).getText();
    }
    
    public void addItemField(javax.swing.JTextField field) {
        itemField.add(field);
    }

    public List<javax.swing.JTextField> getQntField(int index) {
        return qntField;
    }
    public String getQntFieldValue(int index){
        return this.qntField.get(index).getText();
    }
    public void addQntField(javax.swing.JTextField field) {
        qntField.add(field);
    }

    public List<javax.swing.JTextField> getUnityField(int index) {
        return unityField;
    }
    
    public String getUnityFieldValue(int index){
        return this.unityField.get(index).getText();
    }
    
    public void addUnityField(javax.swing.JTextField field) {
        unityField.add(field);
    }

    public List<javax.swing.JTextField> getCostField(int index) {
        return costField;
    }
    public String getCostFieldValue(int index){
        return this.costField.get(index).getText();
    }
    public void addCostField(javax.swing.JTextField field) {
        costField.add(field);
    }
}

 
