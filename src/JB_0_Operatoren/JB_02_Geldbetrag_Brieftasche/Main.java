package JB_0_Operatoren.JB_02_Geldbetrag_Brieftasche;

//Lesen Sie aus der Konsole die Anzahl der 1 € - und 2 € Münzen sowie 5 € Scheine in Ihrer Brieftasche aus.
// Berechnen Sie den Gesamtwert Ihrer Brieftasche und geben Sie das Ergebnis auf die Konsole.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int einEuro, zweiEuro, fuenfEuro, summe;

        // 1€  -------------------------------------------------------
        System.out.print("Anzahl 1€ ??: ");
        einEuro = input.nextInt();

        // 2€  -------------------------------------------------------
        System.out.print("Anzahl 2€ ??: ");
        zweiEuro = 2 * input.nextInt();

        // 5€  -------------------------------------------------------
        System.out.print("Anzahl 5€ ??: ");
        fuenfEuro = 5 * input.nextInt();

        // Summe  -------------------------------------------------------
        summe = einEuro + zweiEuro + fuenfEuro;
        System.out.println("In der Brieftasche hast du " + summe + " €");

    }
}
