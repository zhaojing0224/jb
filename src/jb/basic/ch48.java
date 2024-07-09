package jb.basic;

/**銀行口座管理システムを設計しよう*/

public class ch48 {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount("12345678", "山田太郎", 10000);
		
		// 預金と引き出し
		myAccount.deposit(5000);
		myAccount.withdraw(4000);
		
		System.out.println("口座残高: " + myAccount.getBalance() + "円");

	}

}
