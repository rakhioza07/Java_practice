package com.corejava.java8;
import java.util.*;
import java.util.function.*;
public class ConsumerTest {

	public static void main(String[] args) {
		StringBuilder letters=new StringBuilder();
		Consumer<String> consumer=str->letters.append(str.charAt(0));
		List<String> list=new ArrayList<String>();

		list.add("Amar");
		list.add("Bipin");
		list.add("Charlie");
		list.add("Demon");
		
		list.forEach(consumer);
		System.out.println("List :"+list);
		System.out.println("String :"+letters);
	}

}
