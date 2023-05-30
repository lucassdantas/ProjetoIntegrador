/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.text.area;

import views.styles.CustomButton;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Work.Studies
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Exemplo de JButton com CustomButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomButton customButton = new CustomButton("Meu Botão Personalizado");

        JButton jButton = new JButton();
        
        jButton.setOpaque(false); // Torna o botão opaco para que o estilo personalizado seja exibido
        jButton.setContentAreaFilled(false); // Remove o preenchimento da área de conteúdo
        jButton.setBorderPainted(false); // Remove a borda pintada

        jButton.add(customButton); // Adiciona o botão personalizado ao JButton

        frame.getContentPane().add(jButton);
        frame.pack();
        frame.setVisible(true);
    }
}
