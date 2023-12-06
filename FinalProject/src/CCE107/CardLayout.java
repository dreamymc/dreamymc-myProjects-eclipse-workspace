package CCE107;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class CardLayout {
	int yMouse;
	int xMouse;

	private JFrame frame;
	JPanel CardPanel = new JPanel();
	JPanel red = new JPanel();
	JPanel blue = new JPanel();
	JPanel green = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayout window = new CardLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 676, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		CardPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
		        int y = e.getYOnScreen();
		        frame.setLocation(x - xMouse, y - yMouse);
			}
		});
		CardPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
		        yMouse = e.getY();
			}
		});
		
		CardPanel.setBackground(new Color(255, 255, 255));
		CardPanel.setBounds(0, 0, 660, 519);
		frame.getContentPane().add(CardPanel);
		CardPanel.setLayout(new java.awt.CardLayout(0, 0));
		
		
		red.setBackground(new Color(255, 0, 0));
		CardPanel.add(red, "name_855092878920000");
		red.setLayout(null);
		
		JButton blueButton_2 = new JButton("blue");
		blueButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(blue); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		blueButton_2.setBounds(10, 11, 89, 23);
		red.add(blueButton_2);
		
		JButton greenbutton_2 = new JButton("green");
		greenbutton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(green); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		greenbutton_2.setBounds(109, 11, 89, 23);
		red.add(greenbutton_2);
		
		
		blue.setBackground(new Color(0, 0, 255));
		CardPanel.add(blue, "name_855103962050900");
		blue.setLayout(null);
		
		JButton redButton_2_1 = new JButton("red");
		redButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(red); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		redButton_2_1.setBounds(10, 11, 89, 23);
		blue.add(redButton_2_1);
		
		JButton greenbutton_2_1 = new JButton("green");
		greenbutton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(green); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		greenbutton_2_1.setBounds(109, 11, 89, 23);
		blue.add(greenbutton_2_1);
		
		
		green.setBackground(new Color(0, 255, 0));
		CardPanel.add(green, "name_855107564121900");
		green.setLayout(null);
		
		JButton redButton_1 = new JButton("red");
		redButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(red); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		redButton_1.setBounds(10, 11, 89, 23);
		green.add(redButton_1);
		
		JButton blueButton_1 = new JButton("blue");
		blueButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardPanel.removeAll();
		        CardPanel.add(blue); 
		        CardPanel.repaint();
		        CardPanel.revalidate();
			}
		});
		blueButton_1.setBounds(109, 11, 89, 23);
		green.add(blueButton_1);
	}
}
