package abstractclass.instruments;

public class Main {
    public static void main(String[] args) {
        Instrument drum = new Drum();
        drum.play("dfghfghfg");

        Instrument piano = new Piano();
        piano.play("dfggggghfghfg");
    }
}