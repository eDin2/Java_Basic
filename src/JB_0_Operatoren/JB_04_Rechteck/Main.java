package JB_0_Operatoren.JB_04_Rechteck;

import java.util.Scanner;

// Implementieren Sie ein Programm zur Berechnung der Fläche (F) und des Umfangs (U) eines Rechtecks.
// Die Länge der Seiten wird über die Konsole eingelesen.
// Verwenden Sie für die Berechnung die folgende Formel:
// F = a * b
// U = 2 * a + 2 * b
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Seite A an: ");
        double a = input.nextDouble();
        System.out.print("Bitte geben Sie die Seite B an: ");
        double b = input.nextDouble();
        double F, U;

        F = a * b;
        System.out.printf("Flaeche des Quadrats ergibt: %.2f%n", F);

        U = 2 * a + 2 * b;
        System.out.printf("Umfang des Quadrats ergibt: %.2f%n", U);

    }
}
