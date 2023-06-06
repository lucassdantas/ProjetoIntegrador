/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.styles;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Work.Studies
 */
public class CustomButton extends JButton {

    private Color defaultBackgroundColor;
    private Color hoverBackgroundColor;

    public CustomButton(String text) {
        super(text);
        
        setBackground(Color.decode("#d3d3d3"));
        setForeground(Color.BLACK);
        setFont(new Font("SegoeUI Semibold", Font.PLAIN, 12));
        
        setContentAreaFilled(true);
        setBorder(new EmptyBorder(10, 20, 10, 20));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorderPainted(true);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.decode("#d3d3d3"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Color.decode("#c0c0c0"));
            }
            
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        

        super.paintComponent(g);
    }


}
