import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		char grade;
		grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Fantastic Job!");

		case 'B':
			System.out.println("Good job!");
			
		case 'C':
			System.out.println("You're doing okay");
			break;

		case 'D':
			System.out.println("Please schedule a conference.");
			break;

		case 'F':
			System.out.println("Start finishing homework and showing up to class.");
			break;

		default:
			System.out.println("Invalid Grade");

		}
	}
}