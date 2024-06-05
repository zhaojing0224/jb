package jb.ch06;

import java.util.Arrays;

/**二つの文字列がアナグラム（文字の並びを変えることで、別の単語やフレーズを作ること）かどうかを判定するメソッドisAnagramを作成してください。*/

public class ch0605 {
	
	 public static void main(String[] args) {
	        
	        System.out.println(isAnagram("listen", "silent"));

	    }

	public static boolean isAnagram(String str1, String str2) {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

}
