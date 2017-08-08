interface Sortable{
	int compare(Sortable s);
	void print();
}
class Employee implements Sortable{
	int id;
	private String name;
	private double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int compare(Sortable s)
	{
		Employee e=(Employee)s;
		if(this.id>e.id)
			return 1;
		else 
			return 0;
}
		
	public void print()
	{
		System.out.println("\n Employee Info :\n Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary :"+salary);
	}
	
}

class Circle implements Sortable{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public int compare(Sortable s)
	{
		Circle c=(Circle)s;
		if(this.radius>c.radius)
			return 1;
		else return 0;
		
	}
	public void print()
	{
		System.out.println("\nCircle info : \n Radius :" + radius);
	}
	
}
public class SortableTest{
	
	public static void main(String []args)
	{
		Sortable []obj=new Sortable[5];
		obj[0]=new Employee(101,"Joey",20000);
		obj[1]=new Employee(269,"Chandler",30000);
		obj[2]=new Employee(308,"Monica",30000);
		obj[3]=new Employee(150,"Ross",30000);
		obj[4]=new Employee(100,"Rachel",30000);
		
		Sortable []obj2=new Sortable[3];
		obj2[0]=new Circle(27);
		obj2[1]=new Circle(17);
		obj2[2]=new Circle(7);
		
		sortAll(obj);
		sortAll(obj2);
			
	}
	
	public static void sortAll(Sortable []arr)
	{
		int n=arr.length;
        for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1].compare(arr[j])==1){  
                                 
                                 Sortable temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
		
		for(Sortable s:arr)
			s.print();
	}
}