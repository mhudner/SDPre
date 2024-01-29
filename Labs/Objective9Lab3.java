import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int selection;

		while(true) {
			printMenu();
			selection = keyboard.nextInt();

			if (selection == 1) {
				System.out.println("Hello World \n \n \n ");
			}

			else if (selection == 2) {
				System.out.println(" 1: Apple \n 2: Banana \n 3: Coconut \n \n \n");
			}

			else if (selection == 3) {
				System.out.println("Goodbye");
			}

			else {
				System.out.println("Invalid selection. Try again.");
				break;
			}
					}
			keyboard.close();
			
		}


		public static void printMenu() {
			System.out.println("_________Menu_________");
			System.out.println("1: Say hello");
			System.out.println("2: List my favorite foods");
			System.out.println("3: Exit");
			System.out.println();
		}
	}