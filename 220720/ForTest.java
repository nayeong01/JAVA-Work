
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] salutation = new String[10];
		int i; // the loop index variable
		for (i = 0; i < salutation.length; i++) {
		    salutation[i] = "Mr.";
		}
		for (i = 0; i <salutation.length; i++) {
			System.out.println("i= "+ i + " "+ salutation[i]);
		}
		
	}

}
