import java.util.*;

abstract class DesertItem{

	public abstract double getCost();
	
}

class Candy extends DesertItem{

	public double getCost()
	{
		return 100; 
	}

}

class Cookie extends DesertItem{
	
	public double getCost()
	{
		return 200; 
	}

}

class IceCream extends DesertItem{
	
	public double getCost()
	{
		return 300; 
	}
	
}
public class DesertShop{
	
	private static List<Candy> candies=new ArrayList<Candy>();
	private static List<Cookie> cookies=new ArrayList<Cookie>();
	private static List<IceCream> iceCreams=new ArrayList<IceCream>();
		
	public static DesertItem getItemObject(int type)
	{
			switch(type)
			{
				case 1:
					return new Candy();
				case 2:
					return new Cookie();
				case 3:
					return new IceCream();
			}
			return null;
	}
	
	public static void addItem(int type,int quantity)
	{
		if(type==1)
			for(int i=0;i<quantity;i++)
				candies.add((Candy)getItemObject(type));
		else if(type==2)
			for(int i=0;i<quantity;i++)
				cookies.add((Cookie)getItemObject(type));
		else if(type==3)
			for(int i=0;i<quantity;i++)
				iceCreams.add((IceCream)getItemObject(type));
	}
	
	public static void showInventory()
	{
		System.out.println("\tCandies : "+candies.size());
		System.out.println("\tCookies : "+cookies.size());
		System.out.println("\tIceCreams : "+iceCreams.size());
	}
	
	public static double placeOrder(int type,int quantity)
	{
		double cost=getItemObject(type).getCost()*quantity;
		
		if(type==1)
		{
			if(candies.size()<quantity)
			{
				System.out.println("Oops! We're out of candies.");
				return -1;
			}
			for(int i=0;i<quantity;i++)
				candies.remove(i);		
			return cost/60;
		}
		else if(type==2)
		{
			
			if(cookies.size()<quantity)
			{
				System.out.println("Oops! We're out of cookies.");
				return -1;
			}
			for(int i=0;i<quantity;i++)
				cookies.remove(i);
			return cost/70;
		}
		else if(type==3)
		{
			if(iceCreams.size()<quantity)
			{
				System.out.println("Oops! We're out of IceCreams.");
				return -1;
			}
			for(int i=0;i<quantity;i++)
				iceCreams.remove(i);
			return cost;
		}
		else return 0;
	}
	
	public static void main(String []args){
		
		Scanner scan=new Scanner(System.in);

		outer : while(true)
		{
			System.out.println("Please enter your choice :");
			System.out.println("1.Shopkeeper");
			System.out.println("2.Customer");
			System.out.println("3.Exit");
			
			int op=scan.nextInt();
			switch(op)
			{
				case 1:
						System.out.println("Please choose item :");
						System.out.println("1. Candy");
						System.out.println("2. Cookie");
						System.out.println("3. IceCream");
						
						int type=scan.nextInt();
						System.out.println("Please enter quantity :");
						int quantity=scan.nextInt();
						
						addItem(type,quantity);
						showInventory();
					break;
				
				case 2:
					System.out.println("What do you wanna have?");
					System.out.println("1. Candy");
					System.out.println("2. Cookie");
					System.out.println("3. IceCream");
					type=scan.nextInt();
					System.out.println("Please enter quantity :");
					quantity=scan.nextInt();
					double bill=placeOrder(type,quantity);
					if(bill!=-1)
					System.out.println("Bill :" + bill);
					showInventory();
					break;
				case 3:
				default : break outer;
			}
		}
	}
}