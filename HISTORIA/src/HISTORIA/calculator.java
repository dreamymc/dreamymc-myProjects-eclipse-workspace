package HISTORIA;

import javax.swing.JOptionPane;

public class calculator {

	public static void main(String[] args) {
		boolean flag = true;
		do {
			try {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your First number:"));
				String operation = JOptionPane.showInputDialog("Enter the operation");
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your Second number:"));
				switch (operation) {
				case "+":
					JOptionPane.showMessageDialog(null, (num1 + num2));
					break;
				case "-":
					JOptionPane.showMessageDialog(null, (num1 - num2));
					break;
				case "*":
					JOptionPane.showMessageDialog(null, (num1 * num2));
					break;
				case "/":
					if (num1 == 0 || num2 == 0) {
						JOptionPane.showMessageDialog(null, "You cannot divide a number by zero.", "SYNTAX ERROR",
								JOptionPane.OK_CANCEL_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, (num1 / num2));
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, ("Invalid input"));
				}

				String enter1 = JOptionPane
						.showInputDialog("Enter 0 to exit the program, otherwise press any key to continue.");
				if (enter1.equals("0")) {
					flag = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Syntax Error.", "INVALID", JOptionPane.OK_CANCEL_OPTION);
			}
		} while (flag);
		
		
	}

}
