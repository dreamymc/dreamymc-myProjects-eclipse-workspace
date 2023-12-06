import java.util.*;
public class constructorOOP {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 16, 50);
		System.out.print(human1.name+" and ");
		System.out.println(human2.name);
		human2.eat();
		human1.drink();
	}

}
class Human{
	
	String name;
	int age;
	double weight;
	
	
	Human(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void eat() {
		System.out.println(this.name + " is eating");
	}
	void drink() {
		System.out.println(this.name + " is drinking *burp*");
	}
}