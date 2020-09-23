//39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
//Create a main method in different class (say ProductDemo) and perform following task:
//a. Accept information for five Product objects from user and store objects in an array
//b. Find pid of product with highest price. 
//c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )


import java.util.*;
import java.lang.*;

class Product{
    public int pid;
    public float price;
    public int quantity;

   Product(){
      
       } 
  
   
   Product(int pid,float price,int quantity){
     this.pid=pid;
     this.price=price;
     this.quantity=quantity;
      
    } 

      static void calculate(Product[] arr){
      double res=0;
      for(Product a:arr){
           res=res+(double)
      (a.price*a.quantity);
        }
       System.out.println("Total Amount spent:"+res);
      }

    void show(){
       System.out.println(pid+""+price+""+quantity);


    }



}


    class Q39{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Product pr[]=new Product[5];
    for(int i=0;i<pr.length;i++){
          System.out.print("Enter ID,Price & Quantity:");
          int id=sc.nextInt();
          float price=sc.nextFloat();
          int quantity=sc.nextInt();
          Product p=new Product(id,price,quantity);
          pr[i]=p;
    }
    
   float max=pr[0].price;
   Product p=new Product();
   for(Product a:pr){
         a.show();
         if(a.price>max){
            max=a.price;
            p=a;

        }


    }


       System.out.println("Max Product element:"+p.pid+""+p.price+""+p.quantity);
       Product.calculate(pr);
    }

 
 }




     