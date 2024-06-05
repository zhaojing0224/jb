package jb.ch06;

/**与えられた整数が素数（1とその数自身以外に正の約数を持たない数）かどうかを判定するメソッドisPrimeを作成してください。*/

public class ch0604 {

	public static boolean isPrime(int n) {
       
        if (n <= 1) {
            return false;
        }

       
        if (n == 2) {
            return true;
        }

        
        if (n % 2 == 0) {
            return false;
        }

        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
    	System.out.println(isPrime(29));
    }

}
