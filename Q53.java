//Q53.Input data exactly in the following format, and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.   (Hint use String class split method and Integer class parseInt method) .


//package a2;
import java.util.*;
public class Q53 {

	public static void main(String[] args) {
		String s[]= {"1","2","3","4","5","6","7"};
		double sum=0;
		for(String ss:s) {
			int a=Integer.parseInt(ss);
			sum+=a;
		}
		System.out.println("Sum of Integers are:"+sum);
	}

}