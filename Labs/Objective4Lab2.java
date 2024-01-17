import java.util.Scanner;
public class  Objective4Lab2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
		

		System.out.println("Please enter the first number you would like to add."); 
		num1 = keyboard.nextInt();
		System.out.println("Please enter the second number you would like to add."); 
		num2 = keyboard.nextInt();
		System.out.println("Please enter the third number you would like to add."); 
		num3 = keyboard.nextInt();
		System.out.println("Please enter the first decimal you would like to add."); 
		dub1 = keyboard.nextDouble();
		System.out.println("Please enter the second decimal you would like to add."); 
		dub2 = keyboard.nextDouble();
		System.out.println("Please enter the third decimal you would like to add."); 
		dub3 = keyboard.nextDouble();

		int sumN = num1 + num2 + num3;
		double sumD = dub1 + dub2 + dub3;
		
		System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sumN);
		System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sumD);


	}
}