//28.Initialize one String type of array and print 
//the elements using for each loop.

import java.util.Scanner;
class Q28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements in string");
		String arr[] = new String[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.next();
		}
		System.out.println("======================s");
		for(String ar : arr){
			System.out.println(ar);
		}		
	}
}