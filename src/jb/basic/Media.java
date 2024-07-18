package jb.basic;

public abstract class Media {

	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public Media(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public abstract void displayInfo();

}
