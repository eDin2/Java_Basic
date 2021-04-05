package JB_VK_Variablen_Konsole_AusgabeundEingabe.Hausuebung_3;

//JB-VK2:
//- Implementieren Sie ein Programm, in dem Sie 3 Variablen deklarieren und initialisieren.
//  In diesen Variablen wird Ihr Vorname, Nachname und das Alter gespeichert. Achten Sie auf die Datentypen.
//
//  Das Ergebniss wird auf die Konsole in einer Zeile in dieser Form ausgegeben:
//	Vorname = "Martin", Nachname="Gic", Alter=30
//
//	Hint: Konkatenieren Sie die Variablen bei der Ausgabe
//	Beispiel:
//	int x = 1; int y = 2;
//	System.out.println("x=" + x + " ,y=" + y);
//
//	Auf der Konsole: x=1, y=2

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe Name
        System.out.print("Name Eingeben: ");
        String fName = input.next();

        // Eingabe Nachname
        System.out.print("Nachname Eingeben: ");
        String nName = input.next();

        // Alter Eingabe
        System.out.print("Alter Eingeben: ");
        int alter = input.nextInt();

        System.out.println("Name =" + "'" + fName + "'" + ", " + "Nachname =" + "'" + nName + "'" + ", " + "Alter =" + alter);

        // Scanner Ende!
        input.close();
    }
}
