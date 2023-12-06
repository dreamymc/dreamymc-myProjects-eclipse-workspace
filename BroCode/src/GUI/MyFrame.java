package GUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
public class MyFrame extends JFrame {

	MyFrame() {
		
		this.setTitle("yate"); // title of the this
		this.setSize(500, 450); // size of this
		this.setVisible(true); // make this visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit
		this.setResizable(true); // make this resizable

		ImageIcon icon = new ImageIcon("vio.png");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(Color.white);	
		this.setLayout(null);
	}

}
