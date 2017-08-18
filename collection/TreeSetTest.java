package com.corejava.collection;
import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Person> personSet=new TreeSet<Person>(new WeightSort());
		
		Person p1=new Person("Rakhi", 5.4, 68.0);
		Person p2=new Person("Ankit", 5.11, 68.0);
		Person p3=new Person("Purushottam", 5.3, 70);
		Person p4=new Person("Jayashree", 6.0, 58);

		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		Iterator<Person> itr=personSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
