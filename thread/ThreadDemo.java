package com.corejava.thread;

public class ThreadDemo implements Runnable {
	Thread t1;
	Thread t2;
	Thread t3;
	public ThreadDemo() {
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
	String name=Thread.currentThread().getName();
	switch(name)
	{
		case "PING":
			for (int i = 0; i < 10; i++) {
				System.out.println("PING");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			break;
		case "PONG":
			for (int i = 0; i < 10; i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			break;
		case "TONG":
			while(true) {
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		
	}

	}

	public static void main(String[] args) {
		new ThreadDemo();

	}

}
