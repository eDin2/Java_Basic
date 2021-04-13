package JB_OA_ObjekteUndAssociationen.JB_OA4_Uhrzeit;

public class Uhrzeit {
    // Attribute (Instanzvariable)
    //-----------------------------------------
    private long seconds;

    // Konstruktor
    //-----------------------------------------
    public Uhrzeit(int kStunden, int kMinuten, int kSekunden) {
        double hourInSec = kStunden * 60 * 60;
        double minInSec = kMinuten * 60;
        double secInSec = kSekunden;
        this.seconds = (long) (hourInSec + minInSec + secInSec);
//        kStunden = (int) (seconds / 60 / 60 % 24);
//        kMinuten = (int) (seconds / 60 % 60);
//        kSekunden = (int) (seconds % 60);
    }


    // Methoden
    //-----------------------------------------
    public void add() {

    }

    public void sub() {

    }


    // Methode für Ausgabe!
    //-----------------------------------------
    public void printInfo() {
        String infoStunden = "Stunden: " ;
        String infoMinuten = "Minuten: " ;
        String infoSekunden = "Sekunden: ";
        System.out.println();
    }
}
