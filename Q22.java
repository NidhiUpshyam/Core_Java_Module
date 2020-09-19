//22.Sort a ten element array in descending order.


import java.util.*;
public class Q22{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the elements");
	int arr[] = new int[10];
	int sum = 0;
	
		for(int i = 0; i < arr.length; i++)
		{
			
			arr[i]  = sc.nextInt();
			
		}
	
		Arrays.sort(arr);
		System.out.println("Descending Order is");
		for(int i = arr.length - 1; i >= 0; i--){
		
		System.out.println(  arr[i] +" ");
		
		}
			
	
	}
			
}