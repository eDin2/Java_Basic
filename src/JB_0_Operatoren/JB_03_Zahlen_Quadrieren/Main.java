package JB_0_Operatoren.JB_03_Zahlen_Quadrieren;
// Geben Sie einen numerischen Wert über die Konsole ein, quadrieren Sie die eingegebene
// Zahl und geben Sie das Ergebnis auf die Konsole aus.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte eine Zahl eingeben: ");
        int numWert = input.nextInt();
        int result;

        result = (int) Math.pow(numWert, 2);

        System.out.println("Numerischer Wert " + numWert);
        System.out.println("Quadriert: " + result);
    }
}
