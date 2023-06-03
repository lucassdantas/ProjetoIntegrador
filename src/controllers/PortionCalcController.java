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
    public PortionCalcController(){};
    
    public String checkField (String field){
        if (!field.isEmpty()){
            return field;
        } else{
            return "0";
        }
    }

    public List<String> getItemFieldValue() {
        return qntFieldValue;
    }

    public void setItemField(String itemField) {
        this.itemFieldValue.add(itemField);
    }

    public List<String> getQntFieldValue() {
        return qntFieldValue;
    }

    public void setQntField(String qntField) {
        this.qntFieldValue.add(qntField);
    }

    public List<String> getUnityFieldValue() {
        return qntFieldValue;
    }

    public void setUnityField(String unityField) {
        this.unityFieldValue.add(unityField);
    }

    public List<String> getCostFieldValue() {
        return qntFieldValue;
    }

    public void setCostField(String costField) {
        this.costFieldValue.add(costField);
    }
    
    
    
 
}
