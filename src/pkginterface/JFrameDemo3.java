/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author manci
 */
public class JFrameDemo3 {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JFrameDemo3");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setMinimumSize(new Dimension(400, 300));
            frame.setLocationRelativeTo(null);
            
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLUE);
            //frame.add(panel);
            //or
            frame.setContentPane(panel);
            
            frame.setVisible(true);
        });
    }
}
