import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¬ведите первое число: ");
		int firstnumber = scanner.nextInt();
		System.out.print("¬ведите второе число: ");
		int secondnumber = scanner.nextInt();
		System.out.print("¬ведите третье число: ");
		int thirdnumber = scanner.nextInt();
		
		int greatestnumber;
		if (firstnumber > secondnumber) {
			greatestnumber = firstnumber;
			}else {
			greatestnumber = secondnumber;
		if (firstnumber > thirdnumber) {
			greatestnumber = firstnumber;
			}else {
			greatestnumber = thirdnumber;
		if (secondnumber > firstnumber) {
			greatestnumber = secondnumber;
			}else {
				greatestnumber = firstnumber;
		if (secondnumber > thirdnumber) {
			greatestnumber = secondnumber;
			}else {
				greatestnumber = thirdnumber;
		if (thirdnumber > firstnumber) {
			greatestnumber = thirdnumber;
			}else {
				greatestnumber = firstnumber;
		if (thirdnumber > secondnumber) {
			greatestnumber = thirdnumber;
			}else {
				greatestnumber = secondnumber;
		}
		}
		}
			}
		}
		
		}
		System.out.printf("„исло %d €вл€етс€ максимальным.\n", greatestnumber);
	}
}
