//29.Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.

import java.util.Scanner;
class Q29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = {{1,2,3,5,8},{1,4,5,6},{2,4,7,8,9}};
		int row=0;	
		for(int ar[] : arr){
			int count=0;
			for(int a:ar){
				count++;
				System.out.print(a+" ");
			}
			row++;
			System.out.print("!!!Total no of Elements in 1-D array = "+count);
			System.out.println("");
		}
		System.out.println("=======================================");
		System.out.print("Total no of 1-D Array in 2-D Array = "+row);
	}	
}