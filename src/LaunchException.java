import java.util.Scanner;
public class LaunchException {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator:");
		int num=sc.nextInt();
		System.out.println("Enter the Denominator:");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);
		
		
	}

}
