//Write a Java Program to Print 1 To 10 Without Using Loop. we use recursion
import java.util.Scanner;
class Print{
	public static void printnumber(int n)
	{
	if(n<=10)
	{
	System.out.println(n);
	printnumber(n+1);
	}
}
	public static void main(String args[])
	{
	printnumber(1);
}
}