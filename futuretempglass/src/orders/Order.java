package orders;

import items.Item;

import java.util.List;

public class Order {
	
	private String orderNumber;

	private List<Item> items;
	
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	
}
