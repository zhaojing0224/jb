package jb.basic;

/**イベント招待状の生成*/

public class ch64 {

	public static void main(String[] args) {
		
		// 参加者の名前とイベントの日付
		String name = "山田太郎";
		String date = "2023年4月1日";

		// 招待状のテキストをフォーマット
		String invitation = String.format("%s様、%sのイベントにご招待します。", name, date);
		System.out.println(invitation);
	}

}
