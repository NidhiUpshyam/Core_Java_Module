//17.Write a program to reverse a given number.



import java.util.*;
public class Q17sec{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	String str = sc.nextInt();
	String newstr = "";

	for(int i = str.length() - 1 ; i >= 0 ; i--)
	{
	
		newstr+ = str.charAt(i);

	}
	System.out.println("Rev " + newstr);
	}
}