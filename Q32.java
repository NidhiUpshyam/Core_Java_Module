//32.Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]


import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	private static int total;
	Student(){
		System.out.println("Const. called");
		total++;
	}
	void setData(int no, String n){
		rno = no;
		name = n;
		
	}
	void showData(){
		System.out.println("Roll no: " + rno + " Name: " + name + " No. of Student objects created: "+ total );
	}	
}

class Q32{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.setData(4,"Mayuri");
		s1.showData();
		Student s2 = new Student();
		s2.setData(5,"Shubham");
		s2.showData();
	}	
}


