package com.corejava.file;
import java.io.*;

public class FileHandlingTest {

	public static void main(String[] args) throws Exception{
		File file=new File("test.txt");
		FileOutputStream output = new FileOutputStream(file);
		
		output.write("Hello".getBytes());
		output.close();
		
		FileInputStream input = new FileInputStream(file);
		int i;
		i=input.read();
		while(i!=-1){
			System.out.print((char)i);
			i=input.read();
		}
		input.close();
	}

}
