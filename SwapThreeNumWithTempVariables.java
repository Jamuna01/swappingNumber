//1) WAP to swap three numbers with temp variable.


public class SwapThreeNumWithTempVariables {

	public static void main(String[] args) 
	{
		int num1, num2, num3, temp;
		
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		System.out.println("Before swapping: \n" + "num1: "+num1 + " num2: "+num2 + " num3: "+num3);
		
		temp = num1; // temp value is 10
		num1 = num2; // num1 value is 20
		num2 = num3; // num2 value is 30
		num3 = temp; // num3 value is 10
		
		System.out.println("\nAfter swapping: \n" + "num1: "+num1 + " num2: "+num2 + " num3: "+num3);
		
		
		
	}

}
