//36.Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
//a.	 two integers 
//b.	 three floats 
//c.	 all elements of array 
//d.	one double and one integer 



import java.util.Scanner;
 class MathOperation
{  
void mult(int a, int b) 
{  
int c =a*b;
 System.out.println("multiple of 2 int ="+c);
 }
  void mult(float a,float b,float c)
 {
 float d =a*b*c; 
System.out.println("multiple of 3 float ="+d);
 }
  void mult(int arr[])
 {  
int c =1;  
 for(int i=0;i<arr.length;i++) 
    {       
  c =c * arr[i];     
         }      
System.out.println("Array multiple ="+c); 
}
  void mult(double a,int b)
 {    double c =(double)(a*b);  
  System.out.println("multiple of double and int ="+c);
 }  
} 
class Q36{ public static void main(String args[])
 {    
 Scanner sc = new Scanner(System.in); 
   MathOperation m = new MathOperation();  
  m.mult(5,6);  
  m.mult(1.0F,2.0F,3.0F);   
 m.mult(5.0,5);     
  int arr[] = new int [3];  
  System.out.println("Enter the elements");
 for(int i=0;i<arr.length;i++)
 {       
arr[i]=sc.nextInt();
 }    
m.mult(arr); 
} 
}