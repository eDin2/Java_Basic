package JB_KH_Klassenhierarchie.JB_KH1_LKW;

public class Sattelschlepper extends Lkw {
    public int beladungInTonnen;

    // GETTER & SETTER
    //--------------------------------------------
    public int getBeladungInTonnen() {
        return beladungInTonnen;
    }

    public void setBeladungInTonnen(int beladungInTonnen) {
        this.beladungInTonnen = beladungInTonnen;
    }
    //-------------------------------------------

    // Konstruktor
    //-------------------------------------------
    public Sattelschlepper(int kBaujahr, String kHersteller, int kBeladungInTonnen) {
        super();
        super.setBaujahr(kBaujahr);
        super.setHersteller(kHersteller);
        this.beladungInTonnen = kBeladungInTonnen;
    }

    // Methode
    //--------------------------------------------
    @Override
    public void printInfo(int bauJahr, String herSteller, int beladungTonnen) {
        System.out.println("Baujahr: " + getBaujahr() + ",\nHersteller: " + getHersteller() + ",\nBeladung in Tonnen: " + getBeladungInTonnen());
    }
}
