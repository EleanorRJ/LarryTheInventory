import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

	private Scanner scanner;
	private Inventory inventory;
	
	public UserInterface(Scanner scanner, Inventory inventory) {
		this.scanner = scanner;
		this.inventory = inventory;
	}
	
	public void start() {
		boolean quit = false;
		
		while (quit == false) {
			System.out.println("Enter the number of the task you would like to do");
			System.out.println("1. What is in the inventory?");
			System.out.println("2. Tell me about this product");
			System.out.println("3. Add item");
			System.out.println("4. Remove item");
			System.out.println("5. Change item");
			System.out.println("9. Quit");
			
			String input = scanner.nextLine();
			switch(input) {
			 	case "1":
			 		for (String item : inventory.listOfInventory()) {
			 			System.out.println(item);
			 		}
			 		break;
			 		
			 	case "2":
			 		System.out.print("Product name: ");
			 		String productName = scanner.nextLine();
			 		String productInfo = inventory.fetchProduct(productName);
			 		System.out.println(productInfo);
			 		break;
			 		
			 	//consider how there next 3 options will be done. I suppose they will 
			 	//use the same methods? They will probably need methods in this class
			 	//at least for the sake of readability. Should the whole interface be
			 	//its own class?
			 	case "3":
			 		addProductInterface();
			 		break;
			 	case "4":
			 		break;
			 	case "5":
			 		break;
			 	case "9":
			 		quit = true;
			 		break;
			 	default:
			 		System.out.println("Input invalid. Please try again");
			}		
		}
	}
	
	public void addProductInterface() {
		//name, price, stock, location
		System.out.println("Enter product name:");
		String name = scanner.nextLine();
		System.out.println("Enter product price");
		float price = Float.valueOf(scanner.nextLine());
		System.out.println("How many of " + name + " are being added to the inventory?");
		int stock = Integer.valueOf(scanner.nextLine());
		System.out.println("What is the location of " + name + " in the stockroom?");
		System.out.println("Enter stockroom letter with row number e.g A1 or C10. If it has no location enter X.");
		String location = scanner.nextLine();
		
		inventory.addProduct(name, price, stock, location);
		System.out.println("Product " + name + " has been added to the inventory");
	}
}
