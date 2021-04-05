package JB_VK_Variablen_Konsole_AusgabeundEingabe.Hausuebung_2;

//JB-VK3:
//- Implementieren Sie ein Programm welches
//		- einen String (String)
//		- ein einzelnes Zeichen (char)
//		- einen Integer Wert (int)
//		- eine Gleitkommazahl (double)
//		- einen boolean Wert (boolean),
//      aus der Konsole einließt, in Variablen speichert und auf die Konsole alle eingelesen
//      Werte als ein String in einer Zeile ausgibt.
//      Verwenden Sie fürs Einlesen der Daten die Hilfsklasse java.util.Scanner.
//
//	Beispeil:
//	Für die Variablen mit dem Name "whatsAppGruppe" und "anzahlDerPersonen" werden 	folgende Werte aus der Konsole
//	eingelesen: "Java Jedis" und 10
//
//	Ausgegeben wird:
//	WhatsAppGruppe = Java Jedis, anzahlPersonenInGruppe = 10

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe Gruppenname
        System.out.print("Gruppenname eingeben: ");
        String whatsAppGruppe = "WhatsAppGruppe = " + input.next();

        // Eingabe Personenanzahl
        System.out.print("Anzahl der Personen: ");
        String anzahlDerPersonen = "AnzahlDerPersonen = " + input.nextInt() + ".";

        // Ausgabe der Eingabe
        System.out.println(whatsAppGruppe + ", " + anzahlDerPersonen);

        // Scanner Ende!
        input.close();
    }
}
