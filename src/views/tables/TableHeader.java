package views.tables;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {

    private int verticalLineThickness; 

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.decode("#454545"));
        setFont(new Font("SegoeUI Semibold", 1, 13));
        setForeground(Color.decode("#FFFFFF"));
        setBorder(new EmptyBorder(10, 5, 10, 5));

        verticalLineThickness = 3; 
    }

    public void setVerticalLineThickness(int thickness) {
        this.verticalLineThickness = thickness;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.fillRect(getWidth() - verticalLineThickness, 0, verticalLineThickness, getHeight());
    }
}

