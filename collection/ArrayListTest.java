package com.corejava.collection;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list1.add(i);
		}
		
		ListIterator<Integer> listItr=list1.listIterator();
		while(listItr.hasNext())
			listItr.next();
		
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}

}
