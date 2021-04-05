package JB_VK_Variablen_Konsole_AusgabeundEingabe.Hausuebung_4;
// JB-VK4 - Bonus:
//- deklarieren und initialisieren sie 2 Variablen für eine positive und ein negativen Gleitkommazahl (double).
//  Verwenden Sie folgende Werte:
//- positive Zahl : 66545.434
//- negative Zahl : -9945403834.223
//
//Mit der System.out.format(...) Methode formatieren sie die Ausgabe auf der Konsole:
//- positive Zahl wird folgendermassen ausgegeben: +66.545,43
//- negative Zahl wird folgendermassen ausgegeben: (9.945.403.834,22)


public class Main_4 {
    public static void main(String[] args) {
        // Gleitkommazahlen
        double pZahl = 66545.434;
        double nZahl = -9945403834.223;

        // Ausgabe
        System.out.printf("P.Zahl= %+,.2f%n", pZahl);
        System.out.printf("N.Zahl= %(,.2f", nZahl);
    }
}
