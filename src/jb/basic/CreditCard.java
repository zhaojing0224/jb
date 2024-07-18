package jb.basic;

public class CreditCard extends PaymentMethod implements OnlineAuthenticatable {

	public CreditCard() {
		super("クレジットカード");
	}

	/**
	 * 
	 */
	@Override
	public void processPayment() {
		System.out.println("支払い方法: " + getName());
		authenticate();
	}

	/**
	 * 
	 */
	@Override
	public void authenticate() {
		System.out.println("オンライン認証成功");
	}

}
