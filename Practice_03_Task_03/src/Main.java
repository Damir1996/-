import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ������ �����: ");
		int firstnumber = scanner.nextInt();
		System.out.print("������� ������ �����: ");
		int secondnumber = scanner.nextInt();
		
		// == equals
		// != not equals
		// < less than
		// > greater than
		// <= than or equals to
		// >= greater than or equals to
		
		if (firstnumber > secondnumber) {
		System.out.printf("������ ����� %d ,������ ������� ����� %d.", firstnumber, secondnumber);
		} else {
		System.out.printf("������ ����� %d , ������ ��� ����� ������� ����� %d. ",secondnumber, firstnumber);
			
		}
	}

}
