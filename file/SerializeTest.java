package com.corejava.file;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Account []a=new Account[3];
//		a[0]=new Account(101, 20000, "ABC");
//		a[1]=new Account(208, 40000, "BCD");
//		a[2]=new Account(398, 50000, "CDE");
//
//		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("serializeAccounts.dat"));
//		for(Account acc:a)
//			objOut.writeObject(acc);
//		objOut.flush();
//		objOut.close();

		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("serializeAccounts.dat"));
		try
		{
			while(true)
			{
				System.out.println(objIn.readObject());
			}
		}
		catch(EOFException e)
		{
			System.out.println("File ended");
		}
		finally{
			objIn.close();
		}
		
		
	}

}
