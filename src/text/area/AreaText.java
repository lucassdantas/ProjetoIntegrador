/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.area;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import design.swing.ScrollBar;
import design.swing.ScrollBarCustom;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaText extends JTextArea {


    public AreaText() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setBackground(Color.WHITE);
        setForeground(Color.decode("#343434"));
        setFont(new Font("SegoeUI Semibold", 5, 12));
        setMargin(new Insets(10, 10, 10, 10)); 
    }

    public void fixTextArea(JScrollPane scroll) {
        scroll.setBorder(null);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        scroll.getVerticalScrollBar().setBackground(Color.WHITE);
        scroll.getViewport().setBackground(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }


}
