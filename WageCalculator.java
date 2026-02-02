import java.util.Scanner;

public class WageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define constants for the pay rates
        final int MANUAL_RATE = 500;
        final int SKILLED_RATE = 700;
        final int MGMT_RATE = 800;

        // Prompt user for number of employees
        System.out.print("Enter number of Manual workers: ");
        int manualCount = input.nextInt();

        System.out.print("Enter number of Skilled workers: ");
        int skilledCount = input.nextInt();

        System.out.print("Enter number of Management staff: ");
        int mgmtCount = input.nextInt();

        // Calculate total wage bill
        double totalWageBill = (manualCount * MANUAL_RATE) + 
                               (skilledCount * SKILLED_RATE) + 
                               (mgmtCount * MGMT_RATE);

        // Calculate tax (20%)
        double taxDue = totalWageBill * 0.20;

        // Output results formatted to 2 decimal places
        System.out.printf("Total Weekly Wage Bill: ", totalWageBill);
        System.out.printf("Approximate Tax (20%%): ", taxDue);

        input.close();
    }
}