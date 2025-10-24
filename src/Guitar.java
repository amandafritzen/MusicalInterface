public class Guitar implements Instrument{
    @Override
    public void play () {
        System.out.println("\uD83C\uDFB8 Strumming the guitar strings to play a melody!");
        SoundPlayer.playSound("sounds/315706__spitefuloctopus__acousticguitar-c-chord.wav");
    }
    @Override
    public void tune () {
        System.out.println("\uD83C\uDFB5 Tuning the guitar strings to standard E tuning.");
    }
    @Override
    public void stop () {
        System.out.println("\uD83D\uDD07 The guitar music fades as the strings stop playing.");
    }

}
