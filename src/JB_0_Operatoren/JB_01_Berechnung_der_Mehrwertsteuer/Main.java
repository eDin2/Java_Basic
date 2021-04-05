package JB_0_Operatoren.JB_01_Berechnung_der_Mehrwertsteuer;

// Lesen Sie aus der Konsole den Gesamtpreis und den Mehrwertsteuersatz einer Ware aus.
// Berechnen Sie den Preis ohne Mehrwertsteuer,
// die Mehrwertsteuer selbst und geben Sie beide berechneten Werte auf die Konsole.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double warenWertBrutto, mwSt, warenWertNetto, mwStBetrag;


        // Eingabe Brutto 1: -----------------------------------------------------------
        System.out.print("Bitte Warenwert(Brutto) mit MwSt. eingeben: ");
        warenWertBrutto = input.nextDouble();


        // Eingabe Mehrwertsteuersatz -------------------------------------------------
        System.out.print("Bitte Mehrwertsteuersatz eingeben: ");
        mwSt = input.nextDouble();


        // Warenwert (Netto) ohne MwSt. ------------------------------------------------
        warenWertNetto = warenWertBrutto / (mwSt + 100) * 100;


        // Mehrwertsteuerbetrag Formel: ------------------------------------------------
        // A = G * p / 100
        // A - Mehrwertsteuer, G - Grundwert(ohne Steuer), p - Mehrwertsteuersatz
        mwStBetrag = warenWertNetto * mwSt / 100;



        // Ausgabe in der Console! ----------------------------------------------------
        System.out.printf("Warenwert(Netto) ohne MwSt.: %.2f%n", warenWertNetto);
        System.out.println("Warenwert(Brutto) mit MwSt: " + warenWertBrutto + " €");
        System.out.println("Mehrwertsteuersatz: " + mwSt + "%");
        System.out.printf("Mehrwertsteuerbetrag: %.2f", mwStBetrag);

        input.close();
    }
}
