import javax.swing.*;
//K.L.A
public class main1 {
	// variables
	static String[] activities = { "Sedentary", "Light", "Moderate", "Active", "Very Active", "Extra Active" };
	static String name = "", gender = "";
	static int age = 0, height = 0, act, choice, select;
	static double weight = 0, bmr = 0, calorie, maintainweight, mildweightL, weightL, extremeweightL;
	static boolean proceed;
	static String ageString = "", heightString = "", weightString = "", actString = ""; // use to temporarily store
																						// input
	// Methods

	public static int menu_Start(int choice) {
		switch (choice) {
		case 1: {
			obtain_Info();
			user_Info();
			result();
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Program Closed.");
			proceed = false;
			break;
		}
		}
		return choice;
	}

	public static void user_Info() {
		JOptionPane.showMessageDialog(null,
				("======USER INFORMATION======\n" + "                  Name: " + name + "\n"
						+ "                     Age: " + age + "\n" + "               Height: " + height + "cm \n"
						+ "               Weight: " + weight + "kg \n" + "        Activity level: "
						+ activities[act - 1] + "\n"));
		calculate_bmr(gender);
	}

	public static void obtain_Info() {
		do {
			proceed = true;
			name = JOptionPane.showInputDialog("Name:");
			switch (name) {
			case "": {
				JOptionPane.showMessageDialog(null, "Please input name");
				break;
			}
			default: {
				proceed = false;
				break;
			}
			}
		} while (proceed);
		do {
			proceed = true;
			ageString = JOptionPane.showInputDialog("Age: ");
			if (ageString.equals("")) {
				JOptionPane.showMessageDialog(null, "Please input age");
			} else {
				proceed = false;
			}
		} while (proceed);
		age = Integer.parseInt(ageString);
		do {
			proceed = true;
			gender = JOptionPane.showInputDialog("Gender(F/M):");
			if (gender.equals(""))
				JOptionPane.showMessageDialog(null, "Please input gender");
			else
				proceed = false;
		} while (proceed);
		do {
			proceed = true;
			heightString = JOptionPane.showInputDialog("Height(cm): ");
			if (heightString.equals(""))
				JOptionPane.showMessageDialog(null, "Please input height");
			else
				proceed = false;
		} while (proceed);
		height = Integer.parseInt(heightString);
		do {
			proceed = true;
			weightString = (JOptionPane.showInputDialog("weight(kg): "));
			if (weightString.equals(""))
				JOptionPane.showMessageDialog(null, "Please input weight");
			else
				proceed = false;
		} while (proceed);
		weight = Double.parseDouble(weightString);
		do {
			proceed = true;
			actString = JOptionPane.showInputDialog("=====================ACTIVITY LEVEL===================\n"
					+ "[1] SEDENTARY (little or no exercise) \n" + "[2] LIGHT (light exercise/sports 1-3 days/week)\n"
					+ "[3] MODERATE (moderate exercise/sports 6-7 days/week) \n"
					+ "[4] VERY ACTIVE (hard exercise every day, or exercising 2 xs/day)  \n"
					+ "[5] EXTRA ACTIVE (hard exercise 2 or more times per day)");
			if (actString.equals(""))
				JOptionPane.showMessageDialog(null, "Please input activity level");
			else
				proceed = false;
		} while (proceed);
		act = Integer.parseInt(actString);
		calculate_bmr(gender);
	}

	public static String calculate_bmr(String gender) {
		switch (gender) {
		case "M":
		case "m": {
			bmr = ((10 * weight) + (6.25 * height) - (5 * age) + 5);
			break;
		}
		case "F":
		case "f": {
			bmr = ((10 * weight) + (6.25 * height) - (5 * age) - 161);
			break;
		}
		default: {
			JOptionPane.showMessageDialog(null, "Invalid Input.Try Again_calbmr");
			break;
		}
		}
		eval_bmr(bmr);
		return gender;
	}

	public static double eval_bmr(double bmr) {

		switch (act) {
		case 1: {
			calorie = bmr * 1.2;
			maintainweight = calorie;
			mildweightL = calorie * .84;
			weightL = calorie * .69;
			extremeweightL = calorie * .38;
			break;
		}
		case 2: {
			calorie = bmr * 1.375;
			maintainweight = calorie;
			mildweightL = calorie * .84;
			weightL = calorie * .69;
			extremeweightL = calorie * .38;
			break;
		}
		case 3: {
			calorie = bmr * 1.55;
			maintainweight = calorie;
			mildweightL = calorie * .84;
			weightL = calorie * .69;
			extremeweightL = calorie * .38;
			break;
		}
		case 4: {
			calorie = bmr * 1.725;
			maintainweight = calorie;
			mildweightL = calorie * .84;
			weightL = calorie * .69;
			extremeweightL = calorie * .38;
			break;
		}
		case 5: {
			calorie = bmr * 1.9;
			maintainweight = calorie;
			mildweightL = calorie * .84;
			weightL = calorie * .69;
			extremeweightL = calorie * .38;
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input.Try Again_evalbmr");
		}
		return bmr;
	}

	public static void result() {
		String output = String.format(
				"RESULT:" + "\n" + "MAINTAIN WEIGHT: %.0f Calories per day\n"
						+ "MILD WEIGHT LOSS(.25kg/week): %.0f Calories per day\n"
						+ "WEIGHT LOSS(.5kg/week): %.0f Calories per day\n"
						+ "EXTREME WEIGHT LOSS(1kg/week): %.0f Calories per day",
				maintainweight, mildweightL, weightL, extremeweightL);
		JOptionPane.showMessageDialog(null, output);
		JOptionPane.showMessageDialog(null, "Program Closed.");
	}

	public static void main(String[] args) {
		do {
			proceed = true;
			try {
				choice = Integer.parseInt(JOptionPane
						.showInputDialog("======CALORIE CALCULATOR=======\n" + "                      [1] START \n"
								+ "                       [2] EXIT \n" + "                     Enter here: "));
				menu_Start(choice);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid Input.Try Again");
			}
		} while (proceed);
	}// end of main
}// end of class
