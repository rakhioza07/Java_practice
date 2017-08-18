package com.corejava.exception;
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
			int n1=scan.nextInt();
			int n2=Integer.parseInt(scan.next());
			try
			{
				System.out.println("Quotient :"+ divide(n1,n2));
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception : "+e);
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception : "+e);
		}
		catch(java.util.InputMismatchException e )
		{
			System.out.println("Exception : "+e);			
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
		finally
		{
			System.out.println("\n\nExiting main!");
		}

	}

	 static double divide(int a,int b)
	{
		return (a/b);
	}
}


