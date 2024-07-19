package jb.basic;

/**バーチャル図書館管理システム*/

public class ch58 {

	public static void main(String[] args) {

		Novel novel = new Novel("ノルウェイの森", "村上春樹", "123456789");
		novel.displayInfo();
		novel.borrow();

		AcademicBook academicBook = new AcademicBook("経済学の原理", "マンキュー", "987654321");
		academicBook.displayInfo();
		academicBook.returnBook();

	}

}
