package com.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		StringBuilder keyValueString=new StringBuilder();
		HashMap<Integer, String> empMap=new HashMap<Integer,String>();
		
		empMap.put(1,"Anand");
		empMap.put(2,"Omkar");
		empMap.put(3,"Ninad");
		empMap.put(4,"Sanjeev");
		
		System.out.println("EmpMap : "+empMap);
		BiConsumer<Integer,String> consumer=(key,value)->{
				keyValueString.append(" "+key);
				keyValueString.append(":"+value+" ");
		};
		empMap.forEach(consumer);
		
		System.out.println(keyValueString);
	}
}
