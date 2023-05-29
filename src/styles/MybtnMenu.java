/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package styles;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
/**
 *
 * @author Work.Studies
 */
public class MybtnMenu extends JButton{
    private Color corBackground;
    private Color corBackgroundHover;
    private Color corBackgroundClick;
    private Color corFontPadrao;
    private Color corFontClick;
    private Color corBorda;
    private boolean isMouseEntered;

    public MybtnMenu() {
        super("");

        setBounds(100, 100, 150, 50);
        setOpaque(false);
        setContentAreaFilled(false);
        //setBorderPainted(false);
        setForeground(Color.decode("#6D6D6D"));
        setFont(new Font("SegoeUI", Font.BOLD, 20));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        //setBorder(new EmptyBorder(10, 20, 10, 20));
        
        corBackground = Color.decode("#D9D9D9");
        corBackgroundHover = Color.decode("#e5e5e5");
        corBackgroundClick = Color.decode("#e5e5e5");
        corBorda = Color.decode("#D3D3D3");
        corFontClick = Color.decode("#343434");
        corFontPadrao = Color.decode("#000000");
        isMouseEntered = false;
        
        setBorder(new LineBorder(corBorda));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                isMouseEntered = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isMouseEntered = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(corBackgroundClick);
            setForeground(corFontClick);
        } else if (isMouseEntered) {
            g.setColor(corBackgroundHover);
            setForeground(corFontPadrao);
            setBorder(new LineBorder(Color.decode("#b5b5b5")));
        } else {
            g.setColor(corBackground);
            setForeground(corFontPadrao);
            setBorder(new LineBorder(corBorda));
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
