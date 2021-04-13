package JB_0_Operatoren.JB_05_Kreis;

public class Kreis {
    // Attribute (Instanzvariablen)
    //------------------------------------------
    private final String farbe;
    private final double radius;
    private final double pi = Math.PI;


    // Konstruktor
    //------------------------------------------
    public Kreis(String farbe, double radius) {
        this.farbe = farbe;
        this.radius = radius;
    }


    // Methoden
    //------------------------------------------
    public void getFlaeche() {
        double flaeche = radius * radius * pi;
        System.out.printf("Fläche: %.2f\n", flaeche);
    }

    public void getUmfang() {
        double umfang = 2 * radius * pi;
        System.out.printf("Umfang: %.2f\n", umfang);
    }


//    // Getter
//    //------------------------------------------
//    public String getFarbe() {
//        return farbe;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    // Setter
//    //------------------------------------------
//    public void setFarbe(String farbe) {
//        this.farbe = farbe;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }

    // Methode für Ausgabe!
    //---------------------------------
    public void printInfo() {
        String info = "Farbe: " + farbe + ", Radius: " + radius;
        System.out.println(info);
    }
}
