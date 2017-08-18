package com.corejava.collection;
import java.util.*;

class Person
{
	private String name;
	private double heightInInches;
	private double weight;
	
	public Person(String name,double heightInInches, double weight)
	{
		this.name=name;
		this.heightInInches=heightInInches;
		this.weight=weight;
	}
	
	public String toString()
	{
		return "Name : " + name + " \tHeightInInches : "  + heightInInches + " \tWeight : " + weight;
	}
	
	public String getName()
	{
		return this.name;
	}
	public double getHeight()
	{
		return this.heightInInches;
	}
	public double getWeight()
	{
		return this.weight;
	}
}

class NameSort implements Comparator
{
	public int compare(Object o1,Object o2){  
		Person s1=(Person)o1;  
		Person s2=(Person)o2;  
	  
		if(s1.getName().equals(s2.getName()))  
			return 0;  
		else if(s1.getName().compareTo(s2.getName()) > 0)  
			return 1;  
		else  
			return -1;  
	}
}

class WeightSort implements Comparator<Object>
{
	public int compare(Object o1,Object o2){  
		Person s1=(Person)o1;  
		Person s2=(Person)o2;  
	  
		if(s1.getWeight() == s2.getWeight())  
		{
			if(s1.getHeight() == s2.getHeight())  
				return 0;  
			else if(s1.getHeight() > s2.getHeight())  
				return -1;  
			else  
				return 1;			
		}  
		else if(s1.getWeight() > s2.getWeight())  
			return 1;  
		else  
			return -1; 
	}
}