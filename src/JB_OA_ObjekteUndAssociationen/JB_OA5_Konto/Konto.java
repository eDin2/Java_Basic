package JB_OA_ObjekteUndAssociationen.JB_OA5_Konto;

public class Konto {
    // Attribute (Instanzvariablen)
    //--------------------------------------
    private String kontoInhaber;
    private double kontoStand;

    // Konstruktor
    //--------------------------------------
    public Konto(String kKontoInhaber, double kKontoStand) {
        this.kontoInhaber = kKontoInhaber;
        this.kontoStand = kKontoStand;
    }

    // Methoden
    //--------------------------------------
    public void einZahlen(double kontoInput) {
        kontoStand += kontoInput;
        System.out.println("Es wurde " + kontoInput + " Einbezahlt.");
    }

    public void abHeben(double kontoOutput) {
        if (kontoStand >= kontoOutput) {
            kontoStand -= kontoOutput;
            System.out.println(kontoOutput + " wurde Abgehoben");
        } else if (kontoStand <= kontoOutput) {
            kontoStand = 0;
            System.out.println(kontoOutput + " wurde Abgehoben, neuer Kontostand: " + kontoStand);
        } else if (kontoStand == 0) {
            System.out.println("Kontostand ist: " + kontoStand + ", Auszahlung nicht möglich!");
        } else {
            System.out.println("Etwas ist Schiefgelaufen! ");
        }
    }

    // Ausgabe
    //--------------------------------------
    public void printInfo() {
        String infoName = "Name: " + kontoInhaber;
        String infoKonto = "Letzter Kontstand: " + kontoStand;
        System.out.println(infoName + ", \n" + infoKonto);
    }

}
