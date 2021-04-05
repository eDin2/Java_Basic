package JB_L_Loops.JB_L5_iPhone_Verkäufer;
// Bei Start des Programmes gibt es 200 iPhone Geräte auf dem Lager.
// Über Konsole wird eingegeben, wie viele Geräte der Kunde bestellen will.
// Das geht so lange, bis Sie alle vorhandenen Geräte verkauft haben.
// Aber, wenn der Kunde mehr Geräte bestelt, als es auf dem Lager gibt
// (z. B. 20 wird bestellt, es gibt nur 10 letzte Stück),
// wird diese Nachfrage auch befriedigt und die letzten Geräte werden verkauft.
// Wenn es auf dem Lager keine Geräte mehr gibt und der Kunde wird wieder eine Bestellung machen,
// soll die Meldung „Wir sind ausverkauft!“ ausgegeben werden.

import java.util.Scanner;

public class MainIphone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // den ersten Wert holen
        System.out.print("Enter first order (or enter 0 to quit): ");

        int orderCustomer = input.nextInt();  // "frischer" Wert / Daten ,die der Anwender eingibt
        int stock = 200;           // Summe initialisieren

        while (orderCustomer != 0) { // wenn wir 0 eingeben dann wird die schleife beendet!
            if (stock <= orderCustomer) {
                stock = 0;
                System.out.println("Wir sind ausverkauft! Lagerstand: " + stock);
                break;

            } else if (orderCustomer > 0) {
                // orderCustomer zu stock addieren
                stock -= orderCustomer;
                System.out.println("Zwischesumme: " + stock);

                // den nächsten Wert vom Anwender holen
                System.out.print("Enter next order (enter 0 to quit): ");
                orderCustomer = input.nextInt(); // "frischer" Wert zum testen            }
            } else {
                System.out.println("Etwas ist schief gelaufen!!");
            }

        }
        input.close();
    }
}
