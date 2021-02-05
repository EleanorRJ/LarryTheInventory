import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Product> inventory;
	
	public Inventory() {
		this.inventory = new ArrayList<>();
	}
	
	//Returns content of the inventory as an ARRAYLIST of strings.
	//If it is empty, returns an arraylist with one entry that says as such.
	//Should it do that? Will that be a problem if the method is used in other ways?
	public ArrayList<String> listOfInventory() {
		ArrayList<String> inventoryContent = new ArrayList<>();
		if (this.inventory.isEmpty()) {
			inventoryContent.add("The inventory is empty");
			return inventoryContent;
		}
		
		for (Product product : this.inventory) {
			inventoryContent.add(product.toString());
		}
		return inventoryContent;
	}
	
	//Returns the toString of the product passed to it
	//Again, should it return product not found?
	//Does that limit other potential uses?
	public String fetchProduct(String searchProduct) {
		for (Product product : this.inventory) {
			if (product.getName().equals(searchProduct)) {
				return product.toString();
			}
		}
		return "Product not found";
	}
	
	public void addProduct() {
		
	}

}
