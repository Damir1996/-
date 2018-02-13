import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double CENTIMETERS_IN_INCHES = 2.54; 
		Scanner scanner = new Scanner(System.in);
		
		// 1-ЫЙ ВАРИАНТ
		//System.out.print("Введите значение в дюймах?: ");
		//double valueInInches = scanner.nextDouble();
		//double valueInCentimeters = valueInInches * 2.54;
		
		//System.out.printf("%.2f дюйм. = %.2f см.", valueInInches, valueInCentimeters);
		
		System.out.print("Введите значение в дюймах?: ");
		double inches = scanner.nextDouble();
		double centimeters = inches * CENTIMETERS_IN_INCHES ;
		
		System.out.printf("%.2f = %.2f", inches, centimeters);

	}

}
