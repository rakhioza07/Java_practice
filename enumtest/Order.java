package com.corejava.enumtest;

public class Order
{
	private Status orderStatus;
	private int orderId;
	private String name;
	private int quantity;
	private double price;
	
	public Order( int orderId, String name, int quantity, double price,Status orderStatus) {
	
		this.orderStatus = orderStatus;
		this.orderId = orderId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderStatus=" + orderStatus + ", orderId=" + orderId + ", name=" + name + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	
}