package JB_L_Loops.JB_L4_Fakultät;
// Schreiben Sie ein Programm zur Berechnung von n! Fakultät, wo n! = n * (n-1) * (n-2) *.....*1.
// Initialisieren sie die Variable n mit einer Ganzzahl aus der Konsole.

import java.util.Scanner;

public class MainFakul {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte die Fakultät n eingeben: ");
        int eingabe = input.nextInt();

        int fakulTaet = 1;
        for (int i = 1; i <= eingabe; i++) { // der Iterator darf nicht 0 sein da mit Null nicht MAL gerechnet werden kann
            fakulTaet *= i;
        }
        System.out.println("Sie Fakultät von " + eingabe + " ist geleich: " + fakulTaet);
    }
}
