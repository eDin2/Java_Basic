package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF5_Kehrwert;

import java.util.Scanner;

// Lesen Sie einen ganzzahligen Wert aus der Konsole,
// weisen Sie den Wert der Variablen z zu und berechnen Sie den
// Kehrwert 1 / z. Vermeiden Sie es, 1 durch 0 zu teilen.
// Geben Sie das Ergebnis auf die Konsole.

public class MainKerwert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double z = input.nextInt();
        double kaka = 1/z;

        if (z <= 0) {
            System.out.println("Darf nicht durch Null geteilt werden (Infinity)");
        } else {
            System.out.println(kaka);
        }

        input.close();
    }
}
