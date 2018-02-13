import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int a = number / 100;
		int b = number / 10 % 10;
		int c = number %10;
		
		int sum = number /100 + number /10 % 10 + number %10;
		System.out.print(sum);
		
	}

}
