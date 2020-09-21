//34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.


import java.util.*;
class CircleDemo{

	private int radius;
	private double area;
	final double PI = 3.14;

	void init(int radius){
		this.radius=radius;
	}

	void calculateArea(){
	this.area = PI * (radius * radius);

}

   	void display(){

		System.out.println("Area of circle is" +area);
		}
}

class Q34
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter radius");
	int radii = sc.nextInt();
	CircleDemo r = new CircleDemo();
	r.init(radii);
	r.calculateArea();
	r.display();
	}
}

