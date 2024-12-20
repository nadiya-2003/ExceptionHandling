import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException1 {

	public static void main(String[] args) {
		try 
		{
	    ShowException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception from different function");
	    }
		catch(InputMismatchException e1)
		{
		System.out.println("Input is not valid");	
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Specified index is out of range");	

		}

	}

	private static void ShowException() {
		try
		{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator:");   					//inputMismatchException
		int num=sc.nextInt();                         					//critical Statement
		System.out.println("Enter the Denominator:");  					//inputMismatchException
		int deno=sc.nextInt();                        					//critical Statement
		int res=num/deno;                            			 		//critical Statement,ArithmeticException 
		System.out.println(res);
		System.out.println("Array operation");
		System.out.println("Enter the Array Size:"); 			 		//inputMismatchException
		int n=sc.nextInt();                           					//critical Statement
		int arr[]=new int[n];                         					//critical Statement
		System.out.println("Enter the position Number:");
		int pos=sc.nextInt();                                      		//critical Statement,ArrayIndexOutOfBoundsException 
		System.out.println("Enter the value that to be added:");
		int val=sc.nextInt();                         					//critical Statement
		arr[pos]=val;                                 					//critical Statement
		System.out.println("Data Added");
	     
		 }
	   catch(ArithmeticException e)
	{
		   	throw e;
	}
		catch(InputMismatchException e1)
		{
			throw e1;
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			throw e2;
		}
}
		
	}

