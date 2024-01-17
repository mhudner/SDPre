import java.util.Scanner;
public class Objective4Lab3 {
	public static void main (String[] args) {
		int birthYear, age = 0, currentYear = 0;


		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old will you be this year?");
		age = keyboard.nextInt();
		System.out.println("What is the current year?");
		currentYear = keyboard.nextInt();
		
		birthYear = currentYear - age;

		System.out.println("You were born in " + birthYear);
		keyboard.close();




	}
}