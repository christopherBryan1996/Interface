/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author manci
 */
public class MouseAdapterDemo extends JFrame {

    public MouseAdapterDemo(String title) {
        super(title);
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MouseAdapterDemo frame = new MouseAdapterDemo("Mouse Demo ");
                frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(400,300));
                frame.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.err.printf("mouseclic at (%d, %d)\n", e.getPoint().x, e.getPoint().y);
                    }
                });
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    
}
