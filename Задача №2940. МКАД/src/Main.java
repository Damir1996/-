import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int v = scanner.nextInt();
		int t = scanner.nextInt();
		
		int position = t * v % 109;
		
		System.out.println((position + 109) % 109);
	}

}
