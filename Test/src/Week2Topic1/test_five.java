package Week2Topic1;

import java.awt.Color;
import javax.swing.JFrame;

public class test_five {
    public static void main(String[] args) {
        String hexCode = "#FFC0CB";
        int colorValue = Integer.parseInt(hexCode.substring(1), 16);
        Color color = new Color(colorValue);
        
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(color);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}