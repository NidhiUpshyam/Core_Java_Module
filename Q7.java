//07.Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.


import java.util.*;


public class Q7{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of subjects");
	int subjects = sc.nextInt();

int sum=0;
for(int i=0; i<subjects; i++){
System.out.print("enter suject "+i+" marks");
int marks = sc.nextInt();
sum+=marks;

}

double per = sum/(double)subjects;

System.out.println("percentage is= "+per + "%");



}


}