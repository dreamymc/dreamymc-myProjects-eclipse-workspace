import java.time.LocalTime;
import java.util.Scanner;

public class nibba {

	private String name;
	private boolean pass;
	static Scanner sc = new Scanner(System.in);
	

	// Number 5
//	public static String showGreeting (String firstName) {
//		String welcomeMsg = "Welcome ";
//		
//		welcomeMsg = welcomeMsg + 
//		firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
//		return welcomeMsg;
//	}
//	
//   public static void main(String[] args) { 
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter your name: ");
//	  String name = sc.next();
//	  System.out.println(showGreeting(name));
//	  }
	// Number 7
//	public static boolean validateEntries(String[] entries) {
//		boolean allValidEntries = true;
//		for (String entry : entries) {
//			if(entry.length()>10) {
//				allValidEntries = false;
//				break;
//			}
//		}
//		return allValidEntries;
//	}
//	
//	public static void main(String[] args) {
//		String[] entries = { "Damn", "hey", "Alex", "Yoj" };
//
//		System.out.println(validateEntries(entries));
//		
//		for (String name : entries) {
//			System.out.println(name);
//		}
//	}
	//Number 8
//	public static void Process(ArrayList<String> invoices) {
//		for (int i = 0; i < invoices.size(); i++) {
//			String invoice = invoices.get(i);
//			invoices.remove(i);
//		}
//
//	}
	
	public static void main (String[] args) {
//		//Number 9
//		System.out.println((2+3)*4-1);
//		//Number 10
//		System.out.println( 4 * 4 + 2 * 5);
//		//Number 11
//		System.out.println(8 * 2 % 3);
		//Number 12
		double n = 5 / 2 - 4 % 2;
		System.out.println(n);
//		//Number 13
//		for(int i=10; i >=0; --i) {
//			System.out.println(i);
//			
//		}
//		//Number 14 D.
//		long data2 = 65;
//		//Number 45
//		char data1=65;
//		System.out.println(data2);
		
		// <class> <obj> = new <class>(); obj.method;
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int[] numbers = { num1, num2, num3 };
//		System.out.println(numbers[0]);
//		//Number 19
//		double pi = Math.PI; // 3.141593
//		System.out.format("PI is %.3f", pi);
//		//Number 20
//		double pi = Math.PI; // 3.141593
//		System.out.format("PI is %.0f", pi);
//		//Number 21
//		double pi = Math.PI; // 3.141593
//		System.out.format("PI is %09f", pi);
//		//Number 22
//		int a = 5;
//		int b = 10;
//		int c = ++a * b --;
//		System.out.println(c);
//		//Number 23
//		int a = 5;
//		int b = 10;
//		int c = ++a * b --;
//		int d = a-- + ++b;
//		System.out.println(d);
//		//Number26
//		String str = "Java";
//		StringBuffer buffer = new StringBuffer(str);
//		System.out.println(str+":"+buffer);
//		if (str.equals(buffer))
//		{
//		System.out.println("Both are equal");
//		}
//		else
//		System.out.println("Both are not equal");
//		String model ="T";
//		int price=0;
//		switch (model) {
//		case "A": price=50; 
//		          break;
//		case "T" : price = 20;
//		
//		case "C" : price=5; 
//		           break;
//		default : price=100; 
//		          break;
//
//		}		System.out.println(price);
		
//		char digit = 'a';
//
//		for (int i=0; i<10; i++)
//		{
//		switch(digit)
//		{
//		case 'x': {
//		int j=0; 
//		System.out.println(j);
//		}
//		default:
//		{
//		int j=100;
//		System.out.println(j);
//		}
//		}
//		}
//
//		int i=j;
//		System.out.println(i);
		
//		boolean a = true;
//		boolean b = false;
//		boolean c = true;
//
//		System.out.println(b=c);
//		if (a == true)
//		     if (b==true)
//		         if (c==true)
//		              System.out.println("Some things are true");
//		        else System.out.println("Nothing is true");
//		      else if (a && (b=c))
//		           System.out.println(("It is too confusing"));
//		      else System.out.println("Hey this wont compile");
		
//		String s1=new String("Test");
//		String s2=new String("Test");
//
//		if (s1==s2)
//		System.out.println("Same");
//		if (s1.equals(s2))
//		System.out.println("Equals");
		
//		for (int i=0; i < 3; i++)
//	    {
//	       System.out.print(i);
//	   }
//	   System.out.print(i);
		
//		int a = 5;
//		   System.out.println("Value is " + ((a < 5)? 9.9: 9));
//		
//		int Output = 10;
//		boolean b1 = false;
//		if ((b1 == true) && ((Output += 10) == 20))
//		{
//		System.out.println("We are equal "+Output);
//		}
//		else
//		{
//		System.out.println("Not equal! "+Output);
//		}
		
//		System.out.print(LocalTime.now());
		
//		Integer number=Integer.valueOf("808.1");
//		System.out.println(number);

//		nibba wb = new nibba();
//	     System.out.print("name = "+wb.name);
//	     System.out.print(", pass="+wb.pass);
//		try
//		  {
//		    int whizData[] =  new int[10];
//		    System.out.println("Accessing Element: "+whizData[11]);
//		   }
//		  catch(ArrayIndexOutOfBoundsException e){
//		    System.out.println("Oops.. Identified Exception:: "+e);
//		}
//		String numberString = "2.5";
//		Double.parseDouble(numberString);
//		System.out.println(numberString);
		
//		double number = 30;
//		   number = number % -3d;
//		   System.out.println(number);
//		   number += 10f;
//		   System.out.println(number);
//		   number *= -4;
//		   System.out.println(number);
		
//		Float  data3 = new Float ("-65.0");
//		System.out.println(data3);
//		short  data4 = new Short("-65.0");
//		System.out.println(data4);
//		double dNum=2.667;
//		int iNum=0;
//		iNum= (int) dNum;
//		System.out.println(iNum);
	}

//	public static void printInt()
//	{
////	    if (true) {
////	      int num=1;
////	      if (num > 0) {
////	            num++;
////	      }
////	    }
//	    int num = 1;
////	    System.out.println(num);
//	    addOne(num);
////	    System.out.println(num);
//	    num = num -1;
//	    System.out.println(num);
//	}
//
//	public static int addOne(int num)
//	{
//	   num = num +1;
//	   return num;
//	}
	
//	public static boolean duplicate(int[] array)
//	{
//	    boolean isDup=false;
//	    for (int x=0; x< array.length; x++){
//	         for (int y=x+1; y< array.length; y++)
//	              if (array [x] == array[y])
//	                     isDup= true;
//	        if (isDup)
//	                 break;
//	    }
//	return isDup;
//	}
	

//	private int id = 3;
//      public static void number15 (String[] args)
//	     {
//	        nibba customer = new nibba();
//	         customer.id=5;
//	         customer.showId();
//	     }
//	 
//	  protected void showId()
//	   {
//	      System.out.println(id);
//	   }
	
	
	}


