package jb.basic;

/**多機能計算機*/

public class ch54 {

	public static void main(String[] args) {

		Calculation add = new Addition();
		Calculation subtract = new Subtraction();
		Calculation multiply = new Multiplication();
		Calculation divide = new Division();

		System.out.println("加算: " + add.calculate(5, 3));
		System.out.println("減算: " + subtract.calculate(5, 3));
		System.out.println("乗算: " + multiply.calculate(5, 3));
		System.out.println("除算: " + divide.calculate(6, 3));

	}

}
