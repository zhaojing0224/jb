package jb.basic;

public class AcademicBook extends Book implements Borrowable {

	public AcademicBook(String title, String author, String isbn) {
		super(title, author, isbn);
	}

	@Override
	public void displayInfo() {
		System.out.println("学術書タイトル: " + getTitle() + ", 著者: " + getAuthor() + ", ISBN: " + getIsbn());
	}

	@Override
	public void borrow() {
		System.out.println("学術書を借りました。");
	}

	@Override
	public void returnBook() {
		System.out.println("学術書を返却しました。");
	}

}
