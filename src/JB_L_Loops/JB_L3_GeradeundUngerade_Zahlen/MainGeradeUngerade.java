package JB_L_Loops.JB_L3_GeradeundUngerade_Zahlen;
// Schreiben Sie ein Programm, das die Summe für gerade und ungerade Zahlen getrennt berechnet.
// Erstellen Sie Implementierungen:
// 1. Iterieren Sie von 0 – 10 und berechnen Sie die Summen basierend auf diesen Zahlen
// 2. Iterieren Sie von 0 - 10 und fordern Sie den Benutzer immer auf,
// eine Nummer für die Berechnung über die Konsole einzugeben.

import java.util.Scanner;

public class MainGeradeUngerade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl der Loops eingeben: ");
        int num = input.nextInt();

        int gerade = 0;
        int ungerade = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) { // Zahl durch 2 teilbar sollte Null rest haben (Gerade Zahl)
                gerade += i;
            } else {
                ungerade += i;
            }
        }
        System.out.println("Summe Gerader Zahlen: " + gerade);
        System.out.println("Summe Ungerader Zahlen: " + ungerade);
    }
}
