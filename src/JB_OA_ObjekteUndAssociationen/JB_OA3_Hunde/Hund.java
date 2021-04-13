package JB_OA_ObjekteUndAssociationen.JB_OA3_Hunde;

public class Hund {
    // Attribute (Instanzvariable)
    //-----------------------------------------
    private final String name;
    private final int age;


    // Konstruktor
    //-----------------------------------------
    public Hund(String kName, int kAge) {
        name = kName;
        age = kAge;
    }


    // Methoden
    //-----------------------------------------
    public void bellen() {
        if (name.equals("Hasso")) {
            System.out.println("Wuf... wuf... ");
        } else {
            System.out.println("Wau... wau... ");
        }
    }

    // Methode für Ausgabe!
    //-----------------------------------------
    public void printInfo() {
        String infoName = "Name: " + name;
        String infoAge = "Age: " + age;
        System.out.println(infoName + ", " + infoAge);
    }
}
