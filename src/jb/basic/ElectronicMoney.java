package jb.basic;

public class ElectronicMoney extends PaymentMethod implements OnlineAuthenticatable {

	public ElectronicMoney() {
		super("電子マネー");
	}

	@Override
	public void processPayment() {
		System.out.println("支払い方法: " + getName());
		authenticate();
	}

	@Override
	public void authenticate() {
		System.out.println("オンライン認証成功");
	}

}
