import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ������������ �����:");
		int number = scanner.nextInt();
		
		// int number = 1234
		
		 //int a = number / 1000; // 1
		 //int b = number / 100 % 10; // 2
		 //int c = number / 10 % 10; // 3
		 //int d = number % 10; // 4
		 
		
		// 1234 / 10 = 123 % 10
		
		// TODO: ����� ����� �����
		
		 int a = number / 1000; // 1
		 int b = number / 100 % 10; // 2
		 int c = number / 10 % 10; // 3
		 int d = number % 10; // 4
		 
		 int sum = number / 1000 + number / 100 % 10 + number /10 % 10 + number %10;
		
		System.out.printf("����� ���� ���� ����� %d ����� %d", number, sum);
		
	}

}
