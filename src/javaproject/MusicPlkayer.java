package javaproject;

public class MusicPlkayer {
	public static void main(String[] args) {
		MediaPlayer [] players = new MediaPlayer[3];
		players[0]= new Mp3Player();
		players[1]= new WAVPlayer();
		players[2]= new AACPlayer();

		for (MediaPlayer player: players) {
			player.play();
		}
	}

}


abstract class MediaPlayer{
	abstract void play();
}

class Mp3Player extends MediaPlayer{

	void play() {
		System.out.println("Mp3 Player is Playing Misic");
	}	
}

class WAVPlayer extends MediaPlayer{

	void play() {
		System.out.println("WAV Player is Playing Misic");
	}	
}

class AACPlayer extends MediaPlayer{

	void play() {
		System.out.println("AAC Player is Playing Misic");
	}	
}