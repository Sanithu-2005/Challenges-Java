import java.util.Scanner;
public class Fahren{
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your value in Centi:");
	double value = input.nextDouble();
	double fa=(9/5)*value+32;
	System.out.println(fa);
		 input.close();
	 }
}
	 
	