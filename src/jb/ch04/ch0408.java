package jb.ch04;

/**整数の桁数の計算*/

public class ch0408 {

	public static void main(String[] args) {

		int[] numbers = { 12345 };

		for (int number : numbers) {
			if (number <= 0) {
				System.out.println(number);
			} else {
				int digits = 0;
				for (; number > 0; number /= 10) {
					digits++;
				}
				System.out.println(digits);
			}
		}
	}
}
