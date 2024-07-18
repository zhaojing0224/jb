package jb.basic;

/**メディアプレーヤーの拡張*/

public class ch55 {

	public static void main(String[] args) {

		Music music = new Music("Beethoven - Symphony No.9", 70);
		music.displayInfo();
		music.play();

		Video video = new Video("Spirited Away", 125);
		video.displayInfo();
		video.play();

	}

}
