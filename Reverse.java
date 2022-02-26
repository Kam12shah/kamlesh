


import java.util.Scanner;
 class Main {

  public static void main(String[] args)
  {

	int n,r; 
	System.out.println("enter the number" );

	Scanner sc = new Scanner(System.in);
	int number=sc.nextInt();
	while(number>0)
	{
	r=number%10;
	System.out.print(r);
	number=number/10;

	}
	
	}
	}
	