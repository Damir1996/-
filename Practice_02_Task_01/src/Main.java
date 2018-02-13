import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Первое значение?");
		int a = scanner.nextInt();
		System.out.print("Второе значение?");
		int b = scanner.nextInt();
		
		System.out.printf("До перестоновки: a = %d; b = %d;%n",
				a, b 
				);
		// 1-ый Вариант:
		int temp = a;
		a = b;
		b = temp;	
		
		// 2-ой Вариант:
		// a = a + b;
		// b = a - b;
		// a = a - b;
		
		// 3-ий Вариант
		// a += b;
		// b = a - b;
		// a -= b;
		// TODO: произведи перестановку переменных
		
		System.out.printf("После перестоновки: a = %d; b = %d;%n",
				a, b 
				);

	}

}
