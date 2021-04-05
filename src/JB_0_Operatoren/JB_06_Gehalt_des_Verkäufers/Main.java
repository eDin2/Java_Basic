package JB_0_Operatoren.JB_06_Gehalt_des_Verkäufers;
// Implementieren Sie ein Programm zur Berechnung des Gesamtgehalts eines Verkäufers.
// Das Gehalt besteht aus einem fixen und einem variablen Teil.
// Lesen Sie aus der Konsole das Fixgehalt und den vom Verkäufer erzielten Gesamtumsatz aus.
// Das Gesamtgehalt wird als Festgehalt plus 5% des Umsatzes berechnet.
// Geben Sie das berechnete Gesamtgehalt auf die Konsole.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fixgehalt eingeben: ");
        double fixGehalt = input.nextDouble();

        System.out.print("Umsatz eingeben: ");
        double gesamtUmsatz = input.nextDouble();
        double gesamtProvision = 0.05;


        double gesamtGehalt = (gesamtProvision * gesamtUmsatz) + fixGehalt;
        System.out.println("Gesamtgehalt: " + gesamtGehalt);

    }
}
