package programmizTest;

class Main {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    Dog labrador = new Dog();

	    // access field of superclass
	    labrador.name = "Rohu";
	    labrador.food = "tae";
	    labrador.word = "Good boy";
	    labrador.display();
	    labrador.hey();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();
	    System.out.println();
	    Dog retriever = new Dog();
	    retriever.name = "anday";
	    retriever.food = "adobong manacc";
	    retriever.word = "Good girl";
	    retriever.display();
	    retriever.hey();
	    retriever.eat();

	  }
	}