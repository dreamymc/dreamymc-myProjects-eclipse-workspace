package HISTORIA;

import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        do {
        System.out.print("Enter your name so I can greet you: ");
        name = sc.nextLine();
        }while(name.equals(""));
        String[][] questionsAndAnswers = {
            {"What is your name?", "My name is Historia."},
            {"What is your purpose?", "My purpose is to answer questions."},
            {"What is the meaning of life?", "The meaning of life is a philosophical question that has been debated by scholars for centuries."},
            {"What is my name?", "Your name is " + name},
            {"How are you?", "I am doing good, thank you."}
        };
        boolean flag = true;


        while (true) {
            System.out.print("Ask me a question: ");
            String question = sc.nextLine();
            for (String[] qa : questionsAndAnswers) {
                if (qa[0].equalsIgnoreCase(question)) {
                    System.out.println(qa[1]);
                    flag = true;
                    break;
                }else 
                	flag = false;
                
            }
            if(flag == false) {
            	System.out.println("Question cannot be answered. ");
            }
        }
        

    }
}
