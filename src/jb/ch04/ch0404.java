package jb.ch04;

/**10000以下の正整数の平均値*/

public class ch0404 {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, -1 };

		int sum = 0;
		int count = 0;

		for (int number : numbers) {
			if (number < 0) {
				break;
			}
			sum += number;
			count++;
		}

		double average = count > 0 ? (double) sum / count : 0;
		System.out.printf("%.2f\n", average);
	}

}
