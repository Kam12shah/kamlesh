import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int n,fact=1;
		System.out.println("enter your no.");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
				fact = fact*i;
				
		}
		System.out.println("factorial of given no. is " + fact);
	}
}