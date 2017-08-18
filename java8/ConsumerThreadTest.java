package com.corejava.java8;
import java.util.function.*;
import java.util.*;

public class ConsumerThreadTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();

		list.add("Amar");
		list.add("Bipin");
		list.add("Charlie");
		list.add("Demon");
		
		new PrintThread(list);

	}

}

class PrintThread<T> implements Runnable
{
	List<T> list;
	public PrintThread(List<T> list) {
		this.list=list;
		Thread t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() {
		Consumer<T> consumer=(obj)->System.out.println(obj);
		list.forEach(consumer);
	}
}