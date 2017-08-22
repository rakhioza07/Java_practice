package com.corejava.collection;

public class Date{
	private int day;
	private int month;
	private int year;
	

	
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year; 
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setDay(int day)
	{
		this.day=day;
	}	
	public void setMonth(int month)
	{
		this.month=month;
	}	
	public void setYear(int year)
	{
		this.year=year;
	}


	
	@Override
	public boolean equals(Object date) {
		if(this.getMonth()==((Date) date).getMonth())
		{
			if(this.getDay()==((Date) date).getDay())
				return true;
			else return false;
		}
		return false;
		//return true;
	}
	
	@Override
	public int hashCode() {
		//return 7;
		return this.getMonth();
	}
	
}
