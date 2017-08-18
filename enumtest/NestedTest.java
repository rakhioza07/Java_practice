package com.corejava.enumtest;

public class NestedTest {

	public static void main(String[] args) {
		Data d=new Data();
		d.setRecord(1, "rakhi");
		d.setRecord(2, "ankit");
		d.setRecord(3, "mayur");
		d.setRecord(4, "shona");

		System.out.println(d.getRecord(4));
		System.out.println(d.getRecord(3));
		System.out.println(d.getRecord(2));
		System.out.println(d.getRecord(1));
	}

}

