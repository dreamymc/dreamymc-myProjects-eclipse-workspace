package HISTORIA;
import java.util.Scanner;
public class Labexamtestest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("This section is for the laboratory exam");
		System.out.print("Enter your first exam result: ");
		double lab1 =scan.nextDouble();
		if (lab1<101) {
			double lab1percent = (lab1*0.3);
			System.out.print("Enter your second exam result: ");
			double lab2 =scan.nextDouble();
			
			if (lab2<101) {
				double lab2percent= (lab2*0.3);
				System.out.print("Enter your third exam result: ");
				double lab3 =scan.nextDouble();
				
				if (lab3<101) {
					double lab3percent = (lab3*0.4);
					double labtotalgrade = (lab1percent+lab2percent+lab3percent);
					System.out.println("Your lab exam total grade is "+labtotalgrade+"%");
					double labtotalgradetotal = labtotalgrade*0.6;
				//	System.out.println(labtotalgradetotal);
					//
					System.out.println("For the lecture exam");
					System.out.print("Enter your first exam result: ");
					double exam1 =scan.nextDouble();
					if (exam1<51) {
						double exam1percent = (exam1*0.2);
						System.out.print("Enter your second exam result: ");
						double exam2 =scan.nextDouble();
						
						if (exam2<51) {
							double exam2percent= (exam2*0.2);
							System.out.print("Enter your third exam result: ");
							double exam3 =scan.nextDouble();
							
							if (exam3<51) {
								double exam3percent = (exam3*0.2);
								System.out.print("Enter your fourth exam result: ");
								double exam4 = scan.nextDouble();
								if (exam4<51) {
									double exam4percent = (exam4*0.4);
									double examtotalgrade = ((exam1percent+exam2percent+exam3percent+exam4percent)*2);
									double examtotalgradetotal = (examtotalgrade*0.4);
									System.out.println("Your lecture exam total grade is "+examtotalgrade+"%");
									System.out.println("All exam grade is: "+(examtotalgradetotal+labtotalgradetotal)+ "%");
								}else {
									System.out.println("Invalid input. \nPlease restart the program");	
								}

								//
								
							}else {
								System.out.println("Grade cannot be more than the maximum points.");
							}
						}else {
							
						System.out.println("Grade cannot be more than the maximum points.");
						}
					}else {
						System.out.println("Grade cannot be more than the maximum points.");
					}
					
				}else {
					System.out.println("Grade cannot be more than the maximum points.");
				}
			}else {
				
			System.out.println("Grade cannot be more than the maximum points.");
			}
		}else {
			System.out.println("Grade cannot be more than the maximum points.");
		}
		}catch (Exception error) {
			System.out.println("Invalid input.\nPlease restart the program");
		}
		
	}
	
}
