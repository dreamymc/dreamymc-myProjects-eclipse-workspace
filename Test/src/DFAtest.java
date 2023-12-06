import java.util.Scanner;

public class DFAtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of states
        System.out.print("Enter the number of states: ");
        int numStates = scanner.nextInt();
        scanner.nextLine();
        // Input: Alphabets used
        System.out.print("Enter the alphabets (separated by spaces): ");
        String[] alphabets = scanner.nextLine().split(" ");

        // Input: Transition table
        int[][] transitionTable = new int[numStates][alphabets.length];
        System.out.println("Enter the transition table:");
        for (int i = 0; i < numStates; i++) {
            for (int j = 0; j < alphabets.length; j++) {
                System.out.print("Transition for state q" + i + " with alphabet " + alphabets[j] + ": ");
                transitionTable[i][j] = scanner.nextInt();
            }
        }

        // Input: Final state
        System.out.print("Enter the final state: ");
        int finalState = scanner.nextInt();

        // Input: String to check
        System.out.print("Enter the string to check: ");
        String inputString = scanner.next();

        // Check if the string is accepted or rejected
        if (isAccepted(transitionTable, finalState, inputString, alphabets)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }

    private static boolean isAccepted(int[][] transitionTable, int finalState, String inputString, String[] alphabets) {
        int currentState = 0;

        for (char c : inputString.toCharArray()) {
            int alphabetIndex = -1;
            for (int i = 0; i < alphabets.length; i++) {
                if (alphabets[i].charAt(0) == c) {
                    alphabetIndex = i;
                    break;
                }
            }

            if (alphabetIndex == -1) {
                return false; // Reject if the character is not in the alphabet
            }

            currentState = transitionTable[currentState][alphabetIndex];
        }

        return currentState == finalState;
    }
}
