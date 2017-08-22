package com.corejava.file;

import java.io.*;
import java.util.Scanner;

public class RandomAccessTest {

	static RandomAccessFile randomFile;
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		File file=new File("filename.txt");
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		String fileName=raf.readLine();
		randomFile=new RandomAccessFile(fileName, "rw");

		try{
			while(true)
			{
				System.out.println("1. Create Account");
				System.out.println("2. Retrieve Accounts");
				System.out.println("3. Update Account");
				System.out.println("4. Delete Account");
				System.out.println("5. Exit");
				System.out.println("\tEnter your choice : ");
				int op=scan.nextInt();

				switch(op)
				{
				case 1:
					System.out.println("Enter Account no :");
					int no=scan.nextInt();
					System.out.println("Enter Account balance :");
					double balance=scan.nextDouble();
					System.out.println("Enter Account name :");
					String name=scan.next();
					createAccount(no, balance, name);
					break;

				case 2:
					retriveAccounts();
					break;

				case 3:
					System.out.println("Enter account no : to be updated :");
					int accNo=scan.nextInt();
					updateRecord(accNo);
					break;
					
				case 4:
					System.out.println("Enter account no : to be deleted :");
					accNo=scan.nextInt();
					deleteRecord(accNo);
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			randomFile.close();
		}


	}
	private static void deleteRecord(int accNo) throws IOException {
		try
		{
			randomFile.seek(0);
			while(true)
			{
				int temp=randomFile.readInt();
				double balance=randomFile.readDouble();
				String name="";
				String tempStr=randomFile.readUTF();
				do{
					name+=tempStr;
					tempStr=randomFile.readUTF();
				}while(tempStr!="\n");
				if(temp==accNo)
				{
					randomFile.readDouble();
					randomFile.readLine();
				}
				else
				{
					
				}
			}
		}
		catch(EOFException e)
		{
			System.out.println("Record not found");
		}
	
	}
	private static void updateRecord(int accNo) throws IOException {
		try
		{
			randomFile.seek(0);
			while(true)
			{
				int temp=randomFile.readInt();
				if(temp==accNo)
				{
					System.out.println("Record found for no "+accNo);
					System.out.println("Enter new balance :");
					double balance=scan.nextDouble();
					System.out.println("Enter new name");
					String name=scan.next();
					randomFile.writeDouble(balance);
					randomFile.writeUTF(name);
					System.out.println("Record updated");
					break;
				}
				else
				{
					randomFile.readDouble();
					randomFile.readLine();
				}
			}
		}
		catch(EOFException e)
		{
			System.out.println("Record not found");
		}

	}
	private static void retriveAccounts() throws IOException {
		try
		{
			randomFile.seek(0);
			System.out.println("No\tBalance\t\tName");
			while(true)
			{
				System.out.print(""+randomFile.readInt());
				System.out.print("\t"+randomFile.readDouble());
				System.out.print("\t"+randomFile.readUTF());
				randomFile.readLine();
				System.out.println();
				
			}
		}
		catch(EOFException e)
		{
			System.out.println("File ended");
		}

	}
	private static void createAccount(int no,double balance, String name) throws IOException {
		randomFile.writeInt(no);
		randomFile.writeDouble(balance);
		randomFile.writeUTF(name);
		randomFile.writeUTF(" ");
		randomFile.writeUTF(" ");
		randomFile.writeUTF(" ");
		randomFile.writeUTF(" ");
		randomFile.writeUTF(" ");
		randomFile.writeUTF("\n");

	}

}
