
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		
		while (quit == false) {
			System.out.println("Enter the number of the task you would like to do");
			System.out.println("1. What is your inventory?");
			System.out.println("2. Tell me about this product");
			System.out.println("3. Add item");
			System.out.println("4. Remove item");
			System.out.println("5. Change item");
			System.out.println("9. Quit");
			
			String input = scanner.nextLine();
			switch(input) {
			 	case "1":
				 break;
			 	case "2":
				 break;
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
