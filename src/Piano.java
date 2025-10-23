public class Piano implements Instrument {
    @Override
    public void play () {
        System.out.println("Pressing the piano keys to play a beautiful song!");
        SoundPlayer.playSound("sounds/piano-single-keys-close-79965.mp3");
    }
    @Override
    public void tune () {
        System.out.println("Tuning each piano string carefully for the perfect pitch.");
    }
    @Override
    public void stop () {
        System.out.println("The piano notes fade gently into silence...");
    }
}
