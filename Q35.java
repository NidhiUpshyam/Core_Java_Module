//35.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.

import java.util.*;
class MathOpr{
	static int add(int n1 , int n2){
	return n1 + n2;
	}
	
	static int sub(int n1 , int n2){
	return n1 - n2;
	}
	
	static int mul(int n1 , int n2){
	return n1 * n2;
	}

	static double power(double n1 , double n2){
	return Math.pow(n1,n2);
	}
}

	class Q35{
	public static void main(String args[]){
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two numbers");
	
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println("addition is" +MathOpr.add(num1,num2));
	System.out.println("substraction is" +MathOpr.sub(num1,num2));
	System.out.println("multiplication is" +MathOpr.mul(num1,num2));
	System.out.println("power is" +MathOpr.power(num1,num2));
		}
	}
}