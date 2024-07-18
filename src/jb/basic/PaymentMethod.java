package jb.basic;

public abstract class PaymentMethod {

	private String name;

	public PaymentMethod(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void processPayment();

}
