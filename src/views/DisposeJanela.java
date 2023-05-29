package views;

import javax.swing.JFrame;

public class DisposeJanela {
    public void fechar(){
    JFrame frame = new JFrame("");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true);
    frame.dispose();
    }
}


