import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите вещественное число: ");
		double number = scanner.nextDouble();
		double absoluteNumber = number;
		
		//boolean value = false, true
		// true , false;
		// 1	0
		if (absoluteNumber < 0.0) {
			absoluteNumber *= -1;
		}
		
		System.out.printf("|%.3f| = %.3f%n" , number , absoluteNumber);
	}

}
