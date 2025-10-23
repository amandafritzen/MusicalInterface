public class Guitar implements Instrument{
    @Override
    public void play () {
        System.out.println("Strumming the guitar strings to play a melody!");
        SoundPlayer.playSound("sounds/em-guitar-chord-strum-1-309534.mp3");
    }
    @Override
    public void tune () {
        System.out.println("Tuning the guitar strings to standard E tuning.");
    }
    @Override
    public void stop () {
        System.out.println("The guitar music fades as the strings stop playing.");
    }

}
