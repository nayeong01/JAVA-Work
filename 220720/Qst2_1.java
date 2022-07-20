public class Qst2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthIn = 2;
		int days = 25;
		int year = 2012;
		
		if (args.length >0) {
			monthIn = Integer.parseInt(args[0]);
		}
		if (args.length > 0) {
			days = Integer.parseInt(args[1]);
		}
		if (args.length > 1) {
			year = Integer.parseInt(args[2]);
		}
		System.out.println(countDays(monthIn,days, year));
	}

	private static char[] countDays(int month, int day, int year) {
		// TODO Auto-generated method stub
		int count = -1;
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				String[] days1 = new String[31];
				int i;
				for(i=0; i <days1.length; i++);
					days1[i]= "month";		
					System.out.println(days1[i]+"/"+i);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				String[] days2 = new String[30];
				int j;
				for(j=0; j<days2.length; j++);
					days2[j]="month";
					System.out.println(days2[j]+"/"+j);
				break;
			case 2:
				if (year % 4 ==0) {
					String[] days3 = new String[29];
					int a;
					for(a=0; a<days3.length; a++);
						days3[a]= "2";
						System.out.println(days3[a] + "/" + a);	
				} else {
					count = 28;
				}
				if ((year % 100 ==0)&(year % 400 !=0)) {
					count = 28;
		}
	}
	

}
