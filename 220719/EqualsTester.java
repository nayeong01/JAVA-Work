
public class EqualsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1, str2;
		str1 = "Boy, that escalated Quickly.";
		
		str2 = str1;
		// 위는 같은 주소값을 지정해주는 것.
		System.out.println("String1: "+ str1);
		System.out.println("String2: "+ str2);
		System.out.println("Same object? " + (str1 == str2));
		// 그래서 서로 비교 했을 때 같다고 결과값이 추출된다.
		
		str2 = new String(str1);
		// 여기서 str2과 str1의 내용은 같겠지만, 지정하고 있는 주소값은 각기 다르다.
		System.out.println("String1: "+ str1);
		System.out.println("String2: "+ str2);
		System.out.println("Same object? " + (str1==str2));
		// 그래서 여기서 다르다고 결과값이 추출된다.
		System.out.println("Same value? " + str1.equals(str2));
		// 객체 안에 있는 내용들이 동일한지 비교하고 싶으면 equals를 사용하면 된다.
		
	}

}
