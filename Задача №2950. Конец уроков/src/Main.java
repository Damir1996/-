import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = n * 45 + (n / 2) * 5 + (n - 1) / 2 * 15;
		
		System.out.printf("%d %d%n", 9 + t / 60, t % 60);

	}

}
