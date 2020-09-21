//26.Create an array of 17 elements in 5 rows.  And calculate sum of all elements.


import java.util.Scanner;
class twoDArray{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int arr[][] = new int[5][];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter columns");
			int col = sc.nextInt();
			arr[i] = new int [col];
		
		for(int j=0;j<arr[i].length;j++){
			arr[i][j] = sc.nextInt();	
			}
		}
		int totalarray =0;
		for(int x[] :arr){
			int sum=0;
			for(int y: x ){
				sum+=y;
				totalarray+=sum;
				System.out.print(" "+y);
			}
			System.out.println();
			System.out.println("Sum of row= "+sum);
		}
		System.out.println("Total Array Sum = "+totalarray);
	}
}