package jb.basic;

public class BankAccountInfo {

	private static int numberOfAccounts = 0;
	private final static int BankCode = 101;

	private String accountNumber;
	private int balance;

	/**
	 * コンストラクタ
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccountInfo(String accountNumber, int balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;
		numberOfAccounts++;

	}

	/**
	 * 口座の詳細を表示するstaticメソッド
	 */
	public void displayAccountDetails() {
		System.out.println("銀行コード: " + BankCode);
		System.out.println("口座番号: " + accountNumber + ", 残高: " + balance + "円");
	}

	public static void displayTotalAccounts() {
		System.out.println("全口座数: " + numberOfAccounts);
	}

}
