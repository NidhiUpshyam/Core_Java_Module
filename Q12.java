 
//12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]



import java.util.*;
public class Q12{   
public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
	double HRA;
	double DA;
	double basic = sc.nextDouble();
        if (basic < 10000)
	{
	   HRA = 0.1*basic;
	   DA = 0.9*basic;
         }
	else {

	HRA = 2000;
	 DA = 0.98*basic;
      }

double GS = basic + HRA + DA;

System.out.println("GROSS SALARY "+GS);

}
}
 