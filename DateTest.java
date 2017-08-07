class Date{
	private int day;
	private int month;
	private int year;
	
	
	private void setDate(Date temp)
	{
		this.day=temp.day;
		this.month=temp.month;
		this.year=temp.year;
	}
	
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
	
	
	public static void swap(Date []dt)
	{
		Date temp=dt[0];
		dt[0]=dt[1];
		dt[1]=temp;
	}
	
}

public class DateTest{
	
	public static void main(String []args){
		Date []dt=new Date[2];
		dt[0]=new Date(10,8,1995);
		dt[1]=new Date(18,7,1995);
		
		System.out.println("Before swapping :");
		System.out.println(dt[0]);
		System.out.println(dt[1]);
		
		Date.swap(dt);
		
		System.out.println("After swapping :");
		System.out.println(dt[0]);
		System.out.println(dt[1]);
		
	}

}