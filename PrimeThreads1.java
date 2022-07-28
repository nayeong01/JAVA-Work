package com.ezdesign.task2;

	public class PrimeThreads1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PrimeThreads1 pt = new PrimeThreads1(args);
		}
		
		public PrimeThreads1(String[] args) {
			PrimeFinder1[] finder = new PrimeFinder1[args.length]; // 입력한 수만큼의 쓰레드의 배열이 생성. 
			for(int i =0; i<args.length;i++) {
				try {
					long count = Long.parseLong(args[i]);
					finder[i] = new PrimeFinder1(count); // 각각의 배열 타입을 long으로 바꿔주고,
														// 그 값을 PrimeFinder 클래스로 넘겨준다.
					System.out.println("Looking for prime "+ count);
				}catch (NumberFormatException nfe) { // 이건 원래 있는 오류라서 따로 지정을 안해줘도 되는건가?
					System.out.println("Error: "+ nfe.getMessage());
				}catch (NegativeNumberException ne) {
					System.out.println("Error: " + ne.getMessage()); // 상속받은 메시지 입력하기
				}
			}
			
			boolean complete = false;
			while(!complete) {
				complete = true;
				for(int j =0;j<finder.length;j++) {
					if(finder[j]==null) continue;
					if(!finder[j].finished) {
						complete = false;
					} else {
						displayResult(finder[j]);
						finder[j]=null;
					}
				}
				try {
					Thread.sleep(1000); //쓰레드 진행의 간격을 위한 것
				}catch (InterruptedException ie) {
					
				}
			}
		}
		
		private void displayResult(PrimeFinder1 finder) {
			System.out.println("Prime "+finder.target+ " is "+finder.prime);
		}
	}
