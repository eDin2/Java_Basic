package JB_ME_Methoden.JB_ME1_Personen_Info;
// Implementieren Sie ein Programm, in dem Sie eine Methode leereMethode() deklarieren.
// Deklarieren Sie lokale Variablen in der Methode und belegen mit den folgenden Informationen:
// Name, Nachname, Alter, Familienstand (verheiratet/ledig),
// Gewicht (als Fließkommazahl),
// den ersten Buchstabe Ihres Namens (z. B. Martin = M).
// Geben Sie alle Variablen auf die Konsole in der gleichen Methode aus.
// Arbeiten Sie ohne Hilfsklasse Scanner.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        leereMethode();
    }

    private static void leereMethode() {
        String name = "Edo";
        String nachName = "Cajlo";
        int alter = 35;
        boolean familienStand = true;
        double gewicht = 90.3;
        char anfangsBuchs = name.charAt(0);
        System.out.println("Name: " + name);
        System.out.println("Nachname: " + nachName);
        System.out.println("Alter: " + alter);
        System.out.println("Famileinstand: " + familienStand);
        System.out.println("Gewciht: " + gewicht);
        System.out.println("Anfangsbuchstabe: " + anfangsBuchs);
    }
}
