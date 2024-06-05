package jb.ch06;

/**整数をローマ数字に変換するメソッドconvertToRomanを作成してください。*/

public class ch0606 {

	public static void main(String[] args) {
		
        System.out.println(convertToRoman(1994));

	}
	
	public static String convertToRoman(int num) {
       
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

}
