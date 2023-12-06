package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class MyLabel extends JLabel {

	MyLabel(){
		ImageIcon unknown = new ImageIcon("unknown.png");
		Border border = BorderFactory.createLineBorder(Color.yellow, 3);
		JLabel label = new JLabel(); // create label
		this.setIcon(unknown);
		this.setHorizontalTextPosition(JLabel.RIGHT);
		this.setVerticalTextPosition(JLabel.TOP);
		this.setForeground(Color.black);
		this.setFont(new Font("Cambria", Font.ITALIC, 25));
		this.setIconTextGap(50);
		this.setBackground(Color.pink);
		this.setOpaque(true);
		this.setBorder(border);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setText("hii "); // set text of this
		this.setBounds(0, 0, 350, 350); // set x, y position within frame
	}
}
