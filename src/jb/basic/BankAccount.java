package jb.basic;

public class BankAccount {

	private String accountNumber; // 口座番号
	private String accountHolder; // 口座名義人
	private int balance; // 口座残高

	/**
	 * 
	 * @param accountNumber
	 * @param accountHolder
	 * @param balance
	 */
	public BankAccount(String accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * 
	 * @param amount 
	 */
	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	/**
	 * 
	 * @param amount
	 */
	public void withdraw(int amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("残高不足です。");
		}
	}

}
