package com.corejava.java8;

import java.util.*;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<Order> orders=new ArrayList<Order>();
		Predicate<Order> filterByStatus=(order)->order.getStatus().equalsIgnoreCase("ACCEPTED") || order.getStatus().equalsIgnoreCase("COMPLETED");
		Predicate<Order> filterByPrice=(order)->order.getPrice()>10000 ;

		orders.add(new Order(101, 7000, "ACCEPTED"));
		orders.add(new Order(102, 20000, "DENIED"));
		orders.add(new Order(201, 8000, "COMPLETED"));
		orders.add(new Order(341, 10000, "ACCEPTED"));
		orders.add(new Order(69, 20000, "REJECTED"));

		List<Order> listByPrice=filter(orders, filterByPrice);
		List<Order> listByStatus=filter(orders, filterByStatus);

		System.out.println(listByPrice);
		System.out.println(listByStatus);
	}
	public static List<Order> filter(List<Order> orders,Predicate<Order> predicate)
	{
		List<Order> newList=new ArrayList<Order>();
		for(Order order:orders)
		{
			if(predicate.test(order))
			{
				newList.add(order);
			}
		}
		return newList;
	}
}
