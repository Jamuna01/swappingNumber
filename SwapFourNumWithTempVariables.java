//3) WAP to swap four numbers with temp variable.
public class SwapFourNumWithTempVariables 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
	
		int temp;
		
		System.out.println("Before swapping: \n" +"a:" + a + " b:"+ b + " c:" + c + " d:"+ d);
		
		temp = a;
		a = b;
		b = c;
		c = d;
		d = temp;
		
		System.out.println("\nAfter swapping: \n" +"a:" + a + " b:"+ b + " c:" + c + " d:"+ d);
	}
}
