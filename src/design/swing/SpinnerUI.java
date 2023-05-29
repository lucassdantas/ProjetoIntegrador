/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.swing;

import java.awt.TextField;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSpinnerUI;

public class SpinnerUI extends BasicSpinnerUI {

    @Override
    public void installUI(JComponent c) {
    super.installUI(c); 
    
        JSpinner spinner = (JSpinner) c;
        spinner.setBorder(BorderFactory.createEmptyBorder()); 
        
        JComponent editor = spinner.getEditor();
        editor.setOpaque(false); 
    }

    
            
    public class Editor extends TextField implements ChangeListener{

        public Editor(JSpinner spinner){
            spinner.addChangeListener(this);
        }

        @Override
        public void stateChanged(ChangeEvent ce) {
            JSpinner spinner = (JSpinner) ce.getSource();
            setText(spinner.getValue().toString());
        }
        
    }
    
}
