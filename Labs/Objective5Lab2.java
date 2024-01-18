import java.util.Scanner;

public class Objective5Lab2 {

	public static void main(String[] args) {

		String string1 = "Banana";
		String string2 = "Bacon";
		String string3 = "Banana";

		if (string1.equals(string2)) {
			System.out.println(string1 + " is equivelent to " + string2);
		}
		else if (string1 != string2) {
			System.out.println(string1 + " is not equivalent to " + string2);
			System.out.println(string1 + " is equivelent to " + string3);
		
		}
			

	}


	/*Banana is not equivalent to Bacon
	  Banana is equivalent to Banana*/

}