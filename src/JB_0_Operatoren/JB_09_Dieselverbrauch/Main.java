package JB_0_Operatoren.JB_09_Dieselverbrauch;

// Lesen Sie aus der Konsole die Anzahl der gefahrenen Kilometer und den Dieselverbrauch in Liter aus.
// Berechnen Sie den Kraftstoffverbrauch pro 100 km und das für die Strecke angefallene amtliche Kilometergeld (0,67 €)
// Geben Sie die Ergebnisse auf die Konsole.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gefahrene Kilometer
        System.out.print("Gefahrenen Kilometer: ");
        double gefKilometer = input.nextDouble();

        // Verbrauchte Liter
        System.out.print("Dieselverbrauch in Liter: ");
        double verbrauchLiter = input.nextDouble();

        // Verbrauch pro 100km
        double verbrauchHundertKm = verbrauchLiter * 100 / gefKilometer;
        System.out.println("Kraftstoffverbrauch pro 100 km: " + verbrauchHundertKm);

        // Kilometergeld
        double kilometerGeld = 0.67 * gefKilometer;
        System.out.println("Kilometergeld: " + kilometerGeld + "€");
    }
}
