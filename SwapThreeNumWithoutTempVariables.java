//2) WAP to swap three numbers without temp variable.

public class SwapThreeNumWithoutTempVariables 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("Before swapping: \n" +"a:" + a + " b:"+ b + " c:" + c);
		
		
		a = (b+c)-b; // new value for a is 30
		b = c - b; // new value for b is 10
		c = a - b ; //new value for c is 20
		
		System.out.println("\nAfter swapping: \n" +"a:" + a + " b:"+ b + " c:" + c);
		
	}
}
