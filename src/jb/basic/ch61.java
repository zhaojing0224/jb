package jb.basic;

/**文字列の住所解析*/

public class ch61 {

	public static void main(String[] args) {

		String address = "渋谷区, 明治通り, 1-2-3";

		String[] parts = address.split(", ");

		System.out.println("市区町村: " + parts[0]);
		System.out.println("通り: " + parts[1]);
		System.out.println("番地: " + parts[2]);

	}

}
