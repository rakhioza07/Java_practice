package com.corejava.thread;

import java.awt.*;
import java.awt.event.*;

public class OvalMovementTemplate extends Frame implements Runnable {
	Graphics g;
	int y1 = 400, y2 = 400, y3 = 400;
	Thread ball1;
	Thread ball2;
	Thread ball3;
	public OvalMovementTemplate() {
		super("Oval Game");
		ball1=new Thread(this,"ball1");
		ball2=new Thread(this,"ball2");
		ball3=new Thread(this,"ball3");
		ball1.start();
		ball2.start();
		ball3.start();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		 Graphics2D g2d = (Graphics2D) g.create();
		Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);
        g2d.drawLine(100,100,500,100);
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
		
		}
	
	public static void main(String args[]) {
		Frame om = new OvalMovementTemplate();
		om.setSize(600, 600);
		om.setBackground(Color.BLACK);
		om.setVisible(true);
	}



	@Override
	public void run() {
		switch(Thread.currentThread().getName())
		{
				case "ball1":	for(int i=y1;i>50;i--)
				{
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					y1=i;
					this.repaint();
				}
				break;
				case "ball2":
					for(int i=y2;i>50;i--)
				{
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					y2=i;
					this.repaint();
				}
				break;
				case "ball3":	
					for(int i=y3;i>50;i--)
				{
					try {
						Thread.sleep(60);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					y3=i;
					this.repaint();
				}
				break;
		}
		
		
	}
}
