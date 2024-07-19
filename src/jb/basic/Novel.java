package jb.basic;

public class Novel extends Book implements Borrowable {

	public Novel(String title, String author, String isbn) {
		super(title, author, isbn);
	}

	@Override
	public void displayInfo() {
		System.out.println("小説タイトル: " + getTitle() + ", 著者: " + getAuthor() + ", ISBN: " + getIsbn());
	}

	@Override
	public void borrow() {
		System.out.println("小説を借りました。");
	}

	@Override
	public void returnBook() {
		System.out.println("小説を返却しました。");
	}

}
