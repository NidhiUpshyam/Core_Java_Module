//08.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

import java.util.*;

public class Q8{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the principle amount");
	double PA = sc.nextDouble();
	
	System.out.println("enter the rate of interest");
	double ROI = sc.nextDouble();

	System.out.println("enter the time");
	double T = sc.nextDouble();

	double SI = (PA*ROI*T)/100;
	System.out.println("SI is= "+SI);

	
	}

}