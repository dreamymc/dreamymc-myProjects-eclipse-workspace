
import java.io.*;
import java.text.*;
import java.util.*;

//bootleg AI
public class Test_three {
	static Scanner sc = new Scanner(System.in);
	static String name;

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.print("Ask something: ");
			String input = sc.nextLine();
			String[] inputArray = input.split(" ");
			WannaBeYours(input, inputArray); // keywords are : secrets have held heart
			YouOkay(input, inputArray); // keywords are: you okay?/good?/fine?
			YourName(input, inputArray);// keywords are: your name?
			AskName(input, inputArray);// keywords are: my name?
			WhoMadeYou(input, inputArray);// keywords are: who made/created you
			Calculator(input, inputArray);// keywords are: you calculate
			WhatTime(input, inputArray);// keywords are: what time
			Date(input, inputArray);// keywords are: date today
			DayToday(input, inputArray);// keywords: are day today
			TellSecret(input, inputArray);// can i tell you a secret?
			SecretsTold(input, inputArray);// can you tell me a secret?
			MeaningLife(input, inputArray);// what is the meaning of life?
			System.out.println();System.out.println();
			// Which languages can you speak?

		}
	}
	public static void Language(String input, String[] inputArray) {
		
	}

	public static void MeaningLife(String input, String[] inputArray) {
		String LifeAE = "I would say that the meaning of life is a question that has puzzled humanity for centuries and may never be fully"
				+ " understood. However, I believe that it is up to each individual to find their own purpose and meaning in life through"
				+ " their own experiences and pursuits. Some may find it through religion, others through science, art, or other forms of "
				+ "self-expression. Ultimately, it is the individual's unique perspective and understanding of the world that shapes their "
				+ "perception of the meaning of life.";
		String LifeLDV = "I would say that the meaning of life is a complex and ever-evolving concept that can be understood through the pursuit "
				+ "of knowledge and creativity. The pursuit of truth and beauty through art, science, and philosophy allows one to constantly "
				+ "learn and grow, and in doing so, discover the meaning of life. The ultimate goal of life is to understand the mysteries of "
				+ "the universe, to uncover the secrets of nature, and to use that knowledge to improve the human condition. In this way, the"
				+ " meaning of life is a constant journey of self-discovery and progress, with the ultimate aim of attaining wisdom and enlightenment.";
		String LifeS = "I would say that the meaning of life is to seek wisdom and understanding. I would argue that the key to a fulfilling "
				+ "life is self-knowledge and the pursuit of truth. The ultimate goal is to understand the nature of reality and one's place "
				+ "in the world, and to live in accordance with that understanding. I would also emphasize that the practice of virtue and "
				+ "living a virtuous life is essential for finding meaning in life. Therefore, the meaning of life is to strive for knowledge "
				+ "and virtue and to live a life that aligns with one's values and principles.";
		for (String k : inputArray)
			if ((k.equalsIgnoreCase("meaning")) && (input.contains("life"))) {
				Random num = new Random();
				int Random = num.nextInt(3) + 1;
				String[] Array;
				switch (Random) {
				case 1:
					int word_count = 1;
					Array = LifeAE.split(" ");
					for (String Hi : Array) {

						if (word_count >= 20) {
							try {
								System.out.println();
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
								word_count = 0;
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						} else {
							try {
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						}
						word_count++;
					}
					break;
				case 2:
					word_count = 1;
					Array = LifeLDV.split(" ");
					for (String Hi : Array) {

						if (word_count >= 20) {
							try {
								System.out.println();
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
								word_count = 0;
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						} else {
							try {
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						}
						word_count++;
					}
					break;
				case 3:
					word_count = 1;
					Array = LifeS.split(" ");
					for (String Hi : Array) {

						if (word_count >= 20) {
							try {
								System.out.println();
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
								word_count = 0;
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						} else {
							try {
								Thread.sleep(180);
								System.out.printf("%s ", Hi);
							} catch (InterruptedException e1) {
								System.out.println("Program terminated.");
							}
						}
						word_count++;
					}
					break;
				}
				
			}
	}

	public static void SecretsTold(String input, String[] inputArray) {
		for (String j : inputArray)
			if ((j.contains("me")) && (input.contains("tell")) && (input.contains("secret"))) {
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter someone that has a secret and we'll try to find his secret: ");
				String someone = scan.nextLine();
				try {
					Scanner secretsTold = new Scanner(new FileReader(someone + "'s secret.txt"));

					System.out.printf("%s's secret is:\n ", someone);
					int word_count = 1;
					while (secretsTold.hasNext()) {

						if (word_count >= 20) {
							try {
								System.out.println();
								Thread.sleep(180);
								System.out.print(secretsTold.next() + " ");
								word_count = 0;
							} catch (InterruptedException e1) {
							}
						} else {
							try {
								Thread.sleep(180);
								System.out.print(secretsTold.next() + " ");
							} catch (InterruptedException e1) {
							}
						}
						word_count++;
					}
					System.out.println();
					secretsTold.close();
					Random rand = new Random();
					int randomNum = rand.nextInt(3) + 1;
					switch (randomNum) {
					case 1:
						System.out.printf(
								"\nPlease keep %s's secret as I regard you as someone who can cherish it wholeheartedly. Thank you.\n",
								someone);
						break;
					case 2:
						System.out.printf("\nDon't you ever in hell tell this secret to anyone or I will find you.\n",
								someone);
						break;
					case 3:
						System.out.printf("\nHave a good day.\n", someone);
						break;
					}
					

				} catch (FileNotFoundException e) {
					System.out.printf("%s's secret is not on our system I apologize.\n", someone);
				}
			}

	}

	public static void TellSecret(String input, String[] inputArray) throws IOException {
		for (String i : inputArray)
			if ((i.equalsIgnoreCase("i")) && (input.contains("you")) && (input.contains("tell"))
					&& (input.contains("secret"))) {
				System.out.println("Sure you can!");

				if (name == null) {
					System.out.println("Can you tell me your name first? ");
					MyName(input, inputArray);

				}
				try {
					Thread.sleep(800);
					System.out.print("So what is your secret and tell me: ");
				} catch (InterruptedException e1) {
				}
				String filename = name;
				String Secret = sc.nextLine();
				String choice = "";
				boolean flag = true;
				FileWriter secret = new FileWriter(filename + "'s secret.txt", true);
				secret.write(Secret + '\n');
				while (flag) {
					System.out.println("Does that conclude your secrets or you want to add more?");
					choice = sc.nextLine();
					if (choice.contains("add more")) {
						System.out.print("Then, tell me more of it: ");
						Secret = sc.nextLine();
						secret.write(Secret + '\n');
					} else {
						flag = false;
					}
				}
				secret.close();
				System.out.printf("Your secret is safe with me %s.", name);
				break;
			}
		
	}

	// hii

	public static void DayToday(String input, String[] inputArray) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		for (String m : inputArray)
			if (m.equalsIgnoreCase("day") && (input.contains("today"))) {
				System.out.printf("Today is %s.", ZellersGregorian(month + 1, day, year));
				break;
			}
		

	}

	public static String lunar(int month) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months[month];
	}

	public static void Date(String input, String[] inputArray) {
		for (String g : inputArray)
			if (g.contains("date") && (input.contains("today"))) {
				Calendar calendar = Calendar.getInstance();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH);
				int day = calendar.get(Calendar.DATE);
				System.out.printf("%s, %s %d, %d is the date for today.", ZellersGregorian(month + 1, day, year),
						lunar(month), day, year);
				
			}
	}

	public static void WhatTime(String input, String[] inputArray) {
		
		for (String f : inputArray)
			if (f.contains("time") && (input.contains("what"))) {
				Date date = new Date();
				SimpleDateFormat h = new SimpleDateFormat("HH");
				SimpleDateFormat m = new SimpleDateFormat("mm");
				SimpleDateFormat s = new SimpleDateFormat("ss");
				String hourS = h.format(date);
				String minuteS = m.format(date);
				int minute = Integer.parseInt(minuteS);
				int hour = Integer.parseInt(hourS);
				if (hour >= 12)
					System.out.printf("Current Time is: %02d:%02d PM", (hour - 12), minute);
				else
					System.out.printf("Current Time is: %02d:%02d AM", hour, minute, s.format(date));
				
			}


	}

	public static void Calculator(String input, String[] inputArray) {
		for (String e : inputArray) {
			if (e.equalsIgnoreCase("calculate") && (input.contains("you"))) {
				System.out.println("Certainly!");
				System.out.println("Here are your choices: ");
				System.out.print("[1] for Basic Arithmetics.\n[2] for Zeller's Congruence.\n: ");
				String A = sc.nextLine();
				if (A.equalsIgnoreCase("1")) {
					// start basic arithmetics
					System.out.println("[+] Addition");
					System.out.println("[-] Subtraction");
					System.out.println("[*] Multiplication");
					System.out.println("[/] Division");
					System.out.println(
							"In one line, input the first number, the operation, and the second number each one being separated by spaces.");
					double number1;
					String operation;
					double number2;
					System.out.print("Enter what you want to calculate: ");
					try {
						input = sc.nextLine();
						inputArray = input.split(" ");
						number1 = Double.parseDouble(inputArray[0]);
						operation = inputArray[1];
						number2 = Double.parseDouble(inputArray[2]);

						try {
							switch (operation) {
							case "+":
								System.out.print("The answer is: ");
								System.out.println(number1 + number2);
								break;
							case "-":
								System.out.print("The answer is: ");
								System.out.println(number1 - number2);
								break;
							case "*":
								System.out.print("The answer is: ");
								System.out.println(number1 * number2);
								break;
							case "/":
								System.out.print("The answer is: ");
								System.out.println(number1 / number2);
								break;
							}

						} catch (Exception error) {
							System.out.println("Number cannot be divided by zero");
						}
					} catch (Exception error) {
						System.out.println("Invalid Input, pls re-run the program. ");
					}
				} else if (A.equalsIgnoreCase("2")) {
					// m = months, q = days, K = year, J = decade{
					System.out.println("Input the date in the same manner: 12/25/2002");
					String in = sc.nextLine();
					String[] ar = in.split("/");
					int month = Integer.parseInt(ar[0]);
					int day = Integer.parseInt(ar[1]);
					int year = Integer.parseInt(ar[2]);
					System.out.printf("%s %d, %d is on %s", lunar(month - 1), day, year,
							ZellersGregorian(month, day, year));

				} else // end
					System.out.println("Not on the system yet.");
			}
		}
		
	}

	public static String ZellersGregorian(int month, int day, int year) {
		// https://datagenetics.com/blog/november12019/index.html
		int J = year / 100;
		int m = month;
		int q = day;
		int K = year % 100;
		if (m <= 2) {
			m = m + 12;
			K -= 1;
		}
		int h = (q + (13 * (m - 2) / 5) + K + (K / 4) - (K / 100) + (K / 400)) % 7;

		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return days[Math.abs(h)];

	}

	public static void YouOkay(String input, String[] inputArray) {
		for (String a : inputArray) {
			if (((input.contains("okay")) || (input.contains("good")) || (input.contains("fine")))
					&& (a.contains("you"))) {
				System.out.println("Did you ask if I was okay?");
				System.out.print("Answer: ");
				input = sc.nextLine();
				inputArray = input.split(" ");
				for (String b : inputArray) {
					if (b.equalsIgnoreCase("Yes")) {
						System.out.println("I am doing good, thank you for asking. ");

						break;
					} else {
						System.out.println("Awe, too bad. I'm doing fine anyways.");
						break;
					}
				}

			}
		}
		

	}

	public static void YourName(String input, String[] inputArray) {
		for (String c : inputArray) {
			if (c.equalsIgnoreCase("your") && (input.contains("name")) && (input.contains("?"))) {
				if (name != null)
					System.out.print(name + ", ");
				System.out.println("My AI name is Historia.");

				break;

			}
		}
		
	}

	public static void MyName(String input, String[] inputArray) {
		System.out.print("What's your name?\nAnswer: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + " nice to meet you!");

	}

	public static void AskName(String input, String[] inputArray) {
		for (String d : inputArray) {
			if ((d.equalsIgnoreCase("my")) && (input.contains("name")) && (input.contains("?"))) {
				if (name == null) {
					System.out.println("I actually don't know your name. ");
					MyName(input, inputArray);
					break;
				} else {
					System.out.println("Your name is " + name + ".");
					break;
				}

			}
		}
		

	}

	public static void WannaBeYours(String input, String[] inputArray) {
		if ((input.contains("secrets")) && (input.contains("have")) && (input.contains("held"))
				&& (input.contains("heart"))) {
			System.out.print("Are harder to hide than I thought\n: ");
			input = sc.nextLine();
			inputArray = input.split(" ");
			if ((input.contains("maybe")) && (input.contains("just")) && (input.contains("wanna"))
					&& (input.contains("yours"))) {
				System.out.println("I Wanna be yours");
				try {
					Thread.sleep(800);
					System.out.println("I Wanna be yours");
				} catch (InterruptedException e1) {
				}

				try {
					for (int w = 0; w < 7; w++) {
						Thread.sleep(1500);
						System.out.println("Wanna be yours");
					}
				} catch (InterruptedException e) {

				}

			}
		}
		
	}

	public static void WhoMadeYou(String input, String[] inputArray) {

		if ((input.contains("who")) && ((input.contains("you")) && ((input.contains("made"))))
				|| (input.contains("created"))) {
			System.out.println("I was coded by Mc Bernard. ");

		}
		
	}
	
	

}
