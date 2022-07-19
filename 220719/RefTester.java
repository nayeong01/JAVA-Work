import java.awt.Point;

public class RefTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point pt1, pt2;
		pt1 = new Point(100, 190);
		// pt1은 변수가 아닌 객체에 대한 주소값이 된다.
		pt2 = pt1; // pt2에서 pt1으로 참조 생성(복사본 생성이 아니다.)
		
		pt1.x = 200;
		pt2.y = 290;
		System.out.println("Point1: "+pt1.x+", "+pt1.y);
		System.out.println("Point2: "+pt2.x+", "+pt2.y);
		
		

	}

}
