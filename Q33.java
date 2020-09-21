//33.Write a program to demonstrate functionalities of this keyword in java. 



class Forthis{

	int aa;
	void demo(int aa){
	this.aa=aa;
	System.out.println(aa);

}
}

	class Q33{

	public static void main(String args[])
{

Forthis bb = new Forthis();
bb.demo(100);

}
}
