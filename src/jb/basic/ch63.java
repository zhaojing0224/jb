package jb.basic;

/**メールアドレスのドメイン抽出*/

public class ch63 {

	public static void main(String[] args) {

		String email = "tanaka@example.com";

		int atIndex = email.indexOf('@');

		if (atIndex == -1) {

			System.out.println("無効なメールアドレス");
		} else {

			String domain = email.substring(atIndex + 1);
			System.out.println("ドメイン名: " + domain);
		}

	}

}
