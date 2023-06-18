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
    
    private List<JTextField> resultItemField = new ArrayList<>();
    private List<JTextField> resultQuantityField = new ArrayList<>();
    private List<JTextField> resultUnityField = new ArrayList<>();
    private List<JTextField> resultCostField = new ArrayList<>();
    
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
    public float ruleOfThree(String value){
        float fValue;
        try{
            Float.parseFloat(value);
            fValue = Float.parseFloat(value);
            fValue = (fValue * this.portionQuantity) / this.currentPortionQuantity;
            return fValue;
        }catch(NumberFormatException e){
            return 0;
        }
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
        this.resultItemField = new ArrayList<>();
        this.resultQuantityField = new ArrayList<>();
        this.resultUnityField = new ArrayList<>();
        this.resultCostField = new ArrayList<>();
        
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

   
 
    
    
//calc
    public void setCalcItemField(javax.swing.JTextField itemField) {
        if(!itemField.getText().isEmpty()){
            this.itemFieldValue.add(itemField.getText());
        }else{
            this.itemFieldValue.add(" ");
        }
    }
    public void setCalcQntField(String qntField) {
        if(!qntField.isEmpty()){
            this.qntFieldValue.add(qntField);
        }else{
            this.qntFieldValue.add(" ");
        }
    }
    public void setCalcUnityField(String unityField) {
        if(!unityField.isEmpty()){
            this.unityFieldValue.add(unityField);
        }else{
            this.unityFieldValue.add(" ");
        }
    }
    public void setCalcCostField(String costField) {
        if(!costField.isEmpty()){
            this.costFieldValue.add(costField);
        }else{
            this.costFieldValue.add(" ");
        }
    }
    
    public List<String> getCalcItemFieldValue() {
        return itemFieldValue;
    }
    public List<String> getCalcQntFieldValue() {
        return qntFieldValue;
    }
    public List<String> getCalcUnityFieldValue() {
        return unityFieldValue;
    }
    public List<String> getCalcCostFieldValue() {
        return qntFieldValue;
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
 
    //result
    public void addResultItemField(javax.swing.JTextField field) {
        resultItemField.add(field);
    }
    public void addResultQntField(javax.swing.JTextField field) {
        resultQuantityField.add(field);
    }    
    public void addResultUnityField(javax.swing.JTextField field) {
        resultUnityField.add(field);
    }
    public void addResultCostField(javax.swing.JTextField field) {
        resultCostField.add(field);
    }
    
    public List<javax.swing.JTextField> getResultItemField() {
        return resultItemField;
    }
    public List<javax.swing.JTextField> getResultQuantityField() {
        return resultQuantityField;
    }
    public List<javax.swing.JTextField> getResultUnityField() {
        return resultUnityField;
    }
    public List<javax.swing.JTextField> getResultCostField() {
        return resultCostField;
    }
}