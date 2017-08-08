class Node{

		private Node previous,next;
		private int data;
		
		public Node(int data){
			this.data=data;
		}
		
	public Node getNext()
	{
		return this.next;
	}
	
	public Node getPrevious()
	{
		return this.previous;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setNext(Node node)
	{
		 this.next=node;
	}
	
	public void setPrevious(Node node)
	{
		 this.previous=node;
	}
	
	public void setData(int data)
	{
		 this.data=data;
	}
	
}

class DoublyLinkedList{
	private Node start;
	private Node end;
	
	public void addNode(Node node)
	{
		if(start==null)
		{
			start=end=node;
		}
		else

		{
			end.setNext(node);
			node.setPrevious(end);
			end=node;
		}
	}
	
	public int deleteNode(int pos)
	{
		Node temp=start;
		int data=temp.getData();
		
		for(int i=0;i<pos;i++)
			temp=temp.getNext();
			
		temp.getPrevious().setNext(temp.getNext());
		temp.getNext().setPrevious(temp.getPrevious());
		return data;
	}
	
	public void printList()
	{
		Node temp=start;
		while(temp.getNext()!=null)
		{
			System.out.print(" "+temp.getData());
			temp=temp.getNext();
		}
		System.out.print(" "+temp.getData());
	}
	
	public int countNodes()
	{
		int count=0;
		Node temp=start;
		while(temp.getNext()!=null)
		{
			count++;
			temp=temp.getNext();
		}
		return count;	
	}
}
	
	

public class DoublyLinkedListTest{

	public static void main(String []args){
		DoublyLinkedList d1=new DoublyLinkedList();
		for(int i=0;i<=10;i++)
			d1.addNode(new Node(i));
		
		d1.printList();
		System.out.println("\n Count : " + d1.countNodes());
		System.out.println(d1.deleteNode(2));
		
		d1.printList();
		System.out.println("\n Count : " + d1.countNodes());
	}
}