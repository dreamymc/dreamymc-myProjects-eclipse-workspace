package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		MyFrame frame = new MyFrame();
		MyLabel label = new MyLabel();

		frame.add(label);
		// frame.pack(); /*
//		prioritizes the "label" print -- use this or use setBounds and the Layout method
//		*/

	}

}
