package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF7_Rabatt;
// Ein neu eröffnetes Kaufhaus bietet seinen Kunden Rabatt.
// Basierend auf dem Rabattstaffel lesen wir folgende Informationen:
// Wenn der Kaufbetrag höher als 500€ ist, dann 20% Rabatt,
// von 300-499,99€ 14% Rabatt, 200-299,99€ 5% Rabatt und
// von 100-199,99€ 3% Rabatt. Unter 100€ gibt es keinen Rabatt.
// Lesen Sie den Kaufbetrag aus der Konsole, berechnen Sie den Rabatt und den Gesamtpreis,
// den der Kunde zahlt. Geben Sie die Ergebnisse auf die Konsole.

import java.util.Scanner;

public class MainRabatt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kaufbetrag in summe
        System.out.print("Geben Sie Ihren Kaufbetrag ein: ");
        double kaufBetrag = input.nextDouble();

        // Rabattstaffelung
        int prozent20 = 20;
        int prozent14 = 14;
        int prozent5 = 5;
        int prozent3 = 3;

        if (kaufBetrag >= 500) {
            // Rabattrechner
            double endSumme = kaufBetrag * 20 / 100;
            System.out.println("Ihr Rabatt ist " + prozent20 + " %, Rabattsumme: " + endSumme);
            System.out.println("Neue Preis: " + (kaufBetrag - endSumme));
        } else if (kaufBetrag >= 300 && kaufBetrag <= 499.99) {
            // Rabattrechner
            double endSumme = kaufBetrag * prozent14 / 100;
            System.out.println("Ihr Rabatt ist " + prozent14 + " %, Rabattsumme: " + endSumme);
            System.out.println("Neue Preis: " + (kaufBetrag - endSumme));
        } else if (kaufBetrag >= 200 && kaufBetrag <= 299.99) {
            // Rabattrechner
            double endSumme = kaufBetrag * prozent5 / 100;
            System.out.println("Ihr Rabatt ist " + prozent5 + " %, Rabattsumme: " + endSumme);
            System.out.println("Neue Preis: " + (kaufBetrag - endSumme));
        } else if (kaufBetrag >= 100 && kaufBetrag <= 199.99) {
            // Rabattrechner
            double endSumme = kaufBetrag * prozent3 / 100;
            System.out.println("Ihr Rabatt ist " + prozent3 + " %, Rabattsumme: " + endSumme);
            System.out.println("Neue Preis: " + (kaufBetrag - endSumme));
        } else if (kaufBetrag <= 100) {
            System.out.print("Keine Rabatt da unter 100€");
            System.out.println("Neue Preis: " + kaufBetrag);
        } else {
            System.out.println("Kauf doch mal was!!");
        }

        input.close();
    }
}
