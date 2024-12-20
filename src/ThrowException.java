import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowException {

	public static void main(String[] args) 
	{
		try {
			ShowException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception from different fuction");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Exception from different function");
		}
		catch(NegativeArraySizeException e3)
		{
			System.out.println("Exception from different function");
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("Exception from different function");
		}

	}
	static void ShowException()
	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the numerator:");
			int num=sc.nextInt();
			System.out.println("enter the denominator:");
			int deno=sc.nextInt();
			int res=num/deno;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			throw e;
		}
		
		catch(InputMismatchException e1) {
			throw e1;
		}
		catch(NegativeArraySizeException e2) {
		
			throw e2;
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			throw e3;
		}
		

	}

}
