package jb.ch04;

/**偶数の合計*/

public class ch0406 {

	public static void main(String[] args) {
		int[] numbers = { 4, 7, 2, -1 };
		int sum = 0;

		for (int number : numbers) {
			if (number < 0) {
				break;
			}
			if (number % 2 == 0) {
				sum += number;
			}
		}

		System.out.println(sum);
	}

}
