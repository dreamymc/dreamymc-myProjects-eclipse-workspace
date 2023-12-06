package CCE107;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Main {

	private JFrame frame;
	private JTextField firstNumberField;
	private JTextField secondNumberField;
	double firstNumber = 0;
	double secondNumber = 0;
	double resultNumber = 0;
	private JTextField subn1TextField;
	private JTextField subn2TextField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Some JTabbed Calculator");
		frame.setBounds(100, 100, 833, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 797, 396);
		frame.getContentPane().add(tabbedPane);
		
		JPanel addPanel = new JPanel();
		tabbedPane.addTab("Addition", null, addPanel, null);
		addPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Number: ");
		lblNewLabel.setBounds(87, 43, 115, 14);
		addPanel.add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number: ");
		lblSecondNumber.setBounds(87, 102, 115, 14);
		addPanel.add(lblSecondNumber);
		
		JLabel lblFirstNumber = new JLabel("Result: ");
		lblFirstNumber.setBounds(87, 159, 115, 14);
		addPanel.add(lblFirstNumber);
		
		JTextArea resultField = new JTextArea();
		resultField.setEditable(false);
		resultField.setBounds(87, 184, 206, 22);
		addPanel.add(resultField);
		
		firstNumberField = new JTextField();
		firstNumberField.setBounds(87, 68, 206, 22);
		addPanel.add(firstNumberField);
		firstNumberField.setColumns(10);
		
		secondNumberField = new JTextField();
		
		secondNumberField.setColumns(10);
		secondNumberField.setBounds(87, 126, 206, 22);
		addPanel.add(secondNumberField);
		
		JPanel addPanel_1 = new JPanel();
		addPanel_1.setLayout(null);
		tabbedPane.addTab("Subtraction", null, addPanel_1, null);
		
		JLabel lblNewLabel_1 = new JLabel("First Number: ");
		lblNewLabel_1.setBounds(87, 43, 115, 14);
		addPanel_1.add(lblNewLabel_1);
		
		JLabel lblSecondNumber_1 = new JLabel("Second Number: ");
		lblSecondNumber_1.setBounds(87, 102, 115, 14);
		addPanel_1.add(lblSecondNumber_1);
		
		JLabel lblFirstNumber_1 = new JLabel("Result: ");
		lblFirstNumber_1.setBounds(87, 159, 115, 14);
		addPanel_1.add(lblFirstNumber_1);
		
		JTextArea subResultTextField = new JTextArea();
		subResultTextField.setEditable(false);
		subResultTextField.setBounds(87, 184, 206, 22);
		addPanel_1.add(subResultTextField);
		
		subn1TextField = new JTextField();
		subn1TextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					subn2TextField.requestFocusInWindow();
					firstNumber = Double.parseDouble(subn1TextField.getText());
				}
			}
		});
		
		subn1TextField.setColumns(10);
		subn1TextField.setBounds(87, 68, 206, 22);
		addPanel_1.add(subn1TextField);
		
		subn2TextField = new JTextField();
		subn2TextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					subn1TextField.requestFocusInWindow();
					secondNumber = Double.parseDouble(subn2TextField.getText());
					resultNumber = firstNumber - secondNumber;
					subResultTextField.setText(""+resultNumber);
				}
			}
		});
		subn2TextField.setColumns(10);
		subn2TextField.setBounds(87, 126, 206, 22);
		addPanel_1.add(subn2TextField);
		
		JPanel addPanel_1_1 = new JPanel();
		addPanel_1_1.setLayout(null);
		tabbedPane.addTab("New tab", null, addPanel_1_1, null);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Number: ");
		lblNewLabel_1_1.setBounds(87, 43, 115, 14);
		addPanel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblSecondNumber_1_1 = new JLabel("Second Number: ");
		lblSecondNumber_1_1.setBounds(87, 102, 115, 14);
		addPanel_1_1.add(lblSecondNumber_1_1);
		
		JLabel lblFirstNumber_1_1 = new JLabel("Result: ");
		lblFirstNumber_1_1.setBounds(87, 159, 115, 14);
		addPanel_1_1.add(lblFirstNumber_1_1);
		
		JTextArea subResultTextField_1 = new JTextArea();
		subResultTextField_1.setEditable(false);
		subResultTextField_1.setBounds(87, 184, 206, 22);
		addPanel_1_1.add(subResultTextField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(87, 68, 206, 22);
		addPanel_1_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 126, 206, 22);
		addPanel_1_1.add(textField_1);
		
		JPanel addPanel_1_2 = new JPanel();
		addPanel_1_2.setLayout(null);
		tabbedPane.addTab("New tab", null, addPanel_1_2, null);
		
		JLabel lblNewLabel_1_2 = new JLabel("First Number: ");
		lblNewLabel_1_2.setBounds(87, 43, 115, 14);
		addPanel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblSecondNumber_1_2 = new JLabel("Second Number: ");
		lblSecondNumber_1_2.setBounds(87, 102, 115, 14);
		addPanel_1_2.add(lblSecondNumber_1_2);
		
		JLabel lblFirstNumber_1_2 = new JLabel("Result: ");
		lblFirstNumber_1_2.setBounds(87, 159, 115, 14);
		addPanel_1_2.add(lblFirstNumber_1_2);
		
		JTextArea subResultTextField_2 = new JTextArea();
		subResultTextField_2.setEditable(false);
		subResultTextField_2.setBounds(87, 184, 206, 22);
		addPanel_1_2.add(subResultTextField_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 68, 206, 22);
		addPanel_1_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(87, 126, 206, 22);
		addPanel_1_2.add(textField_3);
		
		firstNumberField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					firstNumber = Double.parseDouble(firstNumberField.getText());
					secondNumberField.requestFocusInWindow();
					
				}
			}
		});
		
		secondNumberField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					secondNumber = Double.parseDouble(secondNumberField.getText());
					resultNumber = firstNumber + secondNumber;
					resultField.setText(""+resultNumber);
					firstNumberField.setText("");
					secondNumberField.setText("");
					firstNumberField.requestFocusInWindow();
				}
			}
		});
		
	}
}
