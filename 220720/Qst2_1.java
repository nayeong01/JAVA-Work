
public class Qst2_1 {

	public static void main(String[] args) {
						// 외부값을 넘겨줄 수가 있음. 변수 이름을 맞춰줘야 한다.
		//String[] arguments = new String[2];
		
		int yearIn = 1980;
		/*
		if (args.length > 0) {
			monthIn = Integer.parseInt(args[0]);
		}
		*/
		if (args.length > 1) {
			yearIn = Integer.parseInt(args[1]);
		}
		
		int monthIn;
		for (monthIn=1; monthIn<=12; monthIn++) {
			int j;
			for (j=1; j<=countDays(monthIn,yearIn); j++) {
				if(monthIn==12 && j==countDays(monthIn,yearIn)) {
					System.out.printf("%d월 %d일 ",monthIn,j);
				}
				else
					System.out.printf("%d월 %d일, ",monthIn,j);
				// 이 if문은 사이에 쉼표를 찍어주다가 마지막 12월 31일에는 쉼표를 제거하기 위함이다. 
				
				System.out.println(monthIn+"/"+j+" ");
				System.out.printf("%d월 %d일, ",monthIn,j);
				// println형식이랑 format형식으로 만들어봤다. 둘이 똑같은 결과값이 나와.
				// for문에서 블럭을 만드는 경우는 밑에 복합문이 있을 때 치고, 아닐 때는 굳이 안 만들어도 된다.
			}
		}
	}
	
		
	static int countDays(int month, int year) {
			int count = -1; // 지역변수는 반드시 초기값을 아무거나 지정해준다. 초깃값이 없으면 오류 남.
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				count =31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count = 30;
				break;
			case 2:
				if (year % 4 ==0) {
					count = 29;
				} else {
					count = 28;
				}
				if ((year % 100 ==0)&(year % 400 !=0)) {
					count = 28;
			}	
		}
		return count;
	}
}