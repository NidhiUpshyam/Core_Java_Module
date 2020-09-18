//14.Program to check that entered year is a leap year or not.


import java.util.*;
public class Q14{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the year");
	int year = sc.nextInt();
	
       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
               System.out.println("Year " + year + " is a leap year");
       else
               System.out.println("Year " + year + " is not a leap year");
               System.out.println();
    }
}