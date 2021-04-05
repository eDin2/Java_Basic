package JB_L_Loops.JB_L06_QuerSumme_BONUS;
// Schreiben Sie ein Programm, das die Quersumme einer von der Konsole eingegebenen Zahl berechnet.
// Die Quersumme bildet man durch die Addition jeder Ziffer der Zahl.
// Wenn der Benutzer die Nummer 56987 angibt, wird die Quersumme wie folgt berechnet: 5 + 6 + 9 + 8 + 7 = 35

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe der zu Adierenden Zahlen
        System.out.print("Zahl eingeben: ");
        int Zahl = input.nextInt();

        int Quersumme = 0;

        for (; Zahl > 0; ) { // solange Zahl > 0,
            Quersumme += Zahl % 10; // mach modulo an Zahl für Restwert
            Zahl /= 10; // durch das dividieren durch 10 wird es eine ganye Zahl
        }
        System.out.println("Die Quersumme von ergibt: " + Quersumme);


        input.close();
    }
}
