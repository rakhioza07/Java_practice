package com.corejava.thread;

public class MyWaterTank implements Runnable{

	private static int waterLevel=0;
	private Thread inlet;
	private Thread outlet;
	private Thread controller;
	private final static int MAX_CAPACITY=1000;
	
	public MyWaterTank() {
		
		inlet=new Thread(this,"inlet");
		outlet=new Thread(this,"outlet");
		controller=new Thread(this,"controller");
		controller.setDaemon(true);
		inlet.start();
		outlet.start();
		controller.start();
	}
	public static void main(String[] args) {
		new MyWaterTank();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		switch(Thread.currentThread().getName())
		{
		case "inlet":
			while(true)
			{
				waterLevel+=50;
				System.out.println("WaterLevel :"+waterLevel);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {	
					e.printStackTrace();
				}
			}
		
		case "outlet":
			while(true)
			{
				waterLevel-=70;
				System.out.println("\tWaterLevel :"+waterLevel);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		
	
		case "controller":
		while(true)
		{
			
		}
		}
	}

}


