class NewException extends Exception
{
	public NewException(String s)
	{
		super(s);
	}
	
}
public class CustomException1 {

	public static void main(String[] args) 
	{
		try {
		throw new NewException("");
		}
		catch(NewException ex)
		{
			System.out.println("Exception is caugh");
			System.out.println(ex.getMessage());
		}
		

	}

}
