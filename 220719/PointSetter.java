import java.awt.Point;
public class PointSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point location = new Point(4, 13);

        System.out.println("Starting location:");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

        System.out.println("\nMoving to (7, 6)");
        location.x = 7;
        location.y = 6;

        System.out.println("\nEnding location:");
        System.out.println("X equals " + location.x);
        System.out.println("Y equals " + location.y);

	}

}
