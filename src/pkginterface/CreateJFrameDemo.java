/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author manci
 */
public class CreateJFrameDemo extends JFrame {

    public static CreateJFrameDemo newInstance() {
        CreateJFrameDemo frame = new CreateJFrameDemo();
        frame.setTitle("CreateJFrameDemo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setLocationRelativeTo(null);
        return frame;
    }

    private CreateJFrameDemo() {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateJFrameDemo frame = CreateJFrameDemo.newInstance();
                frame.setVisible(true);
            }
        });
    }

}
