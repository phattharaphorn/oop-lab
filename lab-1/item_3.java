import java.util.Scanner;

public class item_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		if (number > 1000 || number < 0) {
			System.out.println("Number out of Range");
			return;
		}
		int lessThan10 = number % 10;
		number /= 10;
		int tens = number % 10;
		number /= 10;
		int hundreds = number % 10;
		number /= 10;
		int sum = hundreds + tens + lessThan10;
		System.out.println("The sum of the digits is " + sum);
	}
}