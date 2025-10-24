public class Piano implements Instrument {
    @Override
    public void play () {
        System.out.println("\uD83C\uDFB9 Pressing the piano keys to play a beautiful song!");
        SoundPlayer.playSound("sounds/721756__alexarje__acoustic-piano-soundaction-074.wav");
    }
    @Override
    public void tune () {
        System.out.println("\uD83C\uDFB6 Tuning each piano string carefully for the perfect pitch.");
    }
    @Override
    public void stop () {
        System.out.println("\uD83D\uDD07 The piano notes fade gently into silence...");
    }
}
