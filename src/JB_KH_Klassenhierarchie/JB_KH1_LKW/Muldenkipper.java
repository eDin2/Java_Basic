package JB_KH_Klassenhierarchie.JB_KH1_LKW;

public class Muldenkipper extends Lkw {
    private int laderaumInVolumen;
    // diese Variabel gibt es nur in dieser KinderKlasse
    // und wird mittels Setter&Getter zur verfügung gestellt

    // GETTER & SETTER
    //--------------------------------------------
    public int getLaderaumInVolumen() {
        return laderaumInVolumen;
    }

    public void setLaderaumInVolumen(int laderaumInVolumen) {
        this.laderaumInVolumen = laderaumInVolumen;
    }
    //-------------------------------------------


    // Konstruktor
    //-------------------------------------------
    public Muldenkipper(int kBaujahr, String kHersteller, int kLaderaumInVolumen) {
        super.setBaujahr(kBaujahr);
        super.setHersteller(kHersteller);
        this.laderaumInVolumen = kLaderaumInVolumen;
    }

    // Methode aus der SuperKlasse(LKW) wurde überschrieben
    //--------------------------------------------
    @Override
    public void printInfo(int bauJahr, String herSteller, int laderVolumen) {
        System.out.println("Baujahr: " + getBaujahr() + ",\nHersteller: " + getHersteller() + ",\nLaderaumvolumen: " + getLaderaumInVolumen());
    }
}
