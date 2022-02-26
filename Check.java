import java.util.Scanner;
class Check
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter your number");
	
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			if (n>0)
			{
				System.out.println("Positve number");
			}
			else if(n<0)
			{
					System.out.println("Negative number");
			}
			else
			{
				System.out.println("neither positive nor Negative number");
			}
	
	}
}