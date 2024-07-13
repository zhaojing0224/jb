package jb.basic;

public class Product {

	private String name;//商品名
	private int price;//価格

	/**
	 * 
	 * @param name
	 * @param price
	 */
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void display() {
		System.out.println("商品名: " + name + ", 価格: " + price + "円");
	}

}
