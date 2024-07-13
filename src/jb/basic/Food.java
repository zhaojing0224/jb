package jb.basic;

public class Food extends Product {

	private String expirationDate;

	/**
	 * 
	 * @param name
	 * @param price
	 * @param expirationDate
	 */
	public Food(String name, int price, String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("賞味期限: " + expirationDate);
	}

}
