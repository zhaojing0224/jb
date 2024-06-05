package jb.ch06;
/**2つの整数の最大公約数を計算するメソッドgcdを作成してください。このメソッドは再帰を使用せず、ループを通じて最大公約数を計算してください。*/

public class ch0601 {

	public static void main(String[] args) {
		
		int result = gcd(8,12);
		System.out.println("最大公約数：" + result);

	}

	private static int gcd(int a, int b) {
		
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		return a;
	}

}
