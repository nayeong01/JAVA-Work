
public class String_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String s, s2;
		s = "potrzebie";
		s2 = s.valueOf(550);
		s2 = String.valueOf(550);
		
		System.out.println("s2 : " + s2);
		System.out.printf("s2 : %s" , s2);
		
		float x = 5.0F;
		float y = 2.0F;
		int result = (int)(x/y);
		// x/y를 괄호로 안 묶으면 x만 int로 변경된다. 그래서 괄호를 꼭 쳐줘야 돼.
		System.out.println("result: " + result);
		*/
		
		@SuppressWarnings("removal")
		Integer dataCount = new Integer(7801);
		int newCount = dataCount.intValue();
		System.out.println("result: "+newCount);
		
		String pennsylvania = "65000";
		int penn = Integer.parseInt(pennsylvania);
		System.out.println("result: "+penn);
		
		
	} 
}
