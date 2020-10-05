//Q43.Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 

//package p1;

			import java.util.*;
			class OneBHK{
			public double roomArea;
			public double hallArea;
			public int price;
			OneBHK(){
				
			}
			OneBHK(double roomArea,double hallArea,int price){
				this.roomArea=roomArea;
				this.hallArea=hallArea;
				this.price=price;
				
			}
			void show(){
				System.out.println("Area of Room "+roomArea);
				System.out.println("Area of Hall "+hallArea);
				System.out.println("Price is "+price);
				System.out.println("Total Amount of TwoBHK: "+totalAmount1());
				
			}
			
			double totalAmount1(){
				double total =(roomArea + hallArea)* price;
				return total;
			}
		}
			

		class TwoBHK extends OneBHK{
			public double room2Area;
			
			TwoBHK(){
				
			}
			
			TwoBHK(double room2Area,double roomArea,double hallArea,int price){
				super(roomArea,hallArea,price);
				this.room2Area=room2Area;
				
			}
			void  show(){
				super.show();
				System.out.println("Area of TwoBHK Room "+room2Area);
				System.out.println("Total Amount of TwoBHK: "+totalAmount());
			}
			double totalAmount(){
				double total =(room2Area + roomArea + hallArea)* price;
				return total;
			}
		}

		class Q43 {
			public static void main (String[] args){
				TwoBHK t = new TwoBHK(20.2,10.2,23.1,100);
				t.show();
				TwoBHK t1 = new TwoBHK(21.3,9.5,22.1,100);
				t1.show();
				TwoBHK t2 = new TwoBHK(20.5,8.5,5.36,100);
				t2.show();
				
				
				
			}
		


	}



