package com.corejava.java8;
import java.util.*;
import java.util.function.Predicate;
public class RemoveIfTest {

	public static void main(String[] args) {
		Predicate<String> oddLength=word-> word.length()%2!=0;
		ArrayList<String> list=new ArrayList<String>();

		list.add("AB");
		list.add("ABC");
		list.add("ABD");
		list.add("ABDFH");
		list.add("ABFFHF");
		list.add("ABFF");
		list.add("ABUZ");
		
		System.out.println(list);
		
		list.removeIf(oddLength);
		System.out.println(list);
	}

}
