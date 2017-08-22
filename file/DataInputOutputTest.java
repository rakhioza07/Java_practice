package com.corejava.file;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputTest {
	public static void main(String[] args) throws IOException {
		Account []a=new Account[3];
//		a[0]=new Account(101, 20000, "ABC");
//		a[1]=new Account(208, 40000, "BCD");
//		a[2]=new Account(398, 50000, "CDE");
//		
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("account.txt"));
//		for (Account account:a) {
//			dos.writeInt(account.getNo());
//			dos.writeDouble(account.getBalance());
//			dos.writeUTF(account.getName());
//		}
//		
//		dos.flush();
//		dos.close();
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream("account.txt"));
		try {
			while(true){
			System.out.println("No :"+dis.readInt());
			System.out.println("Balance :"+dis.readDouble());
			System.out.println("Name :"+dis.readUTF());
		}
	}
	catch(EOFException e)
	{
		System.out.println("File ended");
	}
	finally
	{
		dis.close();
	}

		
		
	}

}
