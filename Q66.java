/*Q66.	Write a program to store your shopping details in a binary file(shopping.dat) with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object ).*/



//package p1;
import java.io.*;

class Shopping implements Serializable{
		private String itemName;
		private float price;
	        public int quantity;
		public Shopping () {

		}
		public Shopping(String itemName,float price,int quantity ) {
			this.itemName = itemName;
			this.price = price;
	                this.quantity=quantity;
		}
		@Override
		public String toString() {
			return itemName + " " + price + " " + quantity;
		}
		
	}
	

	public class Q66 {

		public static void main(String[] args) throws IOException,ClassNotFoundException {
			FileOutputStream f = 
					new FileOutputStream("D:\\core_java\\codes\\shopping.dat");
			
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(new Shopping("abc",2300f,5));
			o.close();	
			f.close();
			System.out.println("success");
		}

	}
