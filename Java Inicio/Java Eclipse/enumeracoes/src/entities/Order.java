package entities;

import java.sql.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, OrderStatus status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + "]";
	}
	
	
}
