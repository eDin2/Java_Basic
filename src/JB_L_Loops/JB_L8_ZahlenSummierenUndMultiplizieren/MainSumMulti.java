package JB_L_Loops.JB_L8_ZahlenSummierenUndMultiplizieren;
// Implementieren Sie ein Programm, das Zahlen in einer Endlosschleife von der Konsole einliest.
// Die Schleife wird unterbrochen, wenn der Benutzer die Zahl 0 eingibt.
// Berechnen Sie die Summe und das Produkt (Multiplikation) der eingegebenen Zahlen.
// geben Sie das Ergebnis auf die Konsole.

import java.util.Scanner;

public class MainSumMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // den ersten Wert holen
        System.out.print("Enter summ (enter 0 to quit): ");
        int summEingabe = input.nextInt();   // "frischer" Wert / Daten ,die der Anwender eingibt
        int summe = 0;                      // Summe initialisieren
        int multi = 1;

        while (true) {  // wenn wir 0 eingeben dann wird die schleife beendet!
            if (summEingabe == 0) {
                System.out.println("Abgebrochen bei Summe: " + summe);
                System.out.println("Abgebrochen bei Multi: " + multi);
                break;


            } else if (summEingabe > 0) {
                // orderCustomer zu stock addieren
                summe = summe + summEingabe;
                System.out.println("Zwischesumme SUMME: " + summe);

                multi = multi * summEingabe;
                System.out.println("Zwischesumme SUMME: " + multi);

                // den nächsten Wert vom Anwender holen
                System.out.print("Enter next Integer (enter 0 to quit): ");
                summEingabe = input.nextInt(); // "frischer" Wert zum testen


            } else {
                System.out.println("Etwas ist schief gelaufen!!");
            }


        }
        input.close();
    }
}
