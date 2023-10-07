package Lab3;

public class Task2_OrderItem {
	private Task2_Product p;
	private int quantity;

	public Task2_OrderItem(Task2_Product p, int quantity) {
		this.p = p;
		this.quantity = quantity;
	}

	public double getPrice() {
		return p.getPrice();
	}

	public String getName() {
		return p.getName();
	}

	public String getType() {
		return p.getType();
	}

	public Task2_Product getProduct() {
		return p;
	}

	public String toString() {
		return p.toString() + " " + quantity + " ";
	}

}
