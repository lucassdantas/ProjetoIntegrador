/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import views.spinner.Spinner;

/**
 *
 * @author 42labinfo
 */
public class PortionCalcController {
    private List<JTextField> calcItemFieldValue = new ArrayList<>();
    private List<JTextField> calcQuantityFieldValue = new ArrayList<>();
    private List<JTextField> calcUnityFieldValue = new ArrayList<>();
    private List<JTextField> calcCostFieldValue = new ArrayList<>();
    
    private JTextField calcTotalCost;
    private JTextField calcPortionField;
    private int calcPortionQuantityFieldValue;
    
    
    private List<JTextField> resultItemField = new ArrayList<>();
    private List<JTextField> resultQuantityField = new ArrayList<>();
    private List<JTextField> resultUnityField = new ArrayList<>();
    private List<JTextField> resultCostField = new ArrayList<>();
    private Spinner resultPortionField;
    
    private List<String> resultQuantityFieldOriginalResult = new ArrayList<>();
    private List<String> resultCostFieldOriginalResult = new ArrayList<>();
    
    private JTextField resultUnitySnackFieldPrice;
    
    public PortionCalcController(){};
    
    public void clearCalcValues(){
        this.calcItemFieldValue = new ArrayList<>();
        this.calcQuantityFieldValue = new ArrayList<>();
        this.calcUnityFieldValue = new ArrayList<>();
        this.calcCostFieldValue = new ArrayList<>();
        this.calcPortionQuantityFieldValue = 0;
    }
    
    public float ruleOfThree(String stringQuantity, String stringCost){
        int spinnerValue = 1;
        try{
            spinnerValue = (int) resultPortionField.getValue();
        }catch(NullPointerException e){
            spinnerValue = 1;
        }
        
        float cost = Float.parseFloat(stringCost);
        float quantity = Float.parseFloat(stringQuantity);
        
        float value = ( cost * spinnerValue) / quantity;
        return value;
    }
    

   
//calc
    public void setCalcItemField(javax.swing.JTextField itemField) {
        if(!itemField.getText().isEmpty()){
            this.calcItemFieldValue.add(itemField);
        }else{
            itemField.setText(" ");
            this.calcItemFieldValue.add(itemField);
        }
    }
    public void setCalcQntField(JTextField qntField) {
        if(!qntField.getText().isEmpty()){
            this.calcQuantityFieldValue.add(qntField);
        }else{
            qntField.setText(" ");
            this.calcQuantityFieldValue.add(qntField);
        }
    }
    public void setCalcUnityField(JTextField unityField) {
        if(!unityField.getText().isEmpty()){
            this.calcUnityFieldValue.add(unityField);
        }else{
            unityField.setText(" ");
            this.calcUnityFieldValue.add(unityField);
        }
    }
    public void setCalcCostField(JTextField costField) {
        if(!costField.getText().isEmpty()){
            this.calcCostFieldValue.add(costField);
        }else{
            costField.setText("");
            this.calcCostFieldValue.add(costField);
        }
    }
    public void setCalcQuantityFieldValue(){
        if(!this.calcPortionField.getText().isEmpty() || calcPortionField.getText() != "0"){
            this.calcPortionQuantityFieldValue = Integer.parseInt(calcPortionField.getText());
        }else{
            this.calcPortionQuantityFieldValue = 1;
        }
    }
    public void setCalcPortionField(JTextField quantityField){
        this.calcPortionField = quantityField;
    }
    public void setCalcTotalCostField(JTextField field){
        this.calcTotalCost = field;
    }
    
    public List<JTextField> getCalcItemFieldValue() {
        return calcItemFieldValue;
    }
    public List<JTextField> getCalcQntFieldValue() {
        return calcQuantityFieldValue;
    }
    public List<JTextField> getCalcUnityFieldValue() {
        return calcUnityFieldValue;
    }
    public List<JTextField> getCalcCostFieldValue() {
        return calcCostFieldValue;
    }

    public int getPortionQuantityFieldValue(){
        return this.calcPortionQuantityFieldValue;
    }
    
    public float sumAllCalcCost(){
        float value = 0;
        for(int i = 0; i < this.calcCostFieldValue.size(); i++){
            try{
                value += Float.parseFloat(this.calcCostFieldValue.get(i).getText());
            }catch(NumberFormatException  E){
                
            }
        }
        
        return value;
    }
    public void multiplyValues(){
        this.setResultCostFieldValue();
        this.setResultQntFieldValue();
        /*
        for(int i = 0; i < this.resultCostField.size(); i++){
            if(!this.resultCostField.get(i).getText().isEmpty() || this.resultCostField.get(i).getText() == " "){
                String field = this.resultCostFieldOriginalResult.get(i);
                float value = Float.parseFloat(field) * (int) resultPortionField.getValue();
                resultCostField.get(i).setText(String.valueOf(value));                
            }
        }
        for(int i = 0; i < this.resultQuantityField.size(); i++){
            if(!resultQuantityField.get(i).getText().isEmpty() || resultQuantityField.get(i).getText() == " "){
                String field = this.resultQuantityFieldOriginalResult.get(i);
                float value = Float.parseFloat(field) * (int) resultPortionField.getValue();
                resultQuantityField.get(i).setText(String.valueOf(value));
            }
        }*/
    }
    
//result
    public void clearResultValues(){
        this.resultItemField = new ArrayList<>();
        this.resultQuantityField = new ArrayList<>();
        this.resultUnityField = new ArrayList<>();
        this.resultCostField = new ArrayList<>();
        //this.resultPortionField.setValue(1); 
    }
    public void setUnitySnackField(JTextField field){
        this.resultUnitySnackFieldPrice = field;
    }
    
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
    public Spinner getResultPortionField() {
         return resultPortionField;
    }
    
    public void setResultPortionField(Spinner resultPortionQuantity) {
        if((int) resultPortionQuantity.getValue() == 0 || resultPortionQuantity.getValue().toString().isEmpty()){
            resultPortionQuantity.setValue(Integer.valueOf(1));
        }else{
            
        }
        //this.resultPortionField = resultPortionQuantity;
        Integer v = 1;
        resultPortionQuantity.setValue(v);
        this.resultPortionField = resultPortionQuantity;
    }
    public void setResultItemFieldValue(){
        List<JTextField> itemField = this.getCalcItemFieldValue();
        for(int i = 0; i < itemField.size(); i++){
            this
            .getResultItemField()
            .get(i)
            .setText(itemField.get(i).getText());
        }
    }
    public void setResultQntFieldValue(){
        for(int i = 0; i< calcQuantityFieldValue.size(); i++){
            this.resultQuantityField.get(i).setText(calcQuantityFieldValue.get(i).getText());
        }
        this.setOriginalQuantityFieldValue();
    }
    public void setResultUnFieldValue(){
        List<JTextField> unityField = this.getCalcUnityFieldValue();
        for(int i = 0; i< unityField.size(); i++){
            this
            .getResultUnityField()
            .get(i)
            .setText(unityField.get(i).getText());
        }
    }
    public void setResultCostFieldValue(){
        List<JTextField> costField = this.getCalcCostFieldValue();
        for(int i = 0; i< costField.size(); i++){
            if(costField.get(i).getText().isEmpty() || costField.get(i).getText() == " "){
                this
                    .getResultCostField()
                    .get(i)
                    .setText(costField.get(i).getText());
            }else{
                this
                    .getResultCostField()
                    .get(i)
                    .setText(  
                    Float.toString(this.ruleOfThree(calcQuantityFieldValue.get(i).getText(), calcCostFieldValue.get(i).getText())));
            }
            
        }
        this.setOriginalCostFieldValue();
    }
    
    public void setOriginalCostFieldValue(){
        this.resultCostFieldOriginalResult = new ArrayList<>();
        for(int i = 0; i < resultCostField.size(); i++){
            this.resultCostFieldOriginalResult.add(String.valueOf(this.resultCostField.get(i)));
        }
    }
    public void setOriginalQuantityFieldValue(){
        this.resultQuantityFieldOriginalResult = new ArrayList<>();
        for(int i = 0; i < this.resultQuantityField.size(); i++){
            this.resultQuantityFieldOriginalResult.add(String.valueOf(resultQuantityField.get(i)));
        }
    }
    
    public void sumAllCostResult(){
        float value = 0;
        for(int i = 0; i < this.resultCostField.size(); i++){
            if(!resultCostField.get(i).getText().isEmpty() || resultCostField.get(i).getText() != " "){
                try{
                    value += Float.parseFloat(this.resultCostField.get(i).getText());
                }catch(NumberFormatException  E){

                }
            }
        }
        this.resultUnitySnackFieldPrice.setText( String.valueOf(value));
    }
}
