package jb.ch05;

import java.util.Arrays;

/**配列の正順と逆順の出力*/

public class ch0502 {

	public static void main(String[] args) {

		int[] numbers = { 1, 32, 3, 4, 55, 6 };

		Arrays.sort(numbers);
		System.out.println("正順: " + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}

		System.out.println("逆順: " + Arrays.toString(numbers));
	}
}
