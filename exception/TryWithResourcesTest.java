package com.corejava.exception;

import java.io.*;
public class TryWithResourcesTest {

	public static void main(String[] args) throws IOException {

		try(FileInputStream f=new FileInputStream("D:\\JAVA TRAINNG\\practice\\Workspace\\CoreJava\\src\\com\\corejava\\exception\\Account.java"))
		{
			byte[] bytes=new byte[f.available()];
			f.read(bytes);
			for(byte b:bytes)
				System.out.print((char)b);
		}

	}

}
