package jb.basic;

/**支払いシステム*/

public class ch56 {

	public static void main(String[] args) {

		PaymentMethod creditCard = new CreditCard();
		creditCard.processPayment();

		PaymentMethod electronicMoney = new ElectronicMoney();
		electronicMoney.processPayment();

	}

}
