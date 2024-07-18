package jb.basic;

public class Video extends Media implements Playable {

	public Video(String title, int length) {
		super(title, length);
	}

	@Override
	public void displayInfo() {
		System.out.println("ビデオ: " + getTitle() + ", 長さ: " + getLength() + "分");
	}

	@Override
	public void play() {
		System.out.println("再生中: " + getTitle());
	}

}
