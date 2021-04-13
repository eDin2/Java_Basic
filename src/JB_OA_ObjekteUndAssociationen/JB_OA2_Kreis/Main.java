package JB_OA_ObjekteUndAssociationen.JB_OA2_Kreis;

import JB_0_Operatoren.JB_05_Kreis.Kreis;

// Implementieren Sie die Klasse Kreis.
// Deklarieren Sie die Instanzvariablen und Methoden anhand von dem UML Klassendiagram.
// Methoden der Klasse PC:
//        • getFlaeche – berechnet die Fläche des Kreises (Formel: radius * radius * Math.PI)
//        • getUmfang – berechnet den Umfang des Kreises (Formel: 2 * radius * Math.PI)
//        • print – gibt den aktuellen Zustand der Instanzvariablen auf die Konsole
//        Erzeugen Sie ein Kreis-Objekt und testen, ob die Berechnung der Fläche und des Umfangs korrekt ist.
public class Main {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis("Blau", 12.0);

        kreis1.getUmfang();
        kreis1.getFlaeche();
        kreis1.printInfo();
    }
}
