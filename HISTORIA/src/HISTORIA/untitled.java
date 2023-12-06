package HISTORIA;
import java.util.Scanner;
public class untitled {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scan = new Scanner(System.in);

		String Name="";
		String Class="";
		String School="";
		do {
			
			do{
				System.out.print("\nEnter your name: ");
				Name = scan.nextLine();
			}while(Name.equals(""));

			do {
			System.out.print("["
					+ " Magician, "
					+ "Sharper, "
					+ "Fighter, "
					+ "Warrior, "
					+ "Marksman, "
					+ "Assasin, "
					+ "Gunner, "
					+ "Wizard]\nChoose a class from the choices above: ");
			Class = scan.nextLine();
			}while(Class.equals(""));
			do {
			System.out.print("\n[ North Shore, Hogwarts, Harper, Walkersville"
					+ "] \n Choose your school: ");
			School = scan.nextLine();
			}while(School.equals(""));
			System.out.print("Enter your gender: ");
			String Gender = scan.nextLine();
			boolean GenderReal=true;
			if ((!School.equals("Hogwarts")) && (!School.equals("Harper")) && (!School.equals("North Shore"))
					&&	(!School.equals("Walkersville"))) {
					System.out.println(School+" is not found in the list of school\n ");
				}
				if ((!Class.equals("Wizard")) && (!Class.equals("Magician")) && (!Class.equals("Marksman"))
						&& (!Class.equals("Sharper")) && (!Class.equals("Fighter")) && (!Class.equals("Gunner"))
						&& (!Class.equals("Warrior")) && (!Class.equals("Assasin")) ) {
					System.out.println(Class+" is not found in the list of classes to choose.");
				}

			
			if (School.equals("North Shore")&&((Class.equals("Sharper")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
			}
			else if (School.equals("North Shore")&&((Class.equals("Warrior")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Hogwarts")&&((Class.equals("Magician")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Hogwarts")&&((Class.equals("Wizard")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Harper")&&((Class.equals("Gunner")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Harper")&&((Class.equals("Marksman")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Walkersville")&&((Class.equals("Fighter")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}
			else if (School.equals("Walkersville")&&((Class.equals("Assasin")))) {
				System.out.println("Name: "+Name+"\nClass: "+Class+"\nSchool: "+School);
				GenderReal=false;
			}else {System.out.println(Class+" is not allowed in "+School);}
			
			if(((Gender.equals("Male")) || (Gender.equals("Female"))) && (GenderReal==false)) {
				System.out.println("Gender: "+Gender);
			}
			if ((!Gender.equals("Male")) && ((!Gender.equals("Female"))) ) {
				System.out.println(Gender+" is not a valid gender");
			}
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Press 1 to terminate the program");
			int Terminate= scan1.nextInt();
			if(Terminate==1) {
				flag=false;
				System.out.println("Program terminated.");
			}else {
				flag=true;
			}
			
		}while(flag==true);
	}

}
