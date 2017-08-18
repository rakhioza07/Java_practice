package com.corejava.generics;
import java.awt.print.Printable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class Test<T>
{
	T var;
	public void set(T var)
	{
		this.var=var;
	}
	public T get()
	{
		return this.var;
	}
	
	public static void printList(List<? extends Number> list)
	{
		Iterator< ?> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println("\t"+itr.next());
		}
	}
	
	public static void printMapKeyValues(HashMap<? extends Number,?> map) {
		for(Map.Entry<? extends Number,?> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

public class GenericTest {

	public static void main(String[] args) {
//		Test<Integer> t1=new Test<Integer>();
//		t1.set(10);
//		System.out.println(t1.get());
//		
//		Test<String> t2=new Test<String>();
//		t2.set("test");
//		System.out.println(t2.get());

		
//		List<Integer> list1=new ArrayList<Integer>();
//		for (int j = 1; j <= 10; j++) 
//			list1.add(j);
//		Test.printList(list1);
//
//		List<String> list2=new ArrayList<String>();
//		//Test.printList(list2);

		
		HashMap< Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "January");
		map.put(2, "February");
		map.put(3, "March");
		
		Test.printMapKeyValues(map);
		

	}

}

