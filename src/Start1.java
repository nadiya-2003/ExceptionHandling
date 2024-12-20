//custom Exception
class UserException extends Exception
{
	public UserException(String s)
	{
		super(s);
	}
}
class ProgException extends Exception
{
	public ProgException(String s)
	{
		super(s);
	}
}
public class Start1
{
	public static void main(String[] args)
	{
		try
		{
			throw new UserException("The Exception handled");
		}
		catch(UserException ue)
		{
			System.out.println("Exception Caught");
			System.out.println(ue.getMessage());
		}
		try
		{
			throw new ProgException("enter only non zero elements");
		}
		catch(ProgException pe)
		{
			System.out.println("Exception caught");
			System.out.println(pe.getMessage());
		}
	}

}
