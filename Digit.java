//write a java program to print the digits of a given number.
import java.util.Scanner;
import java.util.*;
class Digit
{
public static void main(String args[])
{
	int count=0;
	System.out.println("Enter the number");
Scanner sc= new Scanner(System.in);
 int num= sc.nextInt();
	while(num>0)
	{
		num=num/10;
		count++;
	}
	System.out.println("no. of digit is " +count);
}
}