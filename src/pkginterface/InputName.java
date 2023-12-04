/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author manci
 */
public class InputName {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String name = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
                
                if (name != null && name.length() >= 1) {
                    JOptionPane.showMessageDialog(null, "¡Hola " + name + "!");
                }
            }
        });
    }
}
