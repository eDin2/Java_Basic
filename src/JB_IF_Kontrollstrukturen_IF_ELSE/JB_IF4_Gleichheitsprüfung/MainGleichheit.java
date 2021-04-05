package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF4_Gleichheitsprüfung;

// Schreiben Sie ein Java-Programm, das drei Ganzzahlen aus der Konsole einließt und
// "Alle Zahlen sind gleich" auf die Konsole ausgibt, wenn alle drei Zahlen gleich sind,
// "Alle Zahlen sind unterschiedlich", wenn alle drei Zahlen unterschiedlich sind,
// und "Weder sind alle gleich oder unterschiedlich", wenn dies nicht der Fall ist.

import java.util.Scanner;

public class MainGleichheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Eingabe der Zahlen
        System.out.print("Zahl 1 bitte eingeben: ");
        int zahl1 = input.nextInt();

        System.out.print("Zahl 2 bitte eingeben: ");
        int zahl2 = input.nextInt();

        System.out.print("Zahl 3 bitte eingeben: ");
        int zahl3 = input.nextInt();

        if (zahl1 == zahl2 && zahl2 == zahl3 && zahl3 == zahl1) {
            System.out.println("Alle Zahlen sind gleich");
        } else if (zahl1 != zahl2 && zahl2 != zahl3 && zahl3 != zahl1) {
            System.out.println("Alle Zahlen sind unterschiedlich");
        } else {
            System.out.println("Weder sind alle gleich oder unterschiedlich");
        }

        input.close();
    }
}
