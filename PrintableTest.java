class Employee implements Printable{
	private int id;
	private String name;
	private double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void print()
	{
		System.out.println("\n Employee Info :\n Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary :"+salary);
	}
	
}
class Circle implements Printable{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void print()
	{
		System.out.println("\nCircle info : \n Radius :" + radius);
	}
}
interface Printable{
	void print();
}
public class PrintableTest{
	
	public static void main(String []args)
	{
		Printable []obj=new Printable[3];
		obj[0]=new Employee(101,"Joey",20000);
		obj[1]=new Circle(27);
		obj[2]=new Employee(269,"Chandler",30000);
		
		printAll(obj);
	}
	
	public static void printAll(Printable []obj)
	{
		for(Printable p:obj)
			p.print();
	}
}