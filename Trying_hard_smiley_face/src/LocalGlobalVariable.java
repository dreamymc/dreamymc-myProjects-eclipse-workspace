import java.util.Random;

public class LocalGlobalVariable {

	public static void main(String[] args) {

		DiceRollerLocal diceroll1 = new DiceRollerLocal();
		DiceRollerGlobal diceroll2 = new DiceRollerGlobal();
	}

}

class DiceRollerLocal {

	DiceRollerLocal() {
		Random random = new Random();
		int number = 0;
		roll(random, number);
	}

	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		switch(number) {
		case 1:
			System.out.println("I");
			break;
		case 2:
			System.out.println("II");
			break;
		case 3:
			System.out.println("III");
			break;
		case 4:
			System.out.println("IV");
			break;
		case 5:
			System.out.println("V");
			break;
		case 6:
			System.out.println("VI");
			break;
		}
		
	}
}

class DiceRollerGlobal {

	Random random;
	int number;

	DiceRollerGlobal() {
		random = new Random();
		number = 0;
		roll();
	}

	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}