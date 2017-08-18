package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		UnaryOperator<String> operator=str->str.toUpperCase();
		List<String> list=new ArrayList<String>();

		list.add("Amar");
		list.add("Bipin");
		list.add("Charlie");
		list.add("Demon");
		
		System.out.println("List :"+list);
		list.replaceAll(operator);
		System.out.println("List :"+list);
		

	}

}
