/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package views;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Work.Studies
 */
public class IconManager {
    private static final String DEFAULT_ICON_PATH = "../img/logo icon white.png";
    
    public static void setIcon(JFrame frame) {
        ImageIcon icon = new ImageIcon(IconManager.class.getResource(DEFAULT_ICON_PATH));
        frame.setIconImage(icon.getImage());
    }
}
