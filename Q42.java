//Q42.Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.



import java.util.*;
  class Tile{
	  int length;
	  Tile(int length){
		  this.length=length;
		  
	  }
	  
  }
  class Floor {
	  int length;
	  int width;
	
		Floor(int length,int width){
			this.length = length;
			this.width = width;
		}
	void totalTiles(Tile t){
	double titlArea = t.length * t.length;
	double floorArea = this.length * this.width;
	int total =(int) (floorArea / titlArea);
	System.out.println("Total tiles "+total); 	
  }
  }
  
  class Q42{
	  public static void main(String args[]){
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter length of tile: ");
		  int lt =sc.nextInt();
		  
		  Tile t =new Tile(lt);
		  
		  System.out.print("Enter length and width of floor: ");
		  int lf = sc.nextInt();
		  int wf=sc.nextInt();
		  
		  Floor f = new Floor(lf,wf);
		  f.totalTiles(t);
	  }
	  
  }
  