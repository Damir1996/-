import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(" Введите натурально число " + number);
		int a = number % 10;
		System.out.println(" Последняя цифра " + a);
	}

}
