import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¬ведите первое число: ");
		int firstnumber = scanner.nextInt();
		System.out.print("¬ведите второе число: ");
		int secondnumber = scanner.nextInt();
		
		// == equals
		// != not equals
		// < less than
		// > greater than
		// <= than or equals to
		// >= greater than or equals to
		
		if (firstnumber > secondnumber) {
		System.out.printf("ѕервое число %d ,больше второго числа %d.", firstnumber, secondnumber);
		} else {
		System.out.printf("¬торое число %d , больше или равно первого числа %d. ",secondnumber, firstnumber);
			
		}
	}

}
