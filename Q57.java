//Q57.Write a program to reverse every word of the String.

//package a3;
import java.util.*;
public class Q57 {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String reverceWord="";
	String str1[]=str.split(" ");
	
	for(String ss:str1) {
		StringBuilder ss1=new StringBuilder(ss);
		ss1.reverse();
		reverceWord+=ss1+" ";
	}
	System.out.print(reverceWord);
	
}
}
