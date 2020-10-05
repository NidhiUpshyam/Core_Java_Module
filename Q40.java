//Q40.Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].



import java.util.*;
class Student {
	private String name;
	private int rollno;
	private int age;
	private int score;
	
	void input(String name,int rollno,int age,int score){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.score=score;
	}
	
	void display(){

		if(score >= 0 && score <= 50){
			System.out.println("Students scored between 0-50   "+name+"  "+rollno+"  "+age+"  "+score);
		}
		else if(score > 50 && score <= 65){
			System.out.println("Students scored between 50-65   "+name+"  "+rollno+"  "+age+"  "+score);
		}
		else if(score > 65 && score <= 80){
			System.out.println("Students scored between 65-80   "+name+"  "+rollno+"  "+age+"  "+score);
		}
		else if(score > 80&& score <= 100){
			System.out.println("Students scored between 80-100   "+name+"  "+rollno+"  "+age+"  "+score);
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

class Q40{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of records");
	int r = sc.nextInt();
	Student arr[] = new Student[r];
	for(int i =0;i<arr.length;i++){
		System.out.println("Enter the name of Student");
		String name = sc.next();
		System.out.println("Enter the roll no of Student");
		int rollno = sc.nextInt();
		System.out.println("Enter the age of Student");
		int age = sc.nextInt();
		System.out.println("Enter the Score of Student");
		int score = sc.nextInt();
		Student s = new Student();
		s.input(name,rollno,age,score);
		arr[i]=s;
	}
	for(Student a : arr)
	{
		a.display();
	}
	}
	
}