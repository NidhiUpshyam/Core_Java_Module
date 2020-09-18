//13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  


//using if else

import java.util.*;
public class CQ13{   
public static void main(String args[])
   {
	int x, y, z;
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
        x = sc.nextInt();
        System.out.println("Enter the second number:");
        y = sc.nextInt();
        System.out.println("Enter the third number:");
        z = sc.nextInt();
	 if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z && y > x)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
 
    }
}

	



 