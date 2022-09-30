import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("---------Temperature Converter---------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		double temperature = scanner.nextDouble();
		
		System.out.println("1 - Celsius to Fahrenheit");
		System.out.println("2 - Fahrenheit to Celsius");
		System.out.println("3 - Exit");
		
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		scanner.close();
		
		switch(choice) {
			case 1:
				System.out.println("You chose Celsius to Fahrenheit!");
				double fahrenheit = temperature * 1.8 + 32;
				System.out.printf("%.1f°C is %.1f°F!", temperature, fahrenheit);
				break;
			case 2:
				System.out.println("You chose Fahrenheit to Celsius!");
				double celsius = (temperature - 32) * 5/9;
				System.out.printf("%.1f°F is %.1f°C!", temperature, celsius);
				break;
			case 3:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid Command!");
		}
	}

}
