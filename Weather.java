package first.com.ezdesign;

public class Weather {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		float fah = 86;
		System.out.println(fah + " 화씨는 ... ");
		// 화씨를 섭씨로
		//먼저 32 빼기
		fah = fah - 32;
		//답을 9로 나누기
		fah = fah / 9;
		//답을 5로 곱하기
		fah = fah * 5;
		System.out.println(fah + " 도 섭씨 \n");
		
		float cel = 33;
		System.out.println(cel + " 섭씨는 ...");
		//섭씨를 화씨로
		//먼저 9를 곱하기
		cel = cel * 9;
		//그것을 5로 나누기
		cel = cel / 5;
		//거기에 32 더하기
		cel = cel + 32;
		System.out.println(cel + " 도 화씨");
	}
}
