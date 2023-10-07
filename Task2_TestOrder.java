package Lab3;

public class Task2_TestOrder {
	public static void main(String[] args) {
		Task2_Product p1 = new Task2_Product("01", "Coca", 10000, "Drink");
		Task2_Product p2 = new Task2_Product("02", "Pepsi", 9000, "Drink");
		Task2_Product p3 = new Task2_Product("03", "Fanta", 8000, "Drink");
		Task2_Product p4 = new Task2_Product("04", "Aquafina", 5000, "Drink");
		Task2_Product p5 = new Task2_Product("05", "French Fries", 22000, "Food");
		Task2_Product p6 = new Task2_Product("06", "Chicken Fried", 29000, "Food");
		Task2_Product p7 = new Task2_Product("07", "Spagetti", 50000, "Food");
		Task2_Product p8 = new Task2_Product("08", "Hot Dog", 30000, "Food");
		Task2_Product p9 = new Task2_Product("09", "Cheese Burger", 35000, "Food");
		Task2_Product p10 = new Task2_Product("10s", "Cheese Noodles", 45000, "Food");
		
		Task2_OrderItem oi1 = new Task2_OrderItem(p1, 50);
		Task2_OrderItem oi2 = new Task2_OrderItem(p2, 30);
		Task2_OrderItem oi3 = new Task2_OrderItem(p3, 20);
		Task2_OrderItem oi4 = new Task2_OrderItem(p4, 70);
		Task2_OrderItem oi5 = new Task2_OrderItem(p5, 100);
		Task2_OrderItem oi6 = new Task2_OrderItem(p6, 30);
		Task2_OrderItem oi7 = new Task2_OrderItem(p7, 70);
		Task2_OrderItem oi8 = new Task2_OrderItem(p8, 40);
		Task2_OrderItem oi9 = new Task2_OrderItem(p9, 40);
		Task2_OrderItem oi10 = new Task2_OrderItem(p10, 40);
		Task2_OrderItem[] items = { oi1, oi2, oi3, oi4, oi5, oi6, oi7, oi8 };
		
		Task2_Order o1 = new Task2_Order(items);
		
//		System.out.println(o1.cost());
//		System.out.println(Arrays.toString(o1.filter("Food")));
//		System.out.println(Arrays.toString(o1.sort(items)));
		System.out.println(o1.contains(p1));
//		System.out.println(o1.contains(p10));
	}

}
