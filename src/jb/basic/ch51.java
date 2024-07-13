package jb.basic;

/**商品管理システム*/

public class ch51 {

	public static void main(String[] args) {

		Electronics iphone = new Electronics("iPhone", 80000, "Apple");

		Food chocolate = new Food("チョコレート", 200, "2023年12月");

		iphone.display();
		chocolate.display();
	}

}
