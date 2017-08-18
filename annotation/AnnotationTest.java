package com.corejava.annotation;

public class AnnotationTest extends Test{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().testMethod();
	}
	
	@Override
	@Deprecated
	public void testMethod()
	{
		System.out.println("Test method");
	}
}

class Test
{
	
	public void testMethod()
	{
		System.out.println("Test method");
	}
}