package javaproject;

public class SampleBankAccount {
	
	public static void main(String[] args) {
		Bank bankObj = new Bank(0, "Sakhi Ac");
		bankObj.deposit(50000);
		//bankObj.widhraw(10000);
		System.out.println(bankObj.getBalance());
		
		bankObj.widhraw(25000);
		System.out.println(bankObj.getBalance());


	}

}

class Bank {

	private double balance;
	private String accountNumber;

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Bank(double balance, String accountNumber) {
		// super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void widhraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("you cannot widhraw! insufficient balance");
		}

	}
}
