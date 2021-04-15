package JB_OA_ObjekteUndAssociationen.JB_OA7_Mitarbeiter;

public class Main {
    public static void main(String[] args) {
        // Auto-Array Objekt erzeugen - alle Elemente des Arrays
        // werden mit null-Wert initialisiert
        Mitarbeiter[] mitarbeiter1 = new Mitarbeiter[5];


        mitarbeiter1[0] = new Mitarbeiter("Edo", "Cajlo", 2500);
        mitarbeiter1[1] = new Mitarbeiter("Saban", "Saulic", 5500);
        mitarbeiter1[2] = new Mitarbeiter("Mitar", "Miric", 3500);

        
        System.out.println("Mitarbeiter 1) -------------------------------------------------------------");
        mitarbeiter1[0].print();
        mitarbeiter1[0].getJahreGehalt();
        mitarbeiter1[0].getJahreGehalt(17.0);


        System.out.println("Mitarbeiter 2) -------------------------------------------------------------");
        mitarbeiter1[1].print();
        mitarbeiter1[1].getJahreGehalt();
        mitarbeiter1[1].getJahreGehalt(5.0);


        System.out.println("Mitarbeiter 3) -------------------------------------------------------------");
        mitarbeiter1[2].print();
        mitarbeiter1[2].getJahreGehalt();
        mitarbeiter1[2].getJahreGehalt(5.0);
    }
}
