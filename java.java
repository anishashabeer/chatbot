import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii! I'm a chatbot. Type 'quit' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            } else if (userInput.equalsIgnoreCase("hello")) {
                System.out.println("Hello!");
            } else if (userInput.equalsIgnoreCase("how are you")) {
                System.out.println("I'm doing well, thanks for asking!");
            } else if (userInput.contains("what is your name")) {
                System.out.println("My name is Chatbot!");
            } else {
                System.out.println("I didn't understand that.");
            }
        }
    }
}
        
