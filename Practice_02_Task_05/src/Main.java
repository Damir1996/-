import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������� ����������� � �������� ����������:");
		double degreesFahrenheit = scanner.nextDouble();
		double degreesCelsius = 5.0 / 9.0 * (degreesFahrenheit - 32);
		
		//2-�� �������
		//double degreesCelsius = 5d / 9 * (degreesFahrenheit - 32);
		//3-�� �������
		//double degreesCelsius = (degreesFahrenheit - 32)* 5 / 9;
		
		// int		float		: 4 byte
		// long		double		: 8 byte
		// floating point numbers
		// fixed point numbers
		
			
			System.out.println("����������� � �������� �������:" + degreesCelsius);
	}

}
