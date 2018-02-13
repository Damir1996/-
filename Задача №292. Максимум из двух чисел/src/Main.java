import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstnumber = scanner.nextInt();		
		int secondnumber = scanner.nextInt();
		
		if (firstnumber > secondnumber) {
			System.out.println(firstnumber);
		} else {
			System.out.println(secondnumber);
			
		}
	}

}
