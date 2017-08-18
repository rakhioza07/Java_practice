package com.corejava.thread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame implements Runnable {
	static int waterlevel;
	Thread inlet;
	Thread outlet;
	Thread controller;
	public WaterTank() {
		super("Ball game");
		inlet=new Thread(this,"inlet");
		outlet=new Thread(this,"outlet");
		controller=new Thread(this,"controller");
		controller.setDaemon(true);
		inlet.start();
		outlet.start();
		controller.start();		
		setBackground(Color.BLACK);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.CYAN);
		g.fillRect(150, 400, 200, -waterlevel/3);
		g.drawString("70%", 380, 200);
	
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

	
	@Override
	public void run() {
		switch(Thread.currentThread().getName())
		{
		case "inlet":
			while(true)
			{
				waterlevel+=50;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {	
					e.printStackTrace();
				}
				System.out.println("waterlevel :"+waterlevel);
				this.repaint();
			}
		
		case "outlet":
			while(true)
			{
				waterlevel-=70;
				
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("\twaterlevel :"+waterlevel);
				this.repaint();
			}
		
	
		case "controller":
		for(;;)
		{
			
			if(waterlevel<800)
			{
				outlet.suspend();
				inlet.resume();
			}
			if(waterlevel>800)
			{
				outlet.resume();
				inlet.suspend();
			}
			
			
		}
		}
	}
}
