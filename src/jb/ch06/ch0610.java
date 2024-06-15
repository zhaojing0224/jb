package jb.ch06;

/**与えられた文字列の中で特定の文字が何回出現するかを数えるメソッドcountCharacterを作成してください。*/

public class ch0610 {

	public static void main(String[] args) {
		String str ="hello world";
		char ch = 'l';
		
		int count = countCharacter(str, ch);
		System.out.println(count);

	}

	public static int countCharacter(String str, char ch) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
