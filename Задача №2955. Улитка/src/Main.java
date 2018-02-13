import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int realH = h - a;
		int diff = a - b;
		int days = 1 + realH / diff + (realH % diff + diff - 1) / diff;
		
		System.out.println(days);
		

	}

}
