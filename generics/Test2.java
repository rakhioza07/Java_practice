package com.corejava.generics;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test2 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> concurrentHashMap=new ConcurrentHashMap<>();
		boolean flag=true;
		concurrentHashMap.put(1, "a");
		concurrentHashMap.put(2, "b");
		concurrentHashMap.put(3, "c");
		
		Iterator<Integer> itr=concurrentHashMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			if(flag)
			{
				concurrentHashMap.put(4, "d");
				concurrentHashMap.put(5, "e");
				flag=false;
			}
			System.out.println(concurrentHashMap.get(itr.next()));
		}

	}

}
