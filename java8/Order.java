package com.corejava.java8;

public class Order
{
	public Order(long orderId, double price, String status) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.status = status;
	}
	private long orderId;
	private double price;
	private String status;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", price=" + price + ", status=" + status + "]\n";
	}
}