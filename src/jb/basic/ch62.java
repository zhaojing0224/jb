package jb.basic;

/**ショッピングリストの編集*/

public class ch62 {

	public static void main(String[] args) {

		String[] items = { "りんご", "バナナ", "トマト" };

		String combinedList = String.join(",", items);
		System.out.println("結合されたリスト: " + combinedList);

		String replacedList = combinedList.replace("バナナ", "いちご");
		System.out.println("置換後のリスト: " + replacedList);

	}

}
