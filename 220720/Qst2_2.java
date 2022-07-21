package java_220721;

public class Qst2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "sweet";
		//long num = 0;
		// 일단 원하는 타입의 변수들을 설정해주고
		if (args.length > 0) {
		   word = args[0];
		} // 이 if문은 밖에서 불러올 수 있게 하는건데... 길이는 왜 0보다 클 때이지? 그냥 실행시키기 위해 조건을 만든건가?
		
		System.out.format("%dL",countNum(word));//여기서 선택된 num값을 불러내면 돼
	}
	
	static long countNum(String word) { //그 변수를 넣고 스위치 돌리기
		long num = 0;
		switch(word) {
			case "sord":
				num = 1L;
				break;
			case "winter":
				num = 2L;
				break;
			case "enum":
				num = 3L;
				break;
			case "toy":
				num = 4L;
				break;
			default:
				System.out.println("No match!!");
			}
		return num; //선택된 num값을 위에 있는 변수로 이동시켜준다.
		}
	
	}