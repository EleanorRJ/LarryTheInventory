
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Inventory shopStock = new Inventory();
		UserInterface ui = new UserInterface(scanner, shopStock);
		
		ui.start();

	}
}
