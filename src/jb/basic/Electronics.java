package jb.basic;

public class Electronics extends Product {

	private String manufacturer;//製造元

	/**
	 * 
	 * @param name
	 * @param price
	 * @param manufacturer
	 */
	public Electronics(String name, int price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("製造元: " + manufacturer);
	}
}
