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
 * @author 42labinfo
 */
public class PortionCalcController {
    private List<String> itemFieldValue = new ArrayList<String>();
    private List<String> qntFieldValue = new ArrayList<String>();
    private List<String> unityFieldValue = new ArrayList<String>();
    private List<String> costFieldValue = new ArrayList<String>();
    private int quantityFieldValue;
    
    private List<JTextField> itemField = new ArrayList<>();
    private List<JTextField> qntField = new ArrayList<>();
    private List<JTextField> unityField = new ArrayList<>();
    private List<JTextField> costField = new ArrayList<>();
    
    //toCalc
    private float itemQuantity;
    private String unityValue;
    private float cost;
    private int portionQuantity;
    private int currentPortionQuantity; 
    
    public PortionCalcController(){};
    public void clearValues(){
        this.itemFieldValue = new ArrayList<String>();
        this.qntFieldValue = new ArrayList<String>();
        this.unityFieldValue = new ArrayList<String>();
        this.costFieldValue = new ArrayList<String>();
        this.quantityFieldValue = 0;
    }
    public float ruleOfThree(float value){
        if (value == 0){
            return 0;
        }
        float result = (value * this.portionQuantity) / this.currentPortionQuantity;
        return result;
    }

    public int getCurrentPortionQuantity() {
        return currentPortionQuantity;
    }

    public void setCurrentPortionQuantity(int currentPortionQuantity) {
        System.out.print(currentPortionQuantity);
        if(currentPortionQuantity <= 0){
            this.currentPortionQuantity = 1;
        }
        else{
            this.currentPortionQuantity = currentPortionQuantity;
        }
    }
    
    public int getPortionQuantity() {
        return portionQuantity;
    }

    public void setPortionQuantity(int portionQuantity) {
        this.portionQuantity = portionQuantity;
    }
    
    public void clear(){
        this.itemField = new ArrayList<>();
        this.qntField = new ArrayList<>();
        this.unityField = new ArrayList<>();
        this.costField = new ArrayList<>();
        
        this.itemQuantity = 0;
        this.unityValue = "0";
        this.cost = 0;
        this.portionQuantity = 0;
        this.currentPortionQuantity = 0; 
    }
    public float getItemQuantity() {
        return itemQuantity;
        
    }
    
    public void setItemQuantityStringToInt(String itemQuantity){
        this.itemQuantity = Float.parseFloat(itemQuantity);
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getUnityValue() {
        return unityValue;
    }

    public void setUnityValue(String unityValue) {
        this.unityValue = unityValue;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
    //buttons
    public List<javax.swing.JTextField> getItemField() {
        return itemField;
    }

    public void addItemField(javax.swing.JTextField field) {
        itemField.add(field);
    }

    public List<javax.swing.JTextField> getQntField() {
        return qntField;
    }
   
    public void addQntField(javax.swing.JTextField field) {
        qntField.add(field);
    }

    public List<javax.swing.JTextField> getUnityField() {
        return unityField;
    }
    
   
    
    public void addUnityField(javax.swing.JTextField field) {
        unityField.add(field);
    }

    public List<javax.swing.JTextField> getCostField() {
        return costField;
    }
   
    public void addCostField(javax.swing.JTextField field) {
        costField.add(field);
    }
    
    

    public void setItemField(javax.swing.JTextField itemField) {
        if(!itemField.getText().isEmpty()){
            this.itemFieldValue.add(itemField.getText());
        }else{
            this.itemFieldValue.add("0");
        }
    }
    
    public List<String> getItemFieldValue() {
        return itemFieldValue;
    }
    
    public List<String> getQntFieldValue() {
        return qntFieldValue;
    }

    public void setQntField(String qntField) {
        if(!qntField.isEmpty()){
            this.qntFieldValue.add(qntField);
        }else{
            this.qntFieldValue.add("0");
        }
    }

    public List<String> getUnityFieldValue() {
        return unityFieldValue;
    }

    public void setUnityField(String unityField) {
        if(!unityField.isEmpty()){
            this.unityFieldValue.add(unityField);
        }else{
            this.unityFieldValue.add("0");
        }
    }

    public List<String> getCostFieldValue() {
        return qntFieldValue;
    }

    public void setCostField(String costField) {
        if(!costField.isEmpty()){
            this.costFieldValue.add(costField);
        }else{
            this.costFieldValue.add("0");
        }
    }
    public void setQuantityFieldValue(String quantityFieldValue){
        if(!quantityFieldValue.isEmpty()){
            this.quantityFieldValue = Integer.parseInt(quantityFieldValue);
        }else{
            this.quantityFieldValue = 1;
        }
    }
    
    public int getPortionQuantityFieldValue(){
        return this.quantityFieldValue;
    }
 
}