import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowException {
	public static void main(String[] args) {
		try 
		{
	    ShowException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception from different function");
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
		 }
	   catch(ArithmeticException e)
	{
		   	throw e;
	}
}
}
