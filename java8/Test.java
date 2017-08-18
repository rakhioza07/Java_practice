package com.corejava.java8;

public class Test extends TestClass implements Try1,Try2{
	
	public static void main(String[] args) {
		
	}
	
	public void test2() {
		Try1.super.test();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		Try1.super.test();
	}
}

@FunctionalInterface
interface Try1{
	void tryThis();
	default void test()
	{
		System.out.println("Test method from Try1 interface");
	}
}

@FunctionalInterface
interface Try2{
	void tryThis();
	
	default void test()
	{
		System.out.println("Test method from Try2 interface");
	}
}

class TestClass
{
	public void tryThis()
	{
		System.out.println("tryThis method from TestClass");
	}
//	public void test()
//	{
//		System.out.println("Test method from TestClass");
//	}
}