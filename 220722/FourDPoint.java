package java_220722;

import java.awt.Point;

public class FourDPoint extends Point {

	/**
	 * 
	 */
	private static final long serialVersionUID = -125506659776875752L;
	
	int x1, y1, x2, y2 = 0;
    
    FourDPoint FourPoint(Point topLeft, Point bottomRight) {	
    	x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }   
    
    void printPoint(){
        System.out.print("Point: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourDPoint rect = new FourDPoint();
		System.out.println("Calling FourDPoint with "+
				"points (10,10) and (20,20):");
		rect.FourPoint(new Point(10,10), new Point(20,20));
		rect.printPoint();
	}
}
