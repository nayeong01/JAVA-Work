
public class StringChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "You know nothing, Jon Snow";
        System.out.println("The string is: " + str);
        System.out.println("Length of this string: "
            + str.length());
        // 공백까지 숫자로 센다
        System.out.println("The character at position 7: "
            + str.charAt(7));
        // 7번째 문자를 출력한다. 셀 때는 0부터 세고 공백도 센다.
        System.out.println("The substring from 9 to 16: "
            + str.substring(9, 16));
        // 9번째 문자부터 16번째 문자까지 출력한다.
        System.out.println("The index of the first 'w': "
            + str.indexOf('w'));
        // w가 있는 위치를 숫자로 세준다.
        System.out.println("The index of the beginning of the "
            + "substring \"Jon\": " + str.indexOf("Jon"));
        // 스트링 타입 위치 세는 것도 가능해.
        System.out.println("The string in uppercase: "
            + str.toUpperCase());
        // 모든 스트링 문자를 대문자로 바꾸어준다.


	}

}
