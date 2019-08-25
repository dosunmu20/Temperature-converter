// Program to read celsius temperature and convert it to fahrenheit
import java.util.Scanner;

public class Temperature { // start of class Temperature
	
	
	
	public static void main (String args[]) { // start of method main
	 
		// create a Scanner variable
		Scanner input = new Scanner (System.in);
		 
		// Variable declarations 
		double celsius, fahrenheit;
		
		System.out.println("Enter your temperature (celsius scale): ");
		celsius = input.nextDouble();
		
		// Conversion of the temperature 
		fahrenheit = (9.0*celsius/5.0) + 32.0;
		
		System.out.printf("The temperature on the fahrenheit scale is %.2f", fahrenheit);
		
	} // end of method main 
} // end of class Temperature
