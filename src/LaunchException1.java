import java.util.InputMismatchException;
	import java.util.Scanner;
public class LaunchException1 {
		public static void main(String[] args) {
			try
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Division Operator");
				System.out.println("Enter numarator:");
				int num =sc.nextInt();
				System.out.println("Enter denominator:");
				int deno=sc.nextInt();
				int res=num/deno;
				System.out.println("res");
				System.out.println("Array Operation");
				System.out.println("Enter array size");
				int n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("Enter the position number:");
				int pos=sc.nextInt();
				System.out.println("Enter the value to be added:");
				int val=sc.nextInt();
				arr[pos]=val;
				System.out.println("Data Added");
			}
			// specific catch
			catch(InputMismatchException e1)
			{
				System.out.println("Inpput is not valid");
			}
			catch(ArithmeticException e2)
			{
				System.out.println("Arithmetic Exception");
			}
			catch(NegativeArraySizeException e3)
			{
				System.out.println("Array cannot be negative");
			}
			catch(ArrayIndexOutOfBoundsException e4)
			{
				System.out.println("Specific index is out of range");
			}
			//Generic catch
			catch(Exception e)
			{
				System.out.println("Exception handled in Generic method");
			
			}

		}

	}


