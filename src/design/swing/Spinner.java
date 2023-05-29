/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.swing;

import javax.swing.JSpinner;

public class Spinner extends JSpinner {
    
    public Spinner(){
        setUI(new SpinnerUI());
    }
    
}
