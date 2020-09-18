//09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.



import java.util.*;

public class Q9{
        public static void main( String args[]){
	
	int num,year,months,days,temp; 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of days");
	

	num = sc.nextInt();

	year=num/365;
	temp=num%365;
	months=temp/30;
	temp=temp%30;
	days=temp;

System.out.println("years are= "+year+ " months are= "+months+" days are "+days);
	}
}





/*

temp=0
num=400
year=num/365
year=400/365=1

temp=num%365=35

month=temp/30=1
temp=temp%30=5
days=temp=5
1 yr 1 mnth 5 days*/ 




















