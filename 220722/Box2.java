package java_220722;

import java.awt.Point;

public class Box2 {
	 
	int x1, y1, x2, y2 = 0;

	Box2(int x1, int y1, int x2, int y2) {
	     this.x1 = x1;
	     this.y1 = y1;
	     this.x2 = x2;
	     this.y2 = y2;
	  }

	 Box2(Point topLeft, Point bottomRight) {
	     this(topLeft.x, topLeft.y, bottomRight.x,bottomRight.y);
	 }// 생성자 안에서 다른 생성자의 인수를 부르고 싶다면 this를 사용하면 된다.
	  // 여기서는 위에 있는 첫번째 Box2의 인수가 this를 지칭하므로 첫번째Box2 인수를 두번째 Box2로 부를 수 있다
	 
     Box2(Point topLeft, int w, int h) {
         this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
     } // 여기도 첫번째 Box2 인수를 가져온다

     void printBox() {
         System.out.print("Box: <" + x1 + ", " + y1);
         System.out.println(", " + x2 + ", " + y2 + ">");
     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box2 rect; // Box2의 변수를 설정해준다

        System.out.println("Calling Box2 with coordinates " + "(13,35) and (10,40):");
        rect = new Box2(13, 35, 10, 40);
        rect.printBox();
        
        System.out.println("\nCalling Box2 with points " + "(9,27) and (17,19):");
        rect = new Box2(new Point(9, 27), new Point(17, 19));
        rect.printBox();

        System.out.println("\nCalling Box2 with 1 point " + "(5,40), width 22 and height 20:");
        rect = new Box2(new Point(5, 40), 22, 20);
        rect.printBox();

        
	}

}
