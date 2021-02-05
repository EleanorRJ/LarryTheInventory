
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Inventory shopStock = new Inventory();
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
			 		for (String item : shopStock.listOfInventory()) {
			 			System.out.println(item);
			 		}
			 		break;
			 		
			 	case "2":
			 		System.out.print("Product name: ");
			 		String productName = scanner.nextLine();
			 		shopStock.fetchProduct(productName);
			 		break;
			 		
			 	//consider how there next 3 options will be done. I suppose they will 
			 	//use the same methods? They will probably need methods in this class
			 	//at least for the sake of readability. Should the whole interface be
			 	//its own class?
			 	case "3":
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
}
