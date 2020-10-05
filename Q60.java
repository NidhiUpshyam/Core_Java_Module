//Q60.Create Interface StudentFee and declare following method.  getFee() throws InvalidFeeException. This method ask fees from user and throws exception if user enters invalid or negative fees Create class Student with members (name, fees) and implement the StudentFee Interface.

//package Excep;
import java.util.*;

interface StudentFee
{
	int getFee() throws Exception;
}
class StudentChild implements StudentFee{
	private int fee;
	public int getFee() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee : ");
		fee=sc.nextInt();
		if(fee<=0 || fee >100000)
		{
			throw new Exception("Invalid fee");
		}
		return fee;
	}
}
public class Q60 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			StudentChild c=new StudentChild();
			System.out.println(c.getFee());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			
	}

}