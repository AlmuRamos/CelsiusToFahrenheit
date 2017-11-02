import java.util.Scanner;

public class ConversorCelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Introduzca los grados Celsius:");
		double c = lector.nextDouble();
		double f = 32 + (9 *c /5); 
		System.out.println(c + " grados Celsius son " + f + " grados Fahrenheit");

		lector.close();
	}

}
