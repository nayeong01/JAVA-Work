package java_220722;

public class MarsRobot {
    
	String status;
    int speed;
    int power;

    MarsRobot(String in1, int in2, int in3) {
        status = in1;
        speed = in2;
        power = in3;
    }
    
    void PrintMarsRobot() {
    	System.out.printf("%s %d %d",status,speed,power );
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarsRobot curiosity = new MarsRobot("exploring", 5, 200);
		curiosity.PrintMarsRobot();
		
	}

}
