package JB_OA_ObjekteUndAssociationen.JB_OA1_PC;

public class Pc {
    // Attribute (Instanzvariablen)
    //----------------------------------
    private String hersteller;
    private boolean inBetrieb;


    // Konstruktor (k => Konstruktor)
    //----------------------------------
    public Pc(String kHersteller, boolean kInBetrieb) {
        this.hersteller = kHersteller;
        this.inBetrieb = kInBetrieb;
    }


    // Methode EINschalten (ohne Parameter)
    //----------------------------------
    public void einSchalten() {
        if (inBetrieb) {
            System.out.println("Rechner " + hersteller + " kann nicht 2x EINgeschaltet werden! ");
        } else {
            inBetrieb = true;
            System.out.println("Rechner " + hersteller + " wurde EINgeschaltet");
        }
    }

    // Methode AUSschalten (ohne Parameter)
    //----------------------------------
    public void ausSchalten() {
        if (!inBetrieb) {
            System.out.println("Rechner " + hersteller + " kann nicht 2x AUSgeschaltet werden! ");
        } else {
            inBetrieb = false;
            System.out.println("Rechner " + hersteller + " wurde AUSgeschaltet");
        }
    }


//    // GETTER
//    //---------------------------------
//    public String getHersteller() {
//        return hersteller;
//    }
//
//    public boolean getInBetrieb() {
//        return inBetrieb;
//    }
//
//    // SETTER
//    //---------------------------------
//    public void setHersteller(String hersteller) {
//        this.hersteller = hersteller;
//    }
//
//    public void setInBetrieb(boolean inBetrieb) {
//        this.inBetrieb = inBetrieb;
//    }


    // Methode für Ausgabe!
    //---------------------------------
    public void printInfo() {
        String info = "Hersteller: " + hersteller + ", Betrieb = " + inBetrieb;
        System.out.println(info);
    }
}
