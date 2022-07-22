package java_220722;

public class Qst3_1 {
	
    String status;
    int speed;
    float temperature;
    
    
    Qst3_1(String in1, int in2, float in3){
        this.status = in1;
        this.speed = in2;
        this.temperature = in3;
    }
    
    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

	public static void main(String[] args) {
		Qst3_1 qst = new Qst3_1("exploring", 40 ,50);
		qst.showAttributes();
		
	}
}