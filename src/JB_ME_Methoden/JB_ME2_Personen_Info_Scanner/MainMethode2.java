package JB_ME_Methoden.JB_ME2_Personen_Info_Scanner;

// Implementieren Sie ein ähnliches Programm wie in „JB_ME1: Personen Info“ mit diesem Unterschied:
// • die Werte werden aus der Konsole mit dem Scanner ausgelesen
// • der Scanner wird an die Methode als Parameter übergeben
// • die Deklaration und Initialisierung einer Scanner Variable,
// als auch das Schließen vom Scanner findet in der main-Methode statt
// Die Methode wird diese Signatur haben: leereMethode(Scanner scanner).

import java.util.Scanner;

public class MainMethode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe der Daten mittels Scanner
        //------------------------------------
        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Nachname: ");
        String nachName = input.next();

        System.out.print("Alter: ");
        int alter = input.nextInt();

        System.out.print("Famileinstand: ");
        boolean familienStand = input.nextBoolean();

        System.out.print("Gewicht: ");
        double gewicht = input.nextDouble();

        char anfangsBuchs = name.charAt(0);
        //----------------------------------------------


        // Methode wird aufgerufen!
        //----------------------------------------------
        // leereMethode("Edo", "Cajlo", 35, true, 80.5, anfangsBuchs);
        leereMethode(name, nachName, alter, familienStand, gewicht, anfangsBuchs);

        input.close();
    }


    // Methode
    private static void leereMethode(String name, String nachName, int alter, boolean familienStand, double gewicht, char anfangsBuchs) {
        System.out.println("Name: " + name);
        System.out.println("Nachname: " + nachName);
        System.out.println("Alter: " + alter);
        System.out.println("Famileinstand: " + familienStand);
        System.out.println("Gewciht: " + gewicht);
        System.out.println("Anfangsbuchstabe: " + anfangsBuchs);
    }
}
