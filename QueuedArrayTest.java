class QueuedArray {
	
	private int arr[];
	private static int rear=-1,front=0;
	
	public QueuedArray()
	{
		arr=new int[50];
	}
	
	public void enqueue(int item)
	{
		if(rear==50)
		{
			System.out.println("Queue is full.");
		}
		arr[++rear]=item;
		
		if(front==-1)
			front=rear;
	}
	
	public int dequeue()
	{
		if(rear<0)
		{
			return -1;
		}
		return arr[front++];
	}
	
	public void printQueue()
	{
		System.out.println();
		for(int i=rear,j=0;i>=0;i--,j++)
		{
			System.out.print(" "+arr[j]);
		}
		System.out.println();
	}	
}

class QueuedArrayTest
{
	public static void main(String []args){	
		
		QueuedArray q1=new QueuedArray();
		int item=q1.dequeue();
		if(item==-1)
			System.out.println("Queue is empty");
		
		for(int i=1 ; i<=10 ; i++)
			q1.enqueue(i);
		System.out.println("Queue is :");
		q1.printQueue();
		
		System.out.println("Queue is (while dequeuing) :");
		for(int i=0;i<10;i++)
			System.out.print(" " +q1.dequeue());
	}
}
