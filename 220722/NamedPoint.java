package java_220722;

import java.awt.Point;

public class NamedPoint extends Point {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5560561797232630339L;
	
	String name;

    NamedPoint(int x, int y, String name) {
        super(x, y); // super는 반드시 첫번째 하위생성자에서 불러야 한다.
        this.name = name;
    }

    public static void main(String[] arguments) {
    	
        NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
        System.out.println("x is " + np.x);
        System.out.println("y is " + np.y);
        System.out.println("Name is " + np.name);
    }
}



