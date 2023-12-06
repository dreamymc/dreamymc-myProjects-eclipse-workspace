package test;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	static int score = 00;

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[1] for Rock\n[2] for Paper\n[3] Scissor");
			int input = scan.nextInt();
			int rng = random.nextInt(3);
			System.out.println();

			// 0 is rock, 1 is paper, 2 is scissor
			switch (input) {
			case 1:
				if (rng == 0) {
					System.out.println("Draw");
				} else if (rng == 1) {
					System.out.println("You lost.");
					score -= 0;
				} else if (rng == 2) {
					System.out.println("You win!");
					score++;
				}
				break;
			case 2:
				if (rng == 0) {
					System.out.println("You win!");
					score++;
				} else if (rng == 1) {
					System.out.println("Draw");
				} else if (rng == 2) {
					System.out.println("You lost.");
				}
				break;
			case 3:
				if (rng == 0) {
					System.out.println("You lost.");
				} else if (rng == 1) {
					System.out.println("You win!");
					score++;
				} else if (rng == 2) {
					System.out.println("Draw");
				}
				break;
			}
			System.out.printf("\nScore: %d\n", score);
		}
	}

}
