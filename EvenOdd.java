
//Check the given number is EVEN or ODD. 
import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	if(num%2==0)
		System.out.println(num + "is Even");
	else
		System.out.println(num + "is Odd");
	}
}


