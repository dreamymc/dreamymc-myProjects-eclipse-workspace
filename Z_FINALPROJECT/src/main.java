import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	int xMouse;
	int yMouse;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\eclipse-workspace\\Z_FINALPROJECT\\src\\cat eyes.jpg"));
		frame.setBounds(100, 100, 950, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBounds(0, 0, 951, 643);
		frame.getContentPane().add(displayPanel);
		
		JButton exitButton = new JButton("X");
		exitButton.setBounds(906, 0, 45, 23);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		displayPanel.setLayout(null);
		
		JLabel photo = new JLabel(" ");
		photo.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Z_FINALPROJECT\\src\\login.jpg"));
		photo.setBounds(0, 0, 951, 643);
		displayPanel.add(photo);
		exitButton.setFont(new Font("Arial", Font.BOLD, 12));
		displayPanel.add(exitButton);
		
		JButton minimizeButton = new JButton("_");
		minimizeButton.setBounds(858, 0, 45, 23);
		minimizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setExtendedState(frame.ICONIFIED);
			}
		});
		minimizeButton.setFont(new Font("Arial", Font.BOLD, 12));
		displayPanel.add(minimizeButton);
		
		JPanel draggablePanel = new JPanel();
		draggablePanel.setBounds(0, 0, 951, 23);
		displayPanel.add(draggablePanel);
		
		JButton loginButton = new JButton("New button");
		loginButton.setBounds(321, 386, 318, 97);
		displayPanel.add(loginButton);
		
		draggablePanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
		        int y = evt.getYOnScreen();
		        frame.setLocation(x - xMouse, y - yMouse);
			}
		});
		draggablePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				xMouse = evt.getX();
		        yMouse = evt.getY();
			}
		});
	}
}
