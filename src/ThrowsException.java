
public class ThrowsException {
	public static void main(String[] args)
	{
		checkage(14);
	}

	static void checkage(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("you must be 18 or above to vote");
		}
		else
		{
			System.out.println("you are eligible to vote");
		}
		
	}

}
//it gives message in the red line,because no try,catch is involved to handle,it just throws the Exception