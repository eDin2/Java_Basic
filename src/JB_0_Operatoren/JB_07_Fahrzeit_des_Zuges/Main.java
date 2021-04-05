package JB_0_Operatoren.JB_07_Fahrzeit_des_Zuges;

// Lesen Sie aus der Konsole die Abfahrts- und Ankunftszeit eines Zuges ab.
// Berechnen Sie die gesamte Fahrzeit und geben Sie das Ergebnis auf die Konsole.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Startzeit eingeben Std : Min : Sek");
        int stundenS = input.nextInt() / 3600;
        int minutenS = (input.nextInt() % 3600) / 60;
        int sekundenS = (input.nextInt() % 3600) % 60;


        System.out.println("Ankunftszeit eingeben Std : Min : Sek");
        int stundenE = input.nextInt() / 3600;
        int minutenE = (input.nextInt() % 3600) / 60;
        int sekundenE = (input.nextInt() % 3600) % 60;



    }
}
