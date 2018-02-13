
public class Main {

	public static void main(String[] args) {
		double number = 0.0;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		number  = number + 0.1;
		
		//System.out.printf("%f%n", number);
		//if (number == 1.0) {
		if (Math.abs(number - 1.0) < 0.000001) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}

}
