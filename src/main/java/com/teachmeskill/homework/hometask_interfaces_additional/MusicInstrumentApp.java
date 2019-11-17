package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class MusicInstrumentApp {

    static MusicInstrument[] musicInstrument = {
            new GuitarImpl(6),
            new GuitarImpl(4),
            new DrumImpl(14, 5.5),
            new DrumImpl(22, 18),
            new TrumpetImpl(3)
    };

    static void playInstrument(MusicInstrument[] musicInstrument) {
        for (int i = 0; i < musicInstrument.length; i++) {
            if (musicInstrument[i] instanceof GuitarImpl) {
                musicInstrument[i].play();
            } else if (musicInstrument[i] instanceof DrumImpl) {
                musicInstrument[i].play();
            } else if (musicInstrument[i] instanceof TrumpetImpl) {
                musicInstrument[i].play();
            }
        }
    }

    public static void main(String[] args) {
        MusicInstrumentApp.playInstrument(musicInstrument);
    }
}
