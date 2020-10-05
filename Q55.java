//Q55.Write a program to count no of words in the String.

//package a2;
import java.util.*;
public class Q55 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
  String str1="Nidhi Upashyam";
  String str3=sc.nextLine();
  String str2[]=str3.split(" ");
  int i=str2.length;
  System.out.print(i);
}
}