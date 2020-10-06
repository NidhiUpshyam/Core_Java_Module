/*Q67.	Write a program to read data from shopping.dat file creted in above problem and find total money spent on all shopping items. . (Use ObjectInputStream to read Item class object).*/

import java.io.*;

public class Q67 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream f = 
				new FileInputStream("D:\\core_java\\codes\\shopping.dat");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Shopping s = (Shopping)o.readObject();
		
		System.out.println(s); 
				
		f.close();
		System.out.println("success");
	}

}
