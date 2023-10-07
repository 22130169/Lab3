package Lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Task2_Order {
	public Task2_OrderItem[] items;

	public Task2_Order(Task2_OrderItem[] items) {
		this.items = items;
	}

	public double cost() {
		int cost = 0;
		for (int i = 0; i < items.length; i++) {
			cost += items[i].getPrice();
		}
		return cost;
	}

// using binary search approach
	public boolean contains(Task2_Product p) {
		Task2_OrderItem[] newItem = sort(items);
		int mid = newItem.length / 2;
		int left = 0;
		int right = newItem.length - 1;
		while (left < right) {
			if (p.getPrice() > newItem[mid].getPrice()) {
				left = mid + 1;
				mid = newItem.length - 1 - ((right - left) / 2);
			}
			if (p.getPrice() < newItem[mid].getPrice()) {
				right = mid - 1;
				mid = (right - left) / 2;
			}
			if (p.getPrice() == newItem[mid].getPrice()) {
				return true;
			}
			if (right == left && p.getPrice() == newItem[mid].getPrice()) {
				return true;
			}
		}
		return false;
	}

	public boolean contains2(Task2_Product p) {
		Task2_OrderItem[] newItem = sort(items);
		int left = 0;
		int right = newItem.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int comparison = newItem[mid].getProduct().getPrice().compareTo(p.getPrice());
			if (comparison == 0) {
				return true;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}

// get all products based on the given type using linear search
	public int getLength(Task2_OrderItem[] items, String type) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getType() == type) {
				count++;
			}
		}
		return count;
	}

	public Task2_Product[] filter(String type) {
		Task2_Product[] correctOnType = new Task2_Product[getLength(items, type)];
		int index = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getType() == type) {
				correctOnType[index++] = items[i].getProduct();
			}
		}
		return correctOnType;
	}

	public Task2_OrderItem[] sort(Task2_OrderItem[] items) {
		Arrays.sort(items,Comparator.comparing(item -> item.getProduct().getPrice()));
		return items;
	}

}
