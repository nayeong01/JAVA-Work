package java_220721;

public class Qst2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String word = "sweet";
		char firstChar = 'o';
		char secondChar = 'e';
		// 일단 원하는 타입의 변수들을 설정해주고
		
		/*
		if (args.length > 0) {
		   word = args[0];
		} 
		*/
		
		if(args.length > 0)  // 한 개의 문자를 입력할 때 첫번째 변수를 입력받을 수 있고,
		  // args.length는 입력한 스트링을 말하는게 아니라 입력해서 저장된 배열의 갯수를 물어보는 것이다.
			firstChar = args[0].charAt(0);// charAt : string변수에서 원하는 한 글자만 char로 바꿔준다.
		if(args[0].length() > 1) // 이건 문자가 두 개일 때 두번째 변수를 입력받을 수 있게 한다.
		  // args[0].length()는 위처럼 저장된 배열의 갯수를 물어보는게 아니라, 그 입력받은 첫번째 배열요소의 길이를 물어보는 것이다.
			secondChar = args[0].charAt(1);
		
		// if 문을 두 개로 나누지 않고, 한꺼번에 입력받게 만들면, 한개의 문자를 돌릴 때,
		// 두번째 문자를 입력받지 않아서 오류가 발생해버린다.
		
		System.out.format("%dL",countNum(firstChar,secondChar));//여기서 선택된 num값을 불러내면 돼
		
	}

	static long countNum(char firstChar,char secondChar) { //위에서 지정한 변수에서 사용하고 싶은걸 넣고 스위치 돌리기
		
		long num = 0;
		switch(firstChar) {
			case 'o':
					num = 1L;
					break;
			case 't':
				if(secondChar == 'w')
					num = 2L;
				else if (secondChar == 'h')
					num = 3L;
				else if (secondChar == 'e')
					num = 10L;
				break;
			case 'f':
				if (secondChar == 'o')
					num = 4L;
				else if (secondChar =='i')
					num = 5L;
				break;
			case 's':
				if (secondChar == 'i')
					num = 6L;
				if (secondChar == 'e')
					num = 7L;
				break;
			case 'e':
				if (secondChar == 'i')
					num = 8L;
				break;
			case 'n':
				num = 9L;
				
			}
		return num; //선택된 num값을 위에 있는 변수로 이동시켜준다.
		}
	}

