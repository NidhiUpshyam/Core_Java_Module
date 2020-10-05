//Q56.Write a program to convert very first character of every word in uppercase in a String.

//package a3;
import java.util.*;
public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		char ch=' ';
		String str="rrrr gggg";
		for(int i=0;i<str.length();i++) {
			if(ch==' ' && str.charAt(i)!=' ') 
				s.append(Character.toUpperCase(str.charAt(i)));
		   else
		                s.append(str.charAt(i)); 
				ch=str.charAt(i);
			
		}
		
		System.out.print(s.toString().trim());
	}

}