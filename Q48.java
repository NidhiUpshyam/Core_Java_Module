//48.Create an Abstract class Processor with int member variable data  and method showData to display data value. Create abstract method process() to define processing of member data. Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method. b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.Ask user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve this mechanism.


import java.util.Scanner;
abstract class Processor {
    double data;

    void showdata(){
     System.out.println(data);
    }

    abstract void process();
}

class factorial extends Processor{
   void process(){
        int n =5;
       int sum=1;
        for(int i= 1; i<=n; i++){
            sum = sum *i;
        }
        data = sum;
   }
}	
class circle extends Processor{
    void process(){
        int r=5;
        double area;
        area = 3.14f * r * r;
        data = area;
    }
}
class Q48{
public static void main(String args[]){
    Processor p = new factorial();
    Processor p1 = new circle();
      p.process();
      p1.process();
      p.showdata();
      p1.showdata();
}}