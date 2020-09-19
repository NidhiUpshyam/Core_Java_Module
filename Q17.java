//17.Write a program to reverse a given number.



import java.util.*;
public class Q17{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();

		int rev = 0;
	while(n>0)
	{
		int num = n%10;
		rev = rev * 10 + num;
		n = n/10;
	}
	System.out.println("Reverse number "+rev);
	}
}