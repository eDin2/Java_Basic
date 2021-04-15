package JB_OA_ObjekteUndAssociationen.JB_OA7_Mitarbeiter;

public class Mitarbeiter {

    // Attribute (Instanzvariable)
    //----------------------------------------------------------------------------
    private final String VOR_NAME;
    private final String NACH_NAME;
    private final double MONATS_GEHALT;

    // Konstruktor
    //----------------------------------------------------------------------------
    public Mitarbeiter(String kVorName, String kNachName, double kMonatsGehalt) {
        this.VOR_NAME = kVorName;
        this.NACH_NAME = kNachName;
        this.MONATS_GEHALT = kMonatsGehalt;
    }

    // Methode für das Jahresgehalt berechnen (Parameter kommt aus der Main)
    //----------------------------------------------------------------------------
    // Wenn man beim erstellten Objekt(mitarbeiter1) mit der punkNotation einen Parameter übergibt
    // dann ist der Parameter die erhöhung des JahresGehalts
    // Bsp. mitarbeiter1[0].getJahreGehalt(17.0); => siehe in der Main
    public void getJahreGehalt(double erhoeung) {
        double jahresGehalt = MONATS_GEHALT * 12;
        double decimal = (erhoeung / 100) + 1; // musste die Prozent in Decimal umwandeln
        jahresGehalt = decimal * jahresGehalt;
        System.out.println("Jahregehalt + erhöhung: " + erhoeung + "% : " + jahresGehalt);
    }

    // Überladene Methode für das Jahresgehalt berechnen OHNE Parameter
    //----------------------------------------------------------------------------
    public void getJahreGehalt() {
        double jahresGehalt = MONATS_GEHALT * 12;
        System.out.println("Jahresgehalt + OHNE erhöhung: " + jahresGehalt);
    }


    //----------------------------------------------------------------------------
    public void print() {
        System.out.println("Name: " + VOR_NAME + ",\nNachname " + NACH_NAME + ",\nMonatsgehalt: " + MONATS_GEHALT);
    }
}
