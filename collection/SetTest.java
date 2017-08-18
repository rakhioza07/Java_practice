package com.corejava.collection;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		HashSet< Integer> hashSet=new HashSet<Integer>();
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		
		for (int i = 10; i > 0; i--) {
			hashSet.add(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			linkedHashSet.add(i);
		}
		
		System.out.println("HashSet :"+hashSet);
		System.out.println("LinkedHashSet : "+linkedHashSet);
	}

}
