import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� ���������� ��������?: ");
		int min = scanner.nextInt();
		System.out.println("������� ������������ ��������?: ");
		int max = scanner.nextInt();
		
		int random =(int) (Math.random() * (max -min +1)) + min;
		System.out.printf("�������� ����� �� %d �� %d: %d", min, max, random);

	}

}
