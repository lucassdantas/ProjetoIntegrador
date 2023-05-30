/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.text.area;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Work.Studies
 */
public class NewClass extends JButton {

    private Color defaultBackgroundColor;
    private Color hoverBackgroundColor;
    private boolean isMouseEntered;

    public NewClass() {
       

        super("");

        setBounds(100, 100, 150, 50);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setForeground(Color.red);
        setFont(new Font("SegoeUI Semibold", Font.PLAIN, 12));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBorder(new EmptyBorder(10, 20, 10, 20));

        defaultBackgroundColor = Color.decode("#000000");
        hoverBackgroundColor = Color.decode("#C0C0C0");
        isMouseEntered = false;

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
            g.setColor(Color.decode("#FFFFFF"));
        } else if (isMouseEntered) {
            g.setColor(hoverBackgroundColor);
        } else {
            g.setColor(defaultBackgroundColor);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Botão Personalizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        NewClass myButton = new NewClass();
        frame.add(myButton);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
   
    }



