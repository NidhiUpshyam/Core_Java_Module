//18.Program to check whether number is prime or not.

import java.util.*;
public class Q18{
	public static void main(String args[]){
	boolean isPrime = true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();

	for(int i = 2 ; i < num/2 ; i++)
	{
		if(num % i == 0)
		{
			isPrime = false;
			break;
		}
	}
	
	if (isPrime)
	{
	System.out.println(num + " is a Prime number");
	}
	else
	{
	System.out.println(num + " is not a Prime number");
		}
	}
}
	

	