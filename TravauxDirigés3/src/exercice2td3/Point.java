package exercice2td3;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 public void deplace(int dx, int dy) {
		 x += dx;
		 y += dy;
	 }
	 
	 public void affCoord() {
		 System.out.println("Coordonnees : "+x+""+y);
	 }
	 
	 public int getx() {
		 return x;
	 }
	 
	 public int gety() {
		 return y;
	 }
}
