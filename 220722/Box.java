package java_220722;

import java.awt.Point;

public class Box {
    int x1, y1, x2, y2 = 0;
    
    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }
    
    Box buildBox(Point topLeft, Point bottomRight) {
        /*
    	x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
        */
        return buildBox(topLeft.x, topLeft.y,bottomRight.x, bottomRight.y);
        // 위처럼 작성할 수도 있고, 지금처럼 한줄에 쓸 수도 있다.
    }   
    
    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }
    
    void printBox(){
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box rect = new Box();
		
		System.out.println("Calling buildBox with "+ "coordinates (25,25) and (50,50): ");
		rect.buildBox(25, 25, 50, 50);
		rect.printBox();
		
		System.out.println("\nCalling buildBox with "+
				"points (10,10) and (20,20):");
		rect.buildBox(new Point(10,10), new Point(20,20));
		rect.printBox();
		
        System.out.println("\nCalling buildBox with "
                + "point (10,10), width 50 and height 50:");

            rect.buildBox(new Point(10, 10), 50, 50);
            rect.printBox();
         // 메서드 이름이 똑같아도 각각 필요한 인수의 타입만 맞춰주면 알아서 맞는 메서드를 이용하고 출력한다.

	}
}
