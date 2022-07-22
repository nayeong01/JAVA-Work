package java_220722;

public class Averager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		if (args.length >0) { 
			for (int i =0; i<args.length; i++) {
				System.out.printf("%s ",args[i]);//args에 입력되는건 스트링 타입이다.
				sum+= Integer.parseInt(args[i]);// 입력받는 스트링을 int로 바꿔준다.
			}
			System.out.println("\nSum is: "+sum);
			System.out.println("Average is: "+(float)sum/args.length);
		}
	}
}
