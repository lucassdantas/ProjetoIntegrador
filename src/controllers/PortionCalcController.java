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
    private List<String> calcItemFieldValue = new ArrayList<String>();
    private List<String> calcQuantityFieldValue = new ArrayList<String>();
    private List<String> calcUnityFieldValue = new ArrayList<String>();
    private List<String> calcCostFieldValue = new ArrayList<String>();
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
    private int resultPortionQuantity; 
    
    public PortionCalcController(){};
    
    public void clearValues(){
        this.calcItemFieldValue = new ArrayList<String>();
        this.calcQuantityFieldValue = new ArrayList<String>();
        this.calcUnityFieldValue = new ArrayList<String>();
        this.calcCostFieldValue = new ArrayList<String>();
        this.quantityFieldValue = 0;
    }
    public float ruleOfThree(Float value){
        value = (value * this.portionQuantity) / this.resultPortionQuantity;
        return value;
       
    }
  
    public void setResultPortionQuantity(int resultPortionQuantity) {
        System.out.print(resultPortionQuantity);
        if(resultPortionQuantity <= 0){
            this.resultPortionQuantity = 1;
        }
        else{
            this.resultPortionQuantity = resultPortionQuantity;
        }
    }
    public void setItemQuantityStringToInt(String itemQuantity){
        this.itemQuantity = Float.parseFloat(itemQuantity);
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public void setPortionQuantity(int portionQuantity) {
        this.portionQuantity = portionQuantity;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setUnityValue(String unityValue) {
        this.unityValue = unityValue;
    }
    
    public int getPortionQuantity() {
        return portionQuantity;
    }
    public int getResultPortionQuantity() {
         return resultPortionQuantity;
     }
    public float getItemQuantity() {
        return itemQuantity;
        
    }
    public float getCost() {
        return cost;
    }
    public String getUnityValue() {
        return unityValue;
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
        this.resultPortionQuantity = 0; 
    }
   
//calc
    public void setCalcItemField(javax.swing.JTextField itemField) {
        if(!itemField.getText().isEmpty()){
            this.calcItemFieldValue.add(itemField.getText());
        }else{
            this.calcItemFieldValue.add(" ");
        }
    }
    public void setCalcQntField(String qntField) {
        if(!qntField.isEmpty()){
            this.calcQuantityFieldValue.add(qntField);
        }else{
            this.calcQuantityFieldValue.add(" ");
        }
    }
    public void setCalcUnityField(String unityField) {
        if(!unityField.isEmpty()){
            this.calcUnityFieldValue.add(unityField);
        }else{
            this.calcUnityFieldValue.add(" ");
        }
    }
    public void setCalcCostField(String costField) {
        if(!costField.isEmpty()){
            this.calcCostFieldValue.add(costField);
        }else{
            this.calcCostFieldValue.add(" ");
        }
    }
    
    public List<String> getCalcItemFieldValue() {
        return calcItemFieldValue;
    }
    public List<String> getCalcQntFieldValue() {
        return calcQuantityFieldValue;
    }
    public List<String> getCalcUnityFieldValue() {
        return calcUnityFieldValue;
    }
    public List<String> getCalcCostFieldValue() {
        return calcQuantityFieldValue;
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
    
    public void setResultItemFieldValue(){
        List<String> itemField = this.getCalcItemFieldValue();
        for(int i = 0; i < itemField.size(); i++){
            this
            .getResultItemField()
            .get(i)
            .setText(itemField.get(i));
        }
    }
    public void setResultQntFieldValue(){
        List<String> qntField = this.getCalcQntFieldValue();
        for(int i = 0; i< qntField.size(); i++){
            if(qntField.get(i).isEmpty() || qntField.get(i) == " "){
                this
                    .getResultQuantityField()
                    .get(i)
                    .setText(qntField.get(i));
            }else{
                this
                    .getResultQuantityField()
                    .get(i)
                    .setText(Float.toString(this.ruleOfThree(Float.parseFloat(qntField.get(i)))));
            }
            
        }
    }
    public void setResultUnFieldValue(){
        float result = 0; 
        List<String> unityField = this.getCalcUnityFieldValue();
        for(int i = 0; i< unityField.size(); i++){
            this
            .getResultUnityField()
            .get(i)
            .setText(unityField.get(i));
        }
    }
    public void setResultCostFieldValue(){
        List<String> costField = this.getCalcCostFieldValue();
        for(int i = 0; i< costField.size(); i++){
            if(costField.get(i).isEmpty() || costField.get(i) == " "){
                this
                    .getResultCostField()
                    .get(i)
                    .setText(costField.get(i));
            }else{
                this
                    .getResultCostField()
                    .get(i)
                    .setText(Float.toString(this.ruleOfThree(Float.parseFloat(costField.get(i)))));
            }
            
        }
    }
}
