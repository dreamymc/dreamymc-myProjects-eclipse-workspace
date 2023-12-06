package programmizTest;

class Dog extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	  
	  public void hey() {
		  System.out.printf("I am a %s.",word);
	  }
	}