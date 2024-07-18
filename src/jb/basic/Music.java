package jb.basic;

public class Music extends Media implements Playable {

	public Music(String title, int length) {
		super(title, length);
	}

	@Override
	public void displayInfo() {
		System.out.println("音楽: " + getTitle() + ", 長さ: " + getLength() + "分");
	}

	@Override
	public void play() {
		System.out.println("再生中: " + getTitle());
	}

}
