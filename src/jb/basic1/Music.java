package jb.basic1;

public class Music extends Media implements Playble {

	@Override
	public void paly() {
		System.out.println("再生中: " + title);

	}

	@Override
	void dispalyInfo() {
		System.out.println("音楽「" + title + "」, 長さ: " + length + "分");

	}

}
