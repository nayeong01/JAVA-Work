
public class Qst2_1 {

	public static void main(String[] args) {
								// 외부값을 넘겨줄 수가 있음. 변수 이름을 맞춰줘야 한다.
		//String[] arguments = new String[2];
		
		int yearIn = 1980;
		/*
		if (args.length > 0) {
			monthIn = Integer.parseInt(args[0]);
		}*/
		if (args.length > 1) {
			yearIn = Integer.parseInt(args[1]);
		}
		
		int monthIn;
		for (monthIn=1; monthIn<=12; monthIn++) {
			int j;
			for (j=1; j<=countDays(monthIn,yearIn); j++)
			System.out.printf("%d/%d%n",monthIn,j);
		}

	}
	
		
	static int countDays(int month, int year) {
			int count = -1;
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
