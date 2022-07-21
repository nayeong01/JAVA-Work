package java_220721;

public class Qst2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][][][] school = new float[3][5][30][3];
		float[][] levelSums = new float[3][3]; //학년별 평균
		float[][][] classSums = new float[3][5][3]; // 반별 평균 
		float[] subjectSums = new float[3];//과목별 전체 평균

		for (int i=0;i<school.length;i++) 
			for(int j=0;j<school[0].length;j++)  
				for(int k=0;k<school[0][0].length;k++) 
					for(int p=0; p< school[0][0][0].length; p++)
						school[i][j][k][p]=(float)(Math.random()*100); // 이렇게 쓰면 0~99까지 랜덤으로 숫자가 나온다.
						//일단 각각의 배열의 위치에다가 random으로 나온 값을 다 넣어준다.
		
		for (int i=0;i<school.length;i++)
			for(int j=0;j<school[0].length;j++) {
				for(int k=0;k<school[0][0].length;k++) {
					float sum = 0;
					sum += (school[i][j][k][0] + school[i][j][k][1] + school[i][j][k][2]);
					System.out.println("개인전체평균 = "+ sum/3);	
					
					//for(int p=0; p< school[0][0][0].length; p++) {
						System.out.println((i+1)+"학년 "+(j+1)+"반 "+(k+1)+"번 국어점수= "+ school[i][j][k][0]+
											" 영어점수= "+ school[i][j][k][1]+
											" 수학점수= "+ school[i][j][k][2]);
						System.out.format("%n");
					}
			}
		
		
		
		System.out.format("<<학년별 과목 평균>>");
		for (int i=0;i<school.length;i++) {
			for(int j=0;j<school[0].length;j++)  
				for(int k=0;k<school[0][0].length;k++) 
					for(int p=0; p< school[0][0][0].length; p++)
						levelSums[i][p] += school[i][j][k][p];
						// 변수가 배열 그 자체가 될 수도 있구나.
						//변수에 원하는 포인트의 값들을 가져오고 총합을 위해서 +=을 사용했다.
						// 그럼 = 이거만 사용하면 더하지는 않으면서 온전한 값만 각각 출력할 수 있는건가?
		}
		for (int i=0;i<levelSums.length;i++) {
			System.out.format("%n");
			System.out.println((i+1)+"학년 전체 평균 = " + (levelSums[i][0]+levelSums[i][1]+levelSums[i][2])/150/3);
			for(int j=0;j<levelSums[0].length;j++) {
				if(j == 0)
					System.out.println((i+1)+"학년 국어 평균 = " + levelSums[i][0]/150);
				else if(j == 1)
					System.out.println((i+1)+"학년 영어 평균 = " + levelSums[i][1]/150);	
				else
					System.out.println((i+1)+"학년 수학 평균 = " + levelSums[i][2]/150);
				//이 중첩 for문도 파이썬에서 중첩클래스처럼 제일 끝에 있는 배열의 값을 꺼내고 싶을 때 사용하면 되겠다.
				// 첫번째 만든 for문에서 어떻게든 해보려고 했는데, 그냥 아예 새로운 원하는 배열을 만들어서 for문으로 돌리면 된다!! 좀 더 단순하게 생각해보자
			}
		}
		
		
		
		System.out.format("%n<<반별 과목 평균>>");
		for (int i=0;i<school.length;i++) {
			for(int j=0;j<school[0].length;j++)  
				for(int k=0;k<school[0][0].length;k++) 
					for(int p=0; p< school[0][0][0].length; p++)
						classSums[i][j][p] += school[i][j][k][p];
		}				// 여기서도 필요한 부분 (학년, 반, 과목)의 배열만 선택해서 가져오고 그 합들을 더해준다.

		for (int i=0;i<classSums.length;i++) 
			for(int j=0;j<classSums[0].length;j++) {
				System.out.format("%n");
				System.out.println((i+1)+"학년 "+(j+1)+"반 전체 평균 = " + (classSums[i][j][0]+classSums[i][j][1]+classSums[i][j][2])/30/3);
				for(int k=0;k<classSums[0][0].length;k++) 
					if(k == 0)
						System.out.println((i+1)+"학년 "+(j+1)+"반 국어 평균 = " + classSums[i][j][0]/30);
					else if(k == 1)
						System.out.println((i+1)+"학년 "+(j+1)+"반 수학 평균 = " + classSums[i][j][1]/30);	
					else
						System.out.println((i+1)+"학년 "+(j+1)+"반 영어 평균 = "+ classSums[i][j][2]/30);		
		}
		
		
		
		System.out.format("%n<<과목별 평균>>%n");
		for (int i=0;i<school.length;i++) 
			for(int j=0;j<school[0].length;j++)  
				for(int k=0;k<school[0][0].length;k++) 
					for(int p=0; p< school[0][0][0].length; p++)
						subjectSums[p] += school[i][j][k][p];
		
			System.out.println("국어 전체 평균: " + subjectSums[0]/450);
			System.out.println("영어 전체 평균: " + subjectSums[1]/450);
			System.out.println("수학 전체 평균: " + subjectSums[2]/450);
		}
	}
