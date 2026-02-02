import java.util.Scanner;
public class Centimeter{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter your value in meters: ");
	 double value = input.nextDouble();
	 double centimeters=value*100;
	 System.out.println(centimeters);
	 input.close();
	 }
}
	 