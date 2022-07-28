package com.ezdesign.task2;

public abstract class Transaction {
	
	protected int accountNumber; // 계좌번호
	protected int balance;		 // 잔액
	
	public Transaction(){}
	
	protected int getAccountNumber() {
		return accountNumber;
	}
	
	protected int getBalance() {
		return balance;
	}
	
	protected abstract void execute();
}

class BalanceInquiry extends Transaction { // 잔액조회
	
	int balance;
	
	public BalanceInquiry() {
		super();
	}
	
	@Override
	protected void execute() {
		System.out.println("잔액은 $"+ balance +"입니다.");
		this.balance= super.getBalance();
	}
	
	public int getCurrentBalance() {
		return this.balance;
	}
}

class Withdrawal extends Transaction{ // 인출
	
	protected int amount;
	
	public Withdrawal() {
		super();
		this.amount = amount;
	}

	@Override
	protected void execute() {
		if (balance >= this.amount) {
			System.out.println("현재 잔액 $"+ balance +"에서 $"+amount+"를 인출합니다.");
			balance -= this.amount;
			System.out.println("현재 잔액은 $"+balance+"입니다.");
		} else 
			System.out.println("잔액이 부족합니다. 인출할 금액을 다시 입력하세요.");
	}
}

class Deposit extends Transaction{ // 예금
	
	protected int amount;
	
	public Deposit() {
		super();
		this.amount = amount;
	}

	@Override
	protected void execute() {
		super.getBalance();
		System.out.println("현재 잔액 $"+ balance +"에서 $"+amount+ "를 예금합니다.");
		balance += this.amount;
		System.out.println("현재 잔액은 $"+balance+"입니다.");
		}

	}