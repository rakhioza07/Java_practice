class Employee{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}

class Labour extends Employee{
	
	private double overtime;
	
	public Labour(int id,String name,double salary,double overtime)
	{
		super(id,name,salary);
		this.overtime=overtime;
	}	
	
	public double getSalary()
	{
		return super.getSalary() + this.overtime;
	}	
}

class Manager extends Employee{
	
	private double incentive;
	
	public Manager(int id,String name,double salary,double incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}	
	
	public double getSalary()
	{
		return super.getSalary() + this.incentive;
	}		
}


public class EmployeeTest{
	
	public static double getTotalSalaryOfAllEmployees(Employee []emp)
	{
		double salary=0.0;
		
		for(Employee e:emp)
		{
			salary+=e.getSalary();
		}
		
		return salary;
	}
	public static void main(String []args){
		
		Employee []e=new Employee[3];
		e[0]=new Labour(101,"Edward",10000,2000);
		e[1]=new Labour(102,"James",10000,5000);
		e[2]=new Manager(201,"Rheagar",20000,10000);
		
		System.out.println("Total salary is : "+ getTotalSalaryOfAllEmployees(e));
	}
}