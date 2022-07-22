package java_220722;

public class RangeLister {
	int[] makeRange(int lower, int upper) {
		// makeRange는 메서드 이름인가?
		int[] range = new int[(upper-lower)+1];
		// range 이건 인스턴스 변수이름인가?
		for (int i =0; i<range.length; i++) {
			range[i]=lower++;
		}
		return range;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] range;
		// 빈 변수하나 설정해주고,
		RangeLister lister = new RangeLister();
		// 여기도 인스턴스 클래스 하나 만들어주고,
		range = lister.makeRange(4, 13);
		// 여기선 위에 있는 클래스 메서드를 사용해주고,
		//(클래스이름.메서드이름 이렇게 쓰면 사용가능)
		System.out.print("The array:[ ");
		for(int i=0; i<range.length;i++) {
			System.out.print(range[i]+" ");
		}// 여기는 for문으로 위에 있는 클래스에서 돌려진 range 배열에 들은 것들을 출력한다.
		System.out.println("]");

	}

}
