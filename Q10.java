//10.Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]


import java.util.*;
public class Q10{

	public static void main(String args[])	
	{
	double fahrenheit;
	double  celsius;
        Scanner sc=new Scanner(System.in);	   	 
	System.out.println("Enter Fahrenheit temperature");
               fahrenheit = sc.nextDouble(); 
	
	 	celsius = 5*(fahrenheit-32)/9;

System.out.println("Celsius temperature is " + celsius + " in Celsius");		  	  	     
	
	}
}