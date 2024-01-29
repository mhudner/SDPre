import java.util.Scanner;

public class ParameterExample {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String item;
		int quantity;
		System.out.println("Please enter your inventory item: ");
		item = kb.nextLine();
		System.out.println("Please enter the quantity: ");
		quantity = kb.nextInt();
		printInventory(item, quantity);
		// or use printInventory("tomatoes", 12);
	}

	public static void printInventory(String inventoryItem, int numberOfInventoryItems) {
		System.out.println("There are currently " + numberOfInventoryItems + " " + inventoryItem + " left.");
		
	}
}