package JB_L_Loops.JB_L5_iPhone_Verkäufer;

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // den ersten Wert holen
        System.out.print("Enter first order (or enter 0 to quit): ");

        int orderCustomer = input.nextInt();    // "frischer" Wert / Daten ,die der Anwender eingibt
        int stock = 200;                        // Summe initialisieren

        for (int i = 0; i < orderCustomer; i--) {
            if (stock <= orderCustomer) {
                stock = 0;
                System.out.println("Wir sind ausverkauft! Lagerstand: " + stock);
                break;

            } else if (orderCustomer > 0) {
                // orderCustomer zu stock addieren
                stock = stock - orderCustomer;
                System.out.println("Zwischesumme: " + stock);

                // den nächsten Wert vom Anwender holen
                System.out.print("Enter next order (enter 0 to quit): ");
                orderCustomer = input.nextInt(); // "frischer" Wert

            } else if (orderCustomer == 0) {  // wenn wir 0 eingeben dann wird die schleife beendet!
                System.out.println("Schleife wurde verlassen, letzter Lagerstand: " + stock);
                break;

            } else {
                System.out.println("Etwas ist schief gelaufen!!");
            }
        }

        input.close();
    }
}
