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
    private List<String> itemFieldValue = new ArrayList<String>();
    private List<String> qntFieldValue = new ArrayList<String>();
    private List<String> unityFieldValue = new ArrayList<String>();
    private List<String> costFieldValue = new ArrayList<String>();
    private int quantityFieldValue;
    
    public PortionCalcController(){};
    public void clear(){
        this.costFieldValue = new ArrayList<String>();
        this.costFieldValue = new ArrayList<String>();
        this.costFieldValue = new ArrayList<String>();
        this.costFieldValue = new ArrayList<String>();
        this.quantityFieldValue = 0;
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
        return qntFieldValue;
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
