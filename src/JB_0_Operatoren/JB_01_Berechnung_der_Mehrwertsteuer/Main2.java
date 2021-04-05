package JB_0_Operatoren.JB_01_Berechnung_der_Mehrwertsteuer;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loesung 2: -----------------------------------------------------------
        System.out.print("Bitte Warenwert(Netto) eingeben: ");
        double warenWertNetto = input.nextDouble();

        // System.out.print("Bitte Gesamtpreis eingeben: ");

        System.out.print("Bitte Mehrwertsteuersatz eingeben: ");
        double mwSt = input.nextDouble();
        //------------------------------------------------------------

        // Mehrwertsteuerbetrag Formel:
        // A = G * p / 100
        // A - Mehrwertsteuer, G - Grundwert(ohne Steuer), p - Mehrwertsteuersatz
        double mwStBetrag = warenWertNetto * mwSt / 100;

        double gesamtPreisBrutto = warenWertNetto + mwStBetrag;

        System.out.println("Warenwert ohne MwSt: " + warenWertNetto + " €");
        System.out.println("Mehrwertsteuersatz: " + mwSt + "%");
        System.out.println("Mehrwertsteuerbetrag: " + mwStBetrag + " €");
        System.out.println("Gesamtpreis (mit MwSt): " + gesamtPreisBrutto + " €");
        input.close();
    }
}
