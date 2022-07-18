package first.com.ezdesign;

public class Variables {
	
	public static void main(String[] arguments) {
		// TODO Auto-generated method stub
		final char UP = 'U'; // final를 써주면 고정된 값을 쓸 수 있다.
		byte initialLevel = 12;
		short location = 13250;
		int score = 3500100;
		boolean newGame = true;
		
		System.out.println("당신의 레벨은 " + initialLevel
				+" score is "+ score + " and location is "+ location + ".");
		System.out.println("Press "+UP + " to go up.");
		System.out.println("Is this a new game for you? "+ newGame);
		System.out.println("Sams Teach Yourself Node in the conmmode\u2122");
	
	}
}
