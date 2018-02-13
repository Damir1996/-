import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¬ведите минимально значение?: ");
		int min = scanner.nextInt();
		System.out.println("¬ведите максимальное значение?: ");
		int max = scanner.nextInt();
		
		int random =(int) (Math.random() * (max -min +1)) + min;
		System.out.printf("—лучайно число от %d до %d: %d", min, max, random);

	}

}
