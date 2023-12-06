import java.awt.*;
import javax.swing.*;

public class test {
	private JFrame frame;
	private JLabel label1;
	private JLabel label2;
	private JPanel panel;
	private JTextField text1;
	private JTextField text2;
	
	public test(){
		mainFrame();
	}

	public void mainFrame() {
		frame = new JFrame("Salary Calculator");
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(3,1));
		
		label1 = new JLabel("Salary Calculator", JLabel.CENTER);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		frame.add(label1);
		frame.add(label2);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	public void panelLayout() {
		
		
	}

	public static void main(String[] ukiyo) {
		test damn = new test();

	}

}
