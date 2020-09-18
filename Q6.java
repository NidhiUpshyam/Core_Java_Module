//06.Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.



import java.util.*;
public class Q6{
	public static void main(String args[]){
	double area;
	double cir;
	double pi=3.14;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius");
	int r = sc.nextInt();
	area=pi*r*r;
	System.out.println(area);
	cir=2*pi*r;
	System.out.println(cir);





	}
}