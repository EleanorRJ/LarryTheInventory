
public class Product {
	private String name;
	private float price;
	private int stock;
	private String location;
	
	public Product(String name, float price, int stock, String location) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.location = location;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public String getLocation(String location) {
		return this.location;
	}
	
	public String toString() {
		return this.name + ", " + this.price + ", " + this.stock + ", " + this.location;
	}

}
