
public class Grade {

	public static void main(String[] args) {
		
		char operation = '+';
		int object1 = 2;
		int object2 = 10;
		
		switch(operation) {
			case '+':
				System.out.println(object1 += object2);
				break;
			case '-':
				System.out.println(object1 -= object2);
				break;
			case '*':
				System.out.println(object1 *= object2);
				break;
			case '/':
				System.out.println(object1 /= object2);
				break;
		}
	}
}

	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'D';
		
		if (grade == 'A'){
			System.out.println("Great job!");
		} else if (grade == 'B') {
			System.out.println("Good job!");
		} else if (grade == 'C') {
			System.out.println("You can do better!");
		} else {
			System.out.println("Ouch!");
		}
	}
}

*/