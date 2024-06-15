package jb.ch06;

/**与えられた基数と指数から累乗を計算するメソッドpowerを作成してください。*/

public class ch0607 {

	public static int power(int base, int exponent) {

		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base; //result = result * base;
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(power(2, 3));

	}

}
