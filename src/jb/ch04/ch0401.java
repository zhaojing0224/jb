package jb.ch04;

/**数列の和の計算*/

public class ch0401 {

	public static void main(String[] args) {
		
		long sum = 0;
		long number = 9;
		
		for (int i = 1; i <= 10; i++) {
			sum += number;
			number = number * 10 + 9;
		}
		
		System.out.println(sum);

	}

}
