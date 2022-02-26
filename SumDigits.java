//Write a Java Program to find sum of the digits of a given number. 
import java.util.Scanner;  
 class Digits 
{  
public static void main(String args[])  
{  

	int number,r,sum=0; 
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();
	while(number>0)
	{
		r=number%10;
		sum=sum+number;
		number= number/10;
	}
	System.out.println("sum of digits " +sum );

}  
}  