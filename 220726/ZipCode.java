
public class ZipCode {
	
	private String num;
	
	ZipCode(String num){
		setNum(num);
	}
	
	private void setNum(String num) {
		// TODO Auto-generated method stub
		this.num = num;
		if (num.length()==5) {
			System.out.println(num);
		} else {
			System.out.println("5자리 숫자를 입력하시오.");
		}
	}
	
	public String getNum() {
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZipCode zipcode = new ZipCode("12345");

		
		
		

	}

}
