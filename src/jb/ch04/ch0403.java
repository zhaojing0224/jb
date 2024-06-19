package jb.ch04;

/**100以下の正整数の最小公倍数*/

public class ch0403 {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;

		int lcm = leastCommonMultiple(num1, num2);

		System.out.println(lcm);
	}

	// 最大公約数
	public static int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int rusult = b;
			b = a % b;
			a = rusult;
		}
		return a;
	}

	// 最小公倍数
	public static int leastCommonMultiple(int num1, int num2) {
		int gcd = greatestCommonDivisor(num1, num2);
		int lcm = (num1 * num2) / gcd;
		return lcm;
	}
}