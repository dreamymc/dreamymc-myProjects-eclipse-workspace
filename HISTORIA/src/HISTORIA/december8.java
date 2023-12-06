package HISTORIA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class december8 {
	public static void main(String[] args) {
        // Create the user interface for the calculator
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JTextArea resultArea = new JTextArea(1, 20);

        // Add the components to the panel
        panel.add(num1Field);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultArea);

        // Add the panel to the frame
        frame.add(panel);
        
        // Set the size of the frame and make it visible
        frame.setSize(300, 160);
        frame.setVisible(true);

        // Add event listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform the calculation
                int result = Math.addExact(num1, num2);

                // Display the result in the text area
                resultArea.setText(Integer.toString(result));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform the calculation
                int result = Math.subtractExact(num1, num2);

                // Display the result in the text area
                resultArea.setText(Integer.toString(result));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform the calculation
                int result = Math.multiplyExact(num1, num2);

                // Display the result in the text area
                resultArea.setText(Integer.toString(result));
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Perform the calculation
                int result = Math.divideExact(num1, num2);

                // Display the result in the text area
                resultArea.setText(Integer.toString(result));
            }
        });
        
	}}
 
