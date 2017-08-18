package com.corejava.enumtest;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Hospital {
	ArrayList<BPListener> listeners=new ArrayList<>(); 
	class Patient
	{
		private int id;
		private ArrayList<Integer> bloodPressure;
		Patient(int id)
		{
			this.setId(id);
			this.bloodPressure=new ArrayList<>();
		}
		public void setBloodPressure(int bp) throws Exception {
			if(bp>140)
			{
				for(BPListener bpl:listeners)
					bpl.notifyMe();
				System.exit(0);
			}	
			else
				{
					this.bloodPressure.add(bp);
					System.out.println("Blood Pressure values :"+bp);
				}
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
	}
	public void addBPListener(BPListener listener)
	{
		listeners.add(listener);
	}
	
}
class Nurse implements BPListener
{
		@Override
		public void notifyMe() {
			System.out.println(this.getClass().getName() +" got notified for BP issue");
		}
}	

class Doctors implements BPListener
{
		@Override
		public void notifyMe() {
			System.out.println(this.getClass().getName() +" got notified for BP issue");
		}
}	

class PRTeam implements BPListener
{
		@Override
		public void notifyMe() {
			System.out.println(this.getClass().getName() +" got notified for BP issue");
		}
}
	

