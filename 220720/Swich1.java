
public class Swich1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		switch (x) {
		    case 2: // 처음에 여기부터 시작해서 걸리는 구간까지 죽 내려간다.
		    case 4:
		    case 6:
		    case 8:
		        System.out.println("x is an even number");
		        break;
		    default: // 위에서 걸리는 구간이 하나도 없다면 일로 도착.
		        System.out.println("x is an odd number");
		}
	}

}
