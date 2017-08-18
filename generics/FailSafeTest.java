package com.corejava.generics;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeTest implements Runnable{
	
	static ConcurrentHashMap< Integer, String> concurrentMap=new ConcurrentHashMap<Integer,String>();
	Thread t1;
	Thread t2;
	public FailSafeTest() {
		t1=new Thread(this,"setData");
		t2=new Thread(this,"getData");
		t1.start();
		t2.start();
	}
	public static void main(String[] args) {
		new FailSafeTest();
	}
	@Override
	public void run() {
		while(true){
			switch (Thread.currentThread().getName()) {
			case "setData":
				int i=1;
				while(true)
				{
					concurrentMap.put(i++, new Date().toString());
					System.out.println("Data added");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			case "getData":
				Iterator<Integer> itr=concurrentMap.keySet().iterator();
				while(itr.hasNext())
				{
					int key=itr.next();
					System.out.println("\t"+key+" : "+concurrentMap.get(key));
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}
	}

}
