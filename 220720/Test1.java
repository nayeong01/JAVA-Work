
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] cen = new int[100][52][7];
		System.out.println("Elements in 1st dimension: " + cen.length);// = 100개 값 출력
		System.out.println("Elements in 2nd dimension: " + cen[0].length); //= 152개 값 출력
		System.out.println("Elements in 3rd dimension: " + cen[0][0].length); //= 7개 값 출력
		// 각각 배열마다의 길이를 이런 식으로 빼낼 수 있다.

	}

}
