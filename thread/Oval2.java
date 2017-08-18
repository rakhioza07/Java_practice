package com.corejava.thread;



import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Oval2 extends Frame implements Runnable {
	ReentrantLock lock=new ReentrantLock(true);
	Condition cond=lock.newCondition();
	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1, t2, t3;
	static boolean flag=false;
	
	public Oval2() {

		super("Oval Game");

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		t1=new Thread(this);
		t1.setName("RED");
		t2=new Thread(new Thread(this));
		t2.setName("YELLOW");
		t3=new Thread(new Thread(this));
		t3.setName("BLUE");

		t1.start();
		t2.start();
		t3.start();
	}

	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.YELLOW);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);

	}

	public static void main(String args[]) {
		Frame om = new Oval2();
		om.setSize(600, 600);
		om.setBackground(Color.BLACK);
		om.setVisible(true);
	}

	public void waitFunc(){

		try {
			if(lock.tryLock())
			cond.await();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		finally{
			lock.unlock();
		}
	}

	public void notifyFunc(){
		lock.lock();
		try
		{
			cond.signalAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			lock.unlock();
		}
	}

	@Override
	public  void run() {

		Thread currThread=Thread.currentThread();

		if(currThread.getName().equals("RED")){
			boolean upper=true;
			while(true){

				if(upper){
					for( y1=400;y1>50;y1--)
					{
						this.repaint();
						try{Thread.sleep(10);} catch(Exception e){}
					}
					upper=false;
					
					this.waitFunc();

				}
				else {
					for( y1=50;y1<400;y1++)
					{
						this.repaint();
						try{Thread.sleep(10);} catch(Exception e){}
					}
					upper=true;
					this.waitFunc();
				}

			}
		}

		if(currThread.getName().equals("YELLOW")){
			boolean upper=true;
			while(true){
				if(upper){
					for( y2=400;y2>50;y2--)
					{
						this.repaint();
						try{Thread.sleep(20);} catch(Exception e){}
					}
					upper=false;
					this.waitFunc();

				}
				else {
					for( y2=50;y2<400;y2++)
					{
						this.repaint();
						try{Thread.sleep(20);} catch(Exception e){}
					}
					upper=true;
					this.waitFunc();
				}

			}
		}
		if(currThread.getName().equals("BLUE")){
			boolean upper=true;
			while(true){
				if(upper){
					for( y3=400;y3>50;y3--)
					{
						this.repaint();
						try{Thread.sleep(30);} catch(Exception e){}
					}
					upper=false;
					this.flag=true;
					this.notifyFunc();
				}
				else{
					for( y3=50;y3<400;y3++)
					{
						this.repaint();
						try{Thread.sleep(30);} catch(Exception e){}
					}
					upper=true;
					this.notifyFunc();
				}

			}
		}


	}
}

