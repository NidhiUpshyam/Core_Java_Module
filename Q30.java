//30.Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.

import java.util.Scanner;
class Q30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("====3X3 Matrix====");
		for(int ar[] : arr){
			for(int a:ar){
				System.out.print(a+" ");
			}
			System.out.println();
		}
		int sum=0,leftsum=0,a,b;
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				if(i==j){
					sum=sum+arr[i][j];
				}
				if(j==arr.length-i-1){
					leftsum=leftsum+arr[i][j];
				}
				
			}
		}
		System.out.println("Sum = "+sum);
		System.out.println("LeftSum = "+leftsum);
	}	
}