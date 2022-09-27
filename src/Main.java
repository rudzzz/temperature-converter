import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("---------Temperature Converter---------");
		System.out.println("1 - Celsius to Fahrenheit");
		System.out.println("2 - Fahrenheit to Celsius");
		System.out.println("3 - Exit");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		scanner.close();
		
		switch(choice) {
			case 1:
				System.out.println("You choose Celsius to Fahrenheit!");
				break;
			case 2:
				System.out.println("You choose Fahrenheit to Celsius!");
				break;
			case 3:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid Command!");
		}
	}

}
