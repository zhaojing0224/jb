package jb.ch06;

/**フィボナッチ数列の第n項を返すメソッドfibonacciを作成してください。フィボナッチ数列は、0と1で始まり、以降の各項は前の2項の和となります（例：0, 1, 1, 2, 3, 5, ...）。このメソッドは再帰を使用しないでください。*/

public class ch0603 {
	
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
        	int result = a + b;
            a = b;
            b = result;
        }

        return b ;
    }

	public static void main(String[] args) {
		
	        int result = fibonacci(6);
	        System.out.println("フィボナッチ数列の第6項: " + result);
	    }

}
