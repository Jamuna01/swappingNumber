//4) WAP to swap four numbers without temp variable.

public class SwapFourNumWithoutTempVariables 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("Before swapping: \n" + "a:"+a + " b:"+b + " c:"+c + " d:"+d);
		
		a = (d + c) - c ; // a value becomes 40
		b = d - c;		  // b value becomes 10
		c = (d - c) + b;  // c value becomes 20
		d = a - b ;		 // d value becomes 30
		
		System.out.println("\nAfter swapping: \n" + "a:"+a + " b:"+b + " c:"+c + " d:"+d);
	}
}
