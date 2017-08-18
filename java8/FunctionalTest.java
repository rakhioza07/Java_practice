package com.corejava.java8;

public class FunctionalTest {
	public static void main(String[] args) {
		MathOpr<Integer> add=(a,b)->a+b;
		MathOpr<Double> subtract=(a,b)->{return a-b;};
		MathOpr<Integer> multiply=(a,b)->a*b;
		MathOpr<Float> divide=(a,b)->a/b;
		
		System.out.println("Add :" + add.operation(10, 20));
		System.out.println("Subtract :" + subtract.operation(20.0, 10.0));
		System.out.println("Multiply :" + multiply.operation(10, 20));
		System.out.println("Divide :" + divide.operation(10f, 20f));
	}
}
