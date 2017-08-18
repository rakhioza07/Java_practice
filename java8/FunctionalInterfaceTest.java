package com.corejava.java8;
import java.util.function.*;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		Supplier<?> s1=()->"Namaskar";
		Consumer<String> c1=arg-> System.out.println("Argument :"+arg);
		Predicate<String> p1=str->str.isEmpty();
		Function<String, String> f1=arg -> "Hello"+arg;
		
		System.out.println("Supplier :"+s1.get());
		System.out.print("Consumer :");
		c1.accept("World");
		System.out.println("Predicate :"+p1.test(""));
		System.out.println("Function :"+f1.apply(" World"));
		System.out.println();
	}

}
