package jb.ch06;

/**与えられた年が閏年（リープイヤー）かどうかを判定するメソッドisLeapYearを作成してください。*/

public class ch0608 {

	public static void main(String[] args) {
		
		System.out.println(isLeapYear(2020));

	}
	
	public static boolean isLeapYear(int year) {
		
		return (year % 4 ==0 && (year % 100 != 0 || year % 400 == 0));
		
	}

}
