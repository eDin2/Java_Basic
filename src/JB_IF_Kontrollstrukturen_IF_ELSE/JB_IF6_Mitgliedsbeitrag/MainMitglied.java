package JB_IF_Kontrollstrukturen_IF_ELSE.JB_IF6_Mitgliedsbeitrag;

// Implementieren Sie ein Programm zur Berechnung eines Mitgliedsbeitrags.
// Die Standardgebühr beträgt 999,99 €.
// Verheiratete Mitglieder zahlen 760 €, Studenten 400 €.
// Verheiratete Studenten zahlen 250 €. Das Programm fragt,
// ob das Mitglied verheiratet ist und ob es studiert.
// Die Werte werden von der Konsole eingelesen.
// Berechnen Sie den Mitgliedsbeitrag und geben Sie ihn auf die Konsole.


import java.util.Scanner;

public class MainMitglied {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Abfrage
        //--------------------------------------------------------------
        System.out.print("Sind Sie Verheiratet?: (true oder false): ");
        boolean verheiratetStatus = input.nextBoolean();

        System.out.print("Sind Sie Student?: (true oder false): ");
        boolean studentStatus = input.nextBoolean();
        //--------------------------------------------------------------


        // Mitgliedsbeitraege
        //--------------------------------------------------------------
        double standard = 999.99;
        int verheiratet = 760;
        int student = 400;
        int verheiratetStudent = 250;
        //--------------------------------------------------------------

        if (verheiratetStatus == true && studentStatus == true) {
            System.out.println("Verheiratet und Student " + verheiratetStudent + " Ihr Beitrag!");
        } else if (verheiratetStatus == true) {
            System.out.println("Nur Verheiratet " + verheiratet);
        } else if(studentStatus == true){
            System.out.println("Nur Student " + student);
        } else {
            System.out.println("Voller Betrag =  Standart: " + standard);
        }
        input.close();
    }
}
