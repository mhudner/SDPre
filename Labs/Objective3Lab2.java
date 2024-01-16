public class Objective3Lab2 {
	public static void main(String[] args) {
		double side1 = Math.sqrt(10 * 10), side2 = Math.sqrt(8 * 8);
		double hypotenuse = Math.hypot(side1, side2);

		System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is " + hypotenuse);

	}
}