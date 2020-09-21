//31.Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.

class Student{
	private int rno;
	private String name;
	void setData(int rollno,String studname){
		rno = rollno;
		name = studname;
	}
	void show(){
		System.out.println("Roll No : "+rno+" "+"Name : "+name);
	}
};

class Q31{
	public static void main(String args[]){
		Student S1 = new Student();
		S1.setData(67,"Nidhi");
		S1.show();
		S1.setData(66,"Tanu");
		S1.show();
	}
}