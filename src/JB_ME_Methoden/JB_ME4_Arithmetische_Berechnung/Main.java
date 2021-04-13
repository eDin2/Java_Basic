package JB_ME_Methoden.JB_ME4_Arithmetische_Berechnung;

import java.util.Scanner;

// Implementieren Sie ein Programm in dem Sie für jede arithmetische Operation (+, -, *, /, % - Modulo)
// eine eigene Methode deklarieren:
// • float add(int x, int y)
// • float subtract(int x, int y)
// • float multiply(int x, int y)
// • float divide(int x, int y)
// • float rest(int x, int y)
// An die Methode werden 2 Ganzzahlige Zahlen übergeben,
// der Rückgabewert jeder Methode wird eine Fließkommazahl sein.
// Die Argumente für die Methode werden aus der Konsole ausgelesen.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe
        //-------------------------------
        System.out.print("X: ");
        int x = input.nextInt();

        System.out.print("Y: ");
        int y = input.nextInt();
        //-------------------------------


        // Ausgabe
        //------------------------------------------------------------------
        System.out.println("Addition Ergebnisse: " + add(x, y));
        System.out.println("Subtraktion Ergebnisse: " + subtract(x, y));
        System.out.println("Multiplikation Ergebnisse: " + multiply(x, y));
        System.out.println("Division Ergebnisse: " + divided(x, y));
        System.out.println("Modulo Ergebnisse: " + rest(x, y));
        //------------------------------------------------------------------
        input.close();
    }

    // Methoden
    //---------------------------------------------------------------------
    public static float add(int x, int y) {
        // int addition = x + y;
        return (float) x + y;
    }

    public static float subtract(int x, int y) {
        return (float) x - y;
    }

    public static float multiply(int x, int y) {
        return (float) x * y;
    }

    public static float divided(int x, int y) {
        return (float) x / y;
    }

    public static float rest(int x, int y) {
        return (float) x % y;
    }
}
