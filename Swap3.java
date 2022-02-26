//bit wise operator

class Swap
{
	public static void main(String args[])
	{
		int a=50,b=60;
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(" after swap a value is  a:" +a );
		System.out.println(" after swap a value is  b:" +b );
	}
}