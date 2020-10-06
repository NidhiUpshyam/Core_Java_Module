/*61.	Create a Thread class to print following star (*) pattern on screen with delay 
  of 1 second between each * print. Number of lines in the pattern 
  should be passed to the constructor of Thread class.  
  *  * * * *  * * * * * * * * * * Use this class in main method and 
   ask user to enter number of lines to print.*/


//package com.p1;

import java.util.Scanner;

class MyThread extends Thread{
	int row;
	
	MyThread(int row){
		this.row = row;
	}
	
	@Override
	public void run() {
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			
		}
	};
}

public class Q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		MyThread m = new MyThread(row);
		m.start();
	}

}
