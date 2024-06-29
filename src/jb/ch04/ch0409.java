package jb.ch04;

/**階乗の計算*/

public class ch0409 {

	public static void main(String[] args) {

		int number = 5;
		long factorial = 1;

		for (int i = number; i > 0; i--) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
	}
}
