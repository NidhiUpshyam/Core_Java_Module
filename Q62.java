/*62.	Create a class that checks whether a given number is prime or not using  Runnable interface.*/


//package com.p1;

import java.util.Scanner;

class PrimeCheck implements Runnable{

	int num;
	
	
	PrimeCheck(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=2; i<num/2; i++) {
			if(num%i == 0) {
				System.out.println(+num+" is not a Prime number");
				break;
			}
		}
		if(num%i != 0) {
			System.out.println(num+" is a Prime number");
		}
	}
	
}

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Prime number or not : ");
		int num = sc.nextInt();
		
		PrimeCheck p = new PrimeCheck(num);
		Thread t = new Thread(p);
		
		t.start();
	}

}
