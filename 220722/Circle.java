package java_220722;

public class Circle {
    int x, y, radius;

    Circle(int xPoint, int yPoint, int radiusLength) {
        this.x = xPoint;
        this.y = yPoint;
        this.radius = radiusLength;
    }

    Circle(int xPoint, int yPoint) {
        this(xPoint, yPoint, 1);
    }
    void printCircle() {
    	System.out.printf("x= %d, y=%d, radius=%d%n",this.x, this.y, this.radius);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(40, 40, 5); 
		Circle circle2 = new Circle(40, 40);
		//이것도 메서드 이름이 똑같은데 오버로딩으로 볼 수 있는건가?
		
		circle1.printCircle();
		circle2.printCircle();
	}

}
