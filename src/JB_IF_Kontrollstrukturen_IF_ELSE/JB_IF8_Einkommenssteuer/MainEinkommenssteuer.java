package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF8_Einkommenssteuer;
// Implementieren Sie ein Programm zur Berechnung der Einkommensteuer.
// Aus der Konsole wird das Jahreseinkommen ausgelesen.
// Verwenden Sie für die Berechnung die folgende Tabelle.

//  bis 11000 - Keine Steuer
//  11001 bis 18000 - (Einkommen - 11.000) * 1.400 / 7.000
//  18001 bis 31000 - (Einkommen - 18.000) * 4.550 / 13.000 + 1.400
//  31001 bis 60000 - (Einkommen - 31.000) * 12.180 / 29.000 + 5.950
//  60001 bis 90000 - (Einkommen - 60.000) * 14.400 / 30.000 + 18.130
//  90001 bis 999999 - (Einkommen - 90.000) * 455.000 / 910.000 + 32.530
//  über 1000000 - (Einkommen - 999.999) * 0,55 + 487.530

import java.util.Scanner;

public class MainEinkommenssteuer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Einkommen input
        System.out.print("Geben Sie Ihr Einkommen ein: ");
        double einKommen = input.nextDouble();


        if (einKommen >= 1000000) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 999999) * 0.55 + 487530;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);

        } else if (einKommen >= 90001 && einKommen <= 999999) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 90000) * 455.000 / 910.000 + 32.530;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);

        } else if (einKommen >= 60001 && einKommen <= 90000) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 60000) * 14.400 / 30.000 + 18.130;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);

        } else if (einKommen >= 31001 && einKommen <= 60000) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 31000) * 12.180 / 29.000 + 5.950;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);

        } else if (einKommen >= 18001 && einKommen <= 31000) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 18000) * 4.550 / 13.000 + 1.400;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);

        } else if (einKommen >= 11001 && einKommen <= 18000) {
            // Rabattrechner
            double einKommSteuer = (einKommen - 11000) * 1.400 / 7.000;
            System.out.println("Einkommenssteuer auf " + einKommen + ", beträgt: " + einKommSteuer);
        } else {
            System.out.println("Nö... nix Geld Oida, nix Steuer!!");
        }

        input.close();
    }
}
