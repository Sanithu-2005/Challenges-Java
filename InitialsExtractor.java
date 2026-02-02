import java.util.Scanner;

public class InitialsExtractor {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user for their first name
        System.out.println("Enter your name: ");
        String firstName = input.next();

        // Ask the user for their surname
        System.out.println("Enter your surname: ");
        String surname = input.next();

        // Extract the first letter of each
        String firstInitial = firstName.substring(0, 1);
        String secondInitial = surname.substring(0, 1);

        // Print the result in uppercase to keep it consistent
        System.out.println("Initials: " + firstInitial.toUpperCase() + secondInitial.toUpperCase());
        
        input.close();
    }
}