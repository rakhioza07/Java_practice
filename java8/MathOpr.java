package com.corejava.java8;

@FunctionalInterface
public interface MathOpr<T> {
	T operation(T t1,T t2);
}
