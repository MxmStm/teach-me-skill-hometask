package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class MusicInstrumentApp {

    static MusicInstrument[] musicInstrument = {
            new Guitar(6),
            new Guitar(4),
            new Drum(14, 5.5),
            new Drum(22, 18),
            new Trumpet(3)
    };

    static void playInstrument(MusicInstrument[] musicInstrument) {
        for (int i = 0; i < musicInstrument.length; i++) {
            if (musicInstrument[i] instanceof Guitar) {
                musicInstrument[i].play();
            } else if (musicInstrument[i] instanceof Drum) {
                musicInstrument[i].play();
            } else if (musicInstrument[i] instanceof Trumpet) {
                musicInstrument[i].play();
            }
        }
    }

    public static void main(String[] args) {
        MusicInstrumentApp.playInstrument(musicInstrument);
    }
}
