import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class W4A3Logronio {

	public static void main(String[] args) {
		JFrame frame = new JFrame("CALCULATOR");
		JPanel inputPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		JLabel firstNumber = new JLabel("First Number:");
		JLabel secondNumber = new JLabel("Second Number:");
		JLabel result= new JLabel("Result:");
		
		JButton addButton = new JButton("ADD");
		JButton subtractButton = new JButton("SUBTRACT");
		JButton multiplyButton = new JButton("MULTIPLY");
		JButton divideButton = new JButton("DIVIDE");
		JButton clear = new JButton("CLEAR");
		
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField textResult = new JTextField(3);
		
		frame.add(inputPanel);
		frame.add(buttonPanel);

		frame.setLayout(new GridLayout(2,1));
		inputPanel.setLayout(new GridLayout(3,2));
		buttonPanel.setLayout(new FlowLayout()); 
		
		inputPanel.add(firstNumber);
		inputPanel.add(text1);
		inputPanel.add(secondNumber);
		inputPanel.add(text2);
		inputPanel.add(result);
		inputPanel.add(textResult);

		buttonPanel.add(addButton);
		buttonPanel.add(subtractButton);
		buttonPanel.add(multiplyButton);
		buttonPanel.add(divideButton);
		buttonPanel.add(clear);
		
		frame.setVisible(true);
		frame.setSize(350, 300);
		frame.setResizable(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					double number1 = Double.parseDouble(text1.getText());
					double number2 = Double.parseDouble(text2.getText());
					double result = number1+number2;
					textResult.setText(""+result);

				}catch(Exception F){
					textResult.setText("Input numbers only.");
				}
			}
		});
		
		subtractButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					double number1 = Double.parseDouble(text1.getText());
					double number2 = Double.parseDouble(text2.getText());
					double result = number1-number2;
					textResult.setText(""+result);

				}catch(Exception F){
					textResult.setText("Input numbers only.");
				}
			}
		});
		
		multiplyButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					double number1 = Double.parseDouble(text1.getText());
					double number2 = Double.parseDouble(text2.getText());
					double result = number1*number2;
					textResult.setText(""+result);

				}catch(Exception F){
					textResult.setText("Input numbers only.");
				}
			}
		});
		
		divideButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					double number1 = Double.parseDouble(text1.getText());
					double number2 = Double.parseDouble(text2.getText());
					if(number2 == 0)
						textResult.setText("Divisor should not be 0");
					else{
					double result = number1/number2;
					textResult.setText(""+result);
					}
				}catch(Exception F){
					textResult.setText("Input numbers only.");
				}
			}
		});

		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					text1.setText("");
					text2.setText("");
					textResult.setText("");
				}catch(Exception F){
					textResult.setText("Input numbers only.");
				}
			}
		});
		


		

	}

}
