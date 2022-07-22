package java_220722;

public class Passer {
	
	void toUpperCase(String[] text) {
		for(int i = 0; i < text.length; i++) {
			text[i]=text[i].toUpperCase();//원하는 위치의 문자를 대문자로 바꿔줌
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passer passer = new Passer();
		passer.toUpperCase(args);
		//배열을 인수로 넘겨주면, 배열의 주소값을 넘겨줌.
		//그러면 위에 넘어간 배열과 같은 주소값을 가지게 된다.
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]+" ");
		}
		System.out.println();
	}
}
