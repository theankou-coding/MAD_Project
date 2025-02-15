import java.util.Scanner;

public class SimpleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print a message
        System.out.println("Hello, World!");

        // Take user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display user input
        System.out.println("Welcome, " + name + "!");

        scanner.close();
    }
}
