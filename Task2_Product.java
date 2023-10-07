package Lab3;

public class Task2_Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public Task2_Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public int getPrice() {
		return (int) price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return id + " - " + name + " - " + price + " - " + "(" + type + ")";
	}

}
