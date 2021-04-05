package JB_0_Operatoren.JB_05_Kreis;

// Der Radius (r) des Kreises wird über die Konsole eingegeben.
// Verwenden Sie für die Berechnung die folgende Formel:
// U = 2 * r * pi
// F = r * r * pi
// Initialisieren sie die Variable pi mit dem Wert Math.PI (double pi = Math.PI).
// PI ist eine Konstante der Klasse Math und wir brauchen den Wert für die Berechnung.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double U, F;
        double pi = Math.PI;

        System.out.print("Bitte Radius in mm eingeben: ");
        int r = input.nextInt();

        U = 2 * r * pi;
        System.out.printf("Umfang in mm: %7.2f%n", U);

        F = r * r * pi;
        System.out.printf("Flaeche in mm: %7.2f%n", F);
    }
}
