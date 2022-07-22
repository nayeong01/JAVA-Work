package java_220722;

public class ScopeTest {
	int test = 10;//this는 이걸 가르킨다. 클래스 내부 자신을 의미함
	
	void printTest() {
		int test = 20;// 이건 지역변수
		System.out.println("Test: "+ test);// 이렇게 하면 지역변수가 찍힌다.
		System.out.println("Test: "+ this.test);// this를 설정하면 클래스 변수가 찍힌다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeTest app = new ScopeTest();
		app.printTest();

	}

}
