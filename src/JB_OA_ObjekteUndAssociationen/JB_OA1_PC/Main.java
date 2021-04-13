package JB_OA_ObjekteUndAssociationen.JB_OA1_PC;
// Implementieren Sie die Klasse PC, die einen PC repräsentiert.
// Die Instanzvariablen und Methoden der Klasse PC werden anhand vom UML Klassendiagramm deklariert:
// Methoden der Klasse PC:
//        • ausschalten – schaltet den PC aus – ändert den Wert der Instanzvariable auf false
//        • einschalten – schaltet den PC ein – ändert den Wert der Instanzvariable auf true
//        • bei beiden Methoden wird der aktuelle Zustand des PCs geprüft (z. B. wenn der PC schon ausgeschaltet ist, kann er nicht nochmals ausgeschaltet werden – die Methode liefert false mit der Aussage der Rechner nicht 2-mal hintereinander ausgeschaltet werden kann)
//        • print - gibt auf die Konsole den aktuellen Zustand der Instanzvariablen aus
//        Erzeugen Sie das PC-Objekt und testen seine Methoden.
public class Main {
    public static void main(String[] args) {
        // Konstruktor der Klasse Pc (Instanziieren => Instanz eines Objekts)
        Pc myComputer1 = new Pc("Acer", false);

        myComputer1.printInfo();
        System.out.println("----------------------------------");
        myComputer1.ausSchalten();
        myComputer1.ausSchalten();
        System.out.println("----------------------------------");
        myComputer1.printInfo();
        System.out.println("----------------------------------");
        myComputer1.einSchalten();
        System.out.println("----------------------------------");
        myComputer1.printInfo();
    }
}
