package com.corejava.collection;

import java.util.*;

public class Parked_CarOwnerList {
	
	static HashMap<Integer,HashMap<Integer,HashMap<Integer,Parked_CarOwner_Details>>> location=new HashMap<>();
	Scanner scan=new Scanner(System.in);

	public Parked_CarOwnerList() {
		
	
		
		for (int i = 0; i < 3; i++) {
			HashMap<Integer,HashMap<Integer,Parked_CarOwner_Details>>section=new HashMap<>();
			for (int j = 0; j < 4; j++) {
				HashMap<Integer,Parked_CarOwner_Details> position=new HashMap<>();
				for (int k = 0; k < 20; k++) {
					
						position.put(k, new Parked_CarOwner_Details());
				}
				section.put(j,position);
			}
			location.put(i, section);
		}
	}
	
	String add_new_car(Parked_CarOwner_Details park){
		String token="";
		
		Parked_CarOwner_Details obj=park;
		try
		{
			int i,j,k;
			for ( i = 0; i < 3; i++) {
				for (j = 0; j < 4; j++) {
					for (k = 0; k < 20; k++) {
							if(location.get(i).get(j).get(k).getCarNO()==0)
							{
								location.get(i).get(j).replace(k, obj);
								token="F "+i+" S "+j+" P "+k;
								return token;
							}
					}
				}
			}
			System.out.println("Jagah nahi mili! Raste pe gadi laga!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return token;
	}
	
	void remove_car(String token)
	{
		int floor=Integer.parseInt(token.substring(2,3));
		int section=Integer.parseInt(token.substring(6,7));
		int position=Integer.parseInt(token.substring(10));
		System.out.println("Floor :"+floor+" Section :"+section+" Position :"+position);
		try{
		location.get(floor).get(section).replace(position,null);
		System.out.println("Car removed");
		}
		catch(NullPointerException e)
		{
			System.out.println("Invalid token");
		}
	};
	
	void get_parked_car_location(String token){
		int floor=Integer.parseInt(token.substring(2,3));
		int section=Integer.parseInt(token.substring(6,7));
		int position=Integer.parseInt(token.substring(10));
		try{
		if(location.get(floor).get(section).get(position).getCarNO()!=0)
			System.out.println("Car found at : "+"Floor "+floor+" Section "+section+" Position "+position);
		else
			System.out.println("Car not found"+token);
		}
		catch(Exception e)
		{
			System.out.println("Car not found"+token);
		}
	};
}
