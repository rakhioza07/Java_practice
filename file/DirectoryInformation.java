package com.corejava.file;
import java.io.*;
public class DirectoryInformation {

	public static void main(String[] args) {
		File f=new File("D:\\JAVA TRAINNG\\practice");
		System.out.println("Name\t Size \t Date \t File permissions \t File");
		for(File file:f.listFiles())
		{
			System.out.print("\t"+"\t"+file.getName());
			System.out.print("\t"+file.length());
			System.out.print("\t"+file.lastModified());
			System.out.print("\tWrite :"+file.canWrite());
			System.out.print(" Read :"+file.canRead());
			System.out.print(" Execute :"+file.canExecute());
			System.out.println("\t"+file.isFile());
		}
	}

	

}
