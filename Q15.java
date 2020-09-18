//15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.


 import java.util.*;
public class Q15{   
public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender and age: ");
		char sex = sc.next().charAt(0); //no nextChar
		int age = sc.nextInt();
		if((sex=='F' && age>=18) || (sex=='M' && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}
	}
}