
//20.Print all prime numbers between two given numbers. [ break continue ]



import java.util.*;
public class Q20{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	boolean isPrime = true;
	while(num1 <= num2){
		isPrime = true;
		

	for(int i = 2; i <= num1/2; i++)
		{
			
			if(num1%i == 0)
			{
				isPrime = false;
				break;
			}
		}
			
	if(isPrime)
	{
		System.out.println(num1+ " ");




	}
		num1++;
		
			}
			
	}
}