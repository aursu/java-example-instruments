package abstractclass.instruments;

public class Piano extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.println("p: " + note);
    }
}
