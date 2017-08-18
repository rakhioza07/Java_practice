package com.corejava.collection;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Date, String> empMap=new HashMap<Date,String>();
		empMap.put(new Date(10,8,1995),"Anand");
		empMap.put(new Date(5,10,1992),"Omkar");
		empMap.put(new Date(10,8,1998),"Ninad");
		empMap.put(new Date(18,7,1994),"Sanjeev");
		
		System.out.println("EmpMap : "+empMap);
		for(Date key :empMap.keySet())
			System.out.println(empMap.get(key));
		
		
	}

}
