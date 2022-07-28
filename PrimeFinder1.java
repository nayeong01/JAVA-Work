package com.ezdesign.task2;

public class PrimeFinder1 implements Runnable{
	
	public long target;
	public long prime;
	public boolean finished = false;
	private Thread runner;
	
	PrimeFinder1(long inTarget) throws NegativeNumberException { // 생성자 요소를 불러온 클래스에게 오류를 던진다.
		if(inTarget < 0 ) {
			NegativeNumberException nne = new NegativeNumberException("음수가 넘어왔습니다." + inTarget + "양수를 입력하세요.");
																			// 이게 상속받는 메시지
			throw nne; // 오류를 지정했으면 일단 던져
		}
		
		target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
	}
	
	public void run() {
		long numPrimes = 0;
		long candidate = 2;
		while (numPrimes < target) {
			if(isPrime(candidate)) {
				numPrimes++;
				prime = candidate;
			}
			candidate++;
		}
		finished = true;
	}
	
	boolean isPrime(long checkNumber) {
		double root = Math.sqrt(checkNumber);//sqrt: 제곱근
		for (int i=2; i<=root; i++) {
			if(checkNumber%i==0)
				return false;
		}
		return true;
	}
}
	
class NegativeNumberException extends Exception { // Exception에 없는 오류는 이렇게 클래스를 만들어서 새로 생성해야 한다.
	public NegativeNumberException() {} // 일단 빈 오류객체를 하나 만들어주고,
	public NegativeNumberException(String message) {
		super(message); // 메시지를 상속받는다.
	}
}
