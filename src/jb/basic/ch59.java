package jb.basic;

/**銀行口座管理システム*/

public class ch59 {

	public static void main(String[] args) {

		BankAccountInfo account = new BankAccountInfo("123456789", 10000);

		account.displayAccountDetails();
		BankAccountInfo.displayTotalAccounts();
	}

}
