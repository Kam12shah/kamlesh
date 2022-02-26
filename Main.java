import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int n, fact =1;
		System.out.println("Enter your Number");
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		if (n<0)
		{
			System.out.println("Invalid number");
		}
		else
		{
			int result = factorial(n);
			System.out.println("factorial no.is " +result);
			
		}
		
		
	}
	public static int factorial(int n)
	{
			if (n<=1)
			{
				return 1;
			}
			else
			{
				return n*factorial(n-1);
			}
	}		
		
}
	
