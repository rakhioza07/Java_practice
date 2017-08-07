class ComplexNumber
{
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public ComplexNumber add(ComplexNumber complex)
	{
		complex.real+=this.real;
		complex.imaginary+=this.imaginary;
		return complex;
	}	
	
	public ComplexNumber subtract(ComplexNumber complex)
	{
		complex.real-=this.real;
		complex.imaginary-=this.imaginary;
		return complex;	
	}	
	
	public int multiply(ComplexNumber complex)
	{
		return (this.real*complex.real)+((this.imaginary*complex.imaginary)*-1);
	}
	
	public static void swap(ComplexNumber []dt)
	{
		ComplexNumber temp=dt[0];
		dt[0]=dt[1];
		dt[1]=temp;
	}
	public String toString()
	{
		return this.real + "+" + this.imaginary + "i";
	}
}

public class ComplexNumberTest{
	
	public static void main(String []args){	
		ComplexNumber []c=new ComplexNumber[2];
		c[0]=new ComplexNumber(9,5);
		c[1]=new ComplexNumber(7,3);
		
		System.out.println("First number :" + c[0]);
		System.out.println("Second number :" + c[1]);

		System.out.println("Addition : " + c[0].add(c[1]));
		System.out.println("Subtraction : " + c[0].subtract(c[1]));
		System.out.println("Multiplication : " + c[0].multiply(c[1]));

		System.out.println("Before swapping :");
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		ComplexNumber.swap(c);
		
		System.out.println("After swapping :");
		System.out.println(c[0]);
		System.out.println(c[1]);
		

		
	}
}