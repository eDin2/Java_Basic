package JB_KH_Klassenhierarchie.JB_KH1_LKW;
// Implementieren Sie eine Klassenhierarchie zur Darstellung von LKWs.
//
// Superklasse: LKW
// Implementieren und überschreiben Sie die Methode print() in den Subklassen und geben Informationen über die LKWs auf die Konsole.

public class Main {
    public static void main(String[] args) {

        Muldenkipper myMuldenKipper1 = new Muldenkipper(1958, "MAN", 12);
        // Objekt aus Klasse Muldenkipper Instanziiert (erstellt)
        int mBauJahr = myMuldenKipper1.getBaujahr(); // Die einzelnen Parameter aus den Instanzen wurden in variablen verpackt
        String mHerSteller = myMuldenKipper1.getHersteller();
        int mLadeVolumen = myMuldenKipper1.getLaderaumInVolumen();
        myMuldenKipper1.printInfo(mBauJahr, mHerSteller, mLadeVolumen); // Ausgabe der printInfo()

        System.out.println("----------------------------------------------------------");

        Sattelschlepper mySattelschlepper = new Sattelschlepper(2030, "Tesla", 120);
        int sBauJahr = mySattelschlepper.getBaujahr();
        String sHerSteller = mySattelschlepper.getHersteller();
        int sLadeTonnen = mySattelschlepper.getBeladungInTonnen();
        mySattelschlepper.printInfo(sBauJahr, sHerSteller, sLadeTonnen); // Ausgabe der printInfo()

    }
}
