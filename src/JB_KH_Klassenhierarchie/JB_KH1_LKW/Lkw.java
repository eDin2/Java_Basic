package JB_KH_Klassenhierarchie.JB_KH1_LKW;

public class Lkw {
    // LKW ist die SupperKlasse und vererbt an die KinderKlassen => Muldenkipper & Sattelschlepper)

    // Attribute (Instanzvariablen)
    //----------------------------------------------
    private int baujahr;
    private String hersteller;


    // GETTER & SETTER
    //----------------------------------------------
    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }





    // Ausgabe
    //--------------------------------------
    // Instanzmethoden der Klasse LKW
    protected void printInfo(int bauJahr, String herSteller, int laderVolumen ) {
    }

    public void printInfo() {
    }

}
