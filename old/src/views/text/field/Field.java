/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.text.field;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.BorderFactory;
/**
 *
 * @author Work.Studies
 */
public class Field extends JTextField{
public static void main() {
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setMargin(new Insets(10, 10, 10, 10)); // Define o "padding interno" do TextField
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("SegoeUI Semibold", Font.PLAIN, 12));
        //textField.setBorder(BorderFactory.createEmptyBorder()); // Remove a borda de seleção padrão

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}
