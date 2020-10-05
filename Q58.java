//Q58.Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position from user and print day name. Handle array index out of bound exception and give proper message if user enter day index outside range (0-6).  

//package a3;
import java.util.Scanner;
public class Q58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2[]= {"Sun","Tue","Wed","Thur","Fri","Sat","Mon"};
		int a=sc.nextInt();
		for(int i=0;i<str2.length;i++) {
			if(i==(a-1)) {
				System.out.print(str2[i]);
				break;
			}
		}
		

	}

}