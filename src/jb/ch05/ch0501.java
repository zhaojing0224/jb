package jb.ch05;

/**配列の最大値と最小値*/

public class ch0501 {

	public static void main(String[] args) {

		int[] numbers = { 5, 7, 33, 7, 1, 9 };

		int max = numbers[0];
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		if (max == min) {
			System.out.println(max);
		} else {
			System.out.println(" 最大値： " + max + " 最小値： " + min);
		}
	}

}
