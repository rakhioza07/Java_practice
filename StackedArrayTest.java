class StackedArray {
	
	private int arr[];
	private static int TOP=-1;
	
	public StackedArray()
	{
		arr=new int[50];
	}
	
	public void push(int item)
	{
		if(TOP>50)
		{
			System.out.println("Stack is full.");
		}
		arr[++TOP]=item;
	}
	
	public int pop()
	{
		if(TOP<0)
		{
			return -1;
		}
		return arr[TOP--];
	}
	
	public void printStack()
	{
		System.out.println();
		for(int i=TOP,j=0;i>=0;i--,j++)
		{
			System.out.print(" "+arr[j]);
		}
		System.out.println();
	}	
}

class StackedArrayTest
{
	public static void main(String []args){	
		
		StackedArray s1=new StackedArray();
		int item=s1.pop();
		if(item==-1)
			System.out.println("Stack is empty");
		
		for(int i=1 ; i<=10 ; i++)
			s1.push(i);
		
		System.out.println("Stack is :");
		s1.printStack();
		
		System.out.println("Stack is(while popping) :");
		for(int i=1;i<=10;i++)
			System.out.print(" " +s1.pop());
	}
}
