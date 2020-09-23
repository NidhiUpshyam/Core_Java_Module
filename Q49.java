//49.Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
import java.util.Scanner;

interface taxable{
    double salesTax = 0.07;
    double incomeTax = 0.10;

   void calcTax();
}

class Employee implements taxable{
        int empid;
        int salary;
        String name;
        Employee() {}

        Employee( int empid,int salary,  String name  ){
            this.empid = empid;
            this.salary=salary;
            this.name=name;
        }

      public void calcTax(){
             double incomeTax1 = salary * incomeTax ;
             System.out.println("Total incometax is "+incomeTax1);
             }

}

class product implements taxable{
    int pid;
    int price;
    int quantity;
    product() {}

    product( int pid, int price,  int quantity  ){
        this.pid = pid;
        this.price=price;
        this.quantity=quantity;
    }

  public void calcTax(){
         double saleTax1 = ( price * quantity ) * salesTax ;
         System.out.println("Total saletax is "+saleTax1);
         }

}

class Q49{
public static void main(String args[]){
    taxable t = new Employee(1 , 15000, "jack");
    taxable t1 = new product(1 , 400, 5);
    t.calcTax();
    t1.calcTax();
}}