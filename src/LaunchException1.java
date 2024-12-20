import java.util.Scanner;
public class LaunchException1 {
	public static void main(String[] args) {
		try 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int num=sc.nextInt();
		System.out.println("Enter the Denominator:");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("EXception Handled");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}

}
