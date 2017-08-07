final class Singleton
{	
	private static Singleton object;
	
	private Singleton(){}
	
	public static Singleton getInstance()
	{
		if(object==null)
			object=new Singleton();
		
		return object;
	}
	
	public void testMethod()
	{
		System.out.println("This is a test method");
	}
}

public class SingletonTest
{
	public static void main(String []args){	
		
		Singleton s1=Singleton.getInstance();
		s1.testMethod();
	}
	
}