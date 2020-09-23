//37.Create a class Person with properties (name and age) with following features. 
//a.	Default age of person should be 18.
//b.	A person object can be initialized with name and age.
//c.	Method to display name and age of person
//Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods



import java.util.Scanner;

	class Person
	{
		int age;
		String name;
		
		Person()
		{
			age=18;
		}
		
		void setData(int age, String name)
		{
			this.age=age;
			this.name=name;
		}
		
		void display()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
	}

	class Q37
	{
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter Name: ");
			String name=scan.next();
			System.out.print("Enter age: ");
			int age=scan.nextInt();
			
			Person P=new Person();
			P.setData(age,name);
			P.display();
		}
	}