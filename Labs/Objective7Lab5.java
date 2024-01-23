import java.util.Scanner;

public class Objective7Lab5 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int selection;

		while (true) {
			System.out.println(" ___________Menu__________");
			System.out.println("|                         |");
			System.out.println("|1: Say Hello             |");
			System.out.println("|2: List my favorite foods|");
			System.out.println("|3: Exit                  |");
			System.out.println("|_________________________|");

			selection = keyboard.nextInt();

			if (selection == 1) {
				System.out.println("Hello World \n \n \n ");
			}

			else if (selection == 2) {
				System.out.println(" 1: Apple \n 2: Banana \n 3: Coconut \n \n \n");
			}

			else if (selection == 3) {
				System.out.println("Goodbye");
				break;
			}

			else {
				System.out.println("Invalid selection - Please try again \n \n \n");
			}

		}

		keyboard.close();

	}
}