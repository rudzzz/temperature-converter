import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("---------Temperature Converter---------");
		System.out.println("1 - Celsius to Fahrenheit");
		System.out.println("2 - Fahrenheit to Celsius");
		System.out.println("3 - Exit");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		String choice = scanner.next();
		scanner.close();
		
		System.out.println("Your choice was: " + choice);
	}

}
