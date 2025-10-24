/*
*Author: Amanda Fritzen
* Date: 10/23/2025
* Purpose: Implementing and Presenting an Interface in Java
 */


//Allows the program to run and shows polymorphism with
//the Instrument interface
public class InstrumentDriver {
    public static void main(String[] args) {

        //Uses the interface to hold differenent instrument types
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();

        System.out.println("------------------------------------------\n");
        System.out.println("Welcome to the Virtual Instrument Show!");
        System.out.println("------------------------------------------\n");

        //Uses the interface to call my methods

        //Guitar actions
        System.out.println("\uD83C\uDFB8 Guitar Actions: ");
        myGuitar.tune();
        myGuitar.play();
        myGuitar.stop();

        System.out.println("\n------------------------------------------\n");

        //Piano
        System.out.println("\uD83C\uDFB9 Piano Actions:");
        myPiano.tune();
        myPiano.play();
        myPiano.stop();

        System.out.println("------------------------------------------\n");
        System.out.println("\n🎶 All instruments have finished performing!");
        System.out.println("\n------------------------------------------\n");
    }
}
