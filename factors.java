//Write a Java Program to print all the Factors of the Given number. 
import java.util.Scanner;
 class Main {

  public static void main(String[] args)
  {

	int number; 
	Scanner sc = new Scanner(System.in);
	number=sc.nextInt();

    System.out.print("Factors of " + number + " are: ");

  
    for (int i = 1; i <= number; ++i)
		{

     
		  if (number % i == 0)
		  {
			System.out.print(i + " ");
		  }
		}
  }
}