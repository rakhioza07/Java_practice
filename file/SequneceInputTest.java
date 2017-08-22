package com.corejava.file;
import java.io.*;
import java.util.Enumeration;
import java.util.Vector;


public class SequneceInputTest{

	public static void main(String[] args)  throws Exception{
		FileInputStream f1 = new FileInputStream("f1.txt");
		FileInputStream f2 = new FileInputStream("f2.txt");
		FileInputStream f3 = new FileInputStream("f3.txt");
		
		Vector<FileInputStream> v=new Vector<FileInputStream>();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		
		SequenceInputStream siso=new SequenceInputStream(v.elements());
		int i=siso.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=siso.read();
		}
	}

}
