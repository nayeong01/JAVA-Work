
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
			System.out.println("5�ڸ� ���ڸ� �Է��Ͻÿ�.");
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
