package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF3_Größere_Nummer;

import java.util.Scanner;

// Schreiben Sie ein Programm, um 3 Zahlen vom Benutzer zu erhalten und drucken Sie die größte Zahl aus.

public class MainGroeser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Eingabe der Zahlen
        System.out.print("Zahl 1 bitte eingeben: ");
        int zahl1 = Integer.parseInt(sc.nextLine());

        System.out.print("Zahl 2 bitte eingeben: ");
        int zahl2 = Integer.parseInt(sc.nextLine());

        System.out.print("Zahl 3 bitte eingeben: ");
        int zahl3 = Integer.parseInt(sc.nextLine());


        // Operation
        if (zahl1 > zahl2 && zahl1 > zahl3) {
            System.out.println(zahl1);
        }
        if (zahl2 > zahl1 && zahl2 > zahl3) {
            System.out.println(zahl2);
        }
        if (zahl3 > zahl2 && zahl3 > zahl2) {
            System.out.println(zahl3);
        }

        sc.close();
    }
}
