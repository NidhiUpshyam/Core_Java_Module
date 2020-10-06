/*Q63.	Write a program to count how many times character ‘t’ occurs in a file.*/

//package p1;
import java.io.*;

public class Q63 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f1=new FileOutputStream("E:\\corejava\\DayFile2\\Demo3.txt");
		 String s=" Hi This is demo of FileOutputStream:\n ";
		 //f1.write(s); error as byte by byte
		 for(int i=0;i<s.length();i++)
		 {
			 f1.write(s.charAt(i));
			 
		 }
         f1.close();
         System.out.println("Success");
         int ch=-1;
         int count=0;
         FileInputStream f2=new FileInputStream("E:\\corejava\\DayFile2\\Demo3.txt");
         {
        	 while((ch=f2.read()) != -1)
            {
	           System.out.print((char)ch);
	           char ch1=(char)ch;
	           if(ch1=='t')
	           {
	        	   count++;
	           }
            }
        	
         }
         System.out.println(count);
         f2.close();
	}

}


