//Write a Java Program to find GCD of two given numbers. 

import java.util.Scanner;

 class GCD {
	
	public static void main(String[] args) 
	{
		int Num1, Num2, i, GCD = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("  Value first : ");
		Num1 = sc.nextInt();	
		
		System.out.print(" Value second : ");
		Num2 = sc.nextInt();
		
		for(i = 1; i <= Num1 && i <= Num2; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("\n GCD of " + Num1 + " and " + Num2 + "  =  " + GCD);
	}
}