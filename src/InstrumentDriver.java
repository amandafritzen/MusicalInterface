public class InstrumentDriver {
    public static void main(String[] args) {
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();

        //Uses the interface to call my methods

        //Guitar
        System.out.println("Guitar Actions: ");
        myGuitar.tune();
        myGuitar.play();
        myGuitar.stop();

        //Piano
        System.out.println("Piano Actions:");
        myPiano.tune();
        myPiano.play();
        myPiano.stop();
    }
}
