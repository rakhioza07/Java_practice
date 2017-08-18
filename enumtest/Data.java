package com.corejava.enumtest;


import java.util.*;

class Data
{
	private HashMap<Integer,ArrayList<Object>> userData=new HashMap<>();
	
	class Cache
	{
			
			public void insertData(int id,String name)
			{
				ArrayList<Object> list=new ArrayList<>();
				list.add(name);
				list.add(new Date());
				userData.put(id, list);
			}
			public ArrayList<Object> getData(int key)
			{
				return userData.get(key);
			}
	}
	
	Cache cache=new Cache();
	
	public void setRecord(int id,String name)
	{
		cache.insertData(id, name);
	}
	
	public ArrayList<Object> getRecord(int key)
	{
		return cache.getData(key);
	}
}