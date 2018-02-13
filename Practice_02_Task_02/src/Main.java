import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¬ведите четрЄхзначное число:");
		int number = scanner.nextInt();
		
		// int number = 1234
		
		 //int a = number / 1000; // 1
		 //int b = number / 100 % 10; // 2
		 //int c = number / 10 % 10; // 3
		 //int d = number % 10; // 4
		 
		
		// 1234 / 10 = 123 % 10
		
		// TODO: найди сумму чисел
		
		 int a = number / 1000; // 1
		 int b = number / 100 % 10; // 2
		 int c = number / 10 % 10; // 3
		 int d = number % 10; // 4
		 
		 int sum = number / 1000 + number / 100 % 10 + number /10 % 10 + number %10;
		
		System.out.printf("—умма всех цифр числа %d равна %d", number, sum);
		
	}

}
