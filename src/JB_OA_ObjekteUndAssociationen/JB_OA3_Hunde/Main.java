package JB_OA_ObjekteUndAssociationen.JB_OA3_Hunde;

public class Main {
    public static void main(String[] args) {
        Hund myHund1 = new Hund("Bello", 2);
        Hund myHund2 = new Hund("Hasso", 4);

        myHund1.bellen();
        myHund1.printInfo();

        System.out.println("---------------------");

        myHund2.bellen();
        myHund2.printInfo();

    }
}
