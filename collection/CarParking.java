package com.corejava.collection;

import java.util.*;

public class CarParking {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Parked_CarOwnerList parking=new Parked_CarOwnerList();
		
		System.out.println(" Enter carModel :");
		String carModel=scan.next();
		System.out.println("Enter ownerAddress :");
		String ownerAddress=scan.next();
		System.out.println("Enter ownerName");
		String ownerName=scan.next();
		System.out.println("Enter carNO :");
		int carNO=scan.nextInt();
		System.out.println("Enter  ownerMobileNo:");
		int ownerMobileNo=scan.nextInt();
		
		Parked_CarOwner_Details obj=new Parked_CarOwner_Details(carModel, ownerAddress, ownerName, carNO, ownerMobileNo);
		
		for(int i=0;i<1000;i++)
		{
			String token=parking.add_new_car(obj);
			if(token=="")
				break;
			parking.get_parked_car_location(token);
		}
		parking.remove_car("F 1 S 0 P 1"); 
		parking.get_parked_car_location("F 1 S 0 P 1");
		parking.get_parked_car_location("F 2 S 0 P 1");
	}

}
