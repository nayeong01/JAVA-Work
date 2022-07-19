
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float f1 = 12.5F;
		float f2 = 27.2F;
		
		System.out.println("Lower number: " + Math.min(f1, f2));
		//min()은 원래 double 타입의 하위 클래스이다.
		// f1, f2는 자동 언박싱을 통해 min()메서드에 float형 인수를 전달한다.
		

	}

}
