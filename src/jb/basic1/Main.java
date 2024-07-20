package jb.basic1;

public class Main {
	public static void main(String[] arg) {

		Music music = new Music();
		music.title = "Beethoven - Symphony No.9";
		music.length = 70;

		Video video = new Video();
		video.title = "Spirited Away";
		video.length = 125;

		music.dispalyInfo();
		music.paly();

		video.dispalyInfo();
		video.paly();

	}

}
