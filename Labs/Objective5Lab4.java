import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {


		int num;

		System.out.println("Please enter a number");
		Scanner keyboard = new Scanner(System.in);
		num = keyboard.nextInt();


		if (num % 2 == 0) {
			System.out.println("The number is even");
		} 

		else {
			System.out.println("The number is odd");
		}

		keyboard.close();
	}
}