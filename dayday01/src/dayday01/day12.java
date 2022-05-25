package dayday01;


public class day12 {

	public static void main(String[] args) {
		Circle c=new Circle(2,3,4);
		c.showcirclelnfo();
	}
	
}
class point{
	int xPos,yPos;
	public point(int x,int y) {
			xPos =x;
			yPos=y;
	}
	public void showpointUnfo(){
		System.out.println("["+xPos+","+yPos+"]");
	}
}
 class Circle{
	 int rad;
	 point center;
	 
	 public  Circle(int x,int y,int r) {
		 center= new point(x, y);
		 rad=r;
	 }
	 public void showcirclelnfo() {
		 System.out.println("radius:"+rad);
		 center.showpointUnfo();
	 }
}
 