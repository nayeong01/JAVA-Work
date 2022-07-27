package com.ezdesign.task1;

public class HexReader {
	
	String[]input = { "000A110D1D260219 ", "78700F1318141E0C ","6A197D45B0FFFFFF " };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HexReader hex = new HexReader();
		for(int i =0;i<hex.input.length;i++)
			hex.readLine(hex.input[i]);
	}
	
	void readLine(String code) {
		try {
			for(int j=0; j+1<code.length(); j+=2) {
				String sub = code.substring(j, j+2);
				int num = Integer.parseInt(sub, 16); //int 16진수로 바꾸기
				if(num == 255) { //1. FF=255에 해당되어 여기 부분에서 리턴을 해도,
					return;
				}
				System.out.print(num+" ");
			}
		}finally {
			System.out.println("**"); //2. finally는 반드시 찍힌다. 
		}
	}
}
