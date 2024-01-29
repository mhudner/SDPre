public class MethodPractice {
	public static void main(String[] args) {

		printRectangle();
	}

	public static void printSquare() {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");

		while (printRectangle <= 2) {
			printSquare();
		}
	}
	public static void printRectangle() {
		printSquare();
		printSquare();
	}
}