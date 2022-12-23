package entities;

import java.util.ArrayList;
import java.util.List;

import orderStatus.OrderStatus;

public class Order {
	
	private OrderStatus status;
	private Client client;
	private List <OrderItem> items = new ArrayList<>();
	
	public Order() {}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItems(OrderItem orderItem) {
		items.add((OrderItem) orderItem);
	}
	
	public void removeItems(List item) {
		items.remove(item);
	}
	
}
