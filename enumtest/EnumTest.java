package com.corejava.enumtest;

public class EnumTest {

	public static void main(String[] args) {
		Order []orders=new Order[4];
		orders[0]=new Order(101,"Tables",10,1999,Status.REJECTED);
		orders[1]=new Order(867,"Chairs",30,2999,Status.NEW);
		orders[2]=new Order(5768,"Mobiles",50,3999,Status.ACCEPTED);
		orders[3]=new Order(20,"Earphones",10,4999,Status.COMPLETED);
		for(Order o:orders)
			System.out.println(o);
	}

}

