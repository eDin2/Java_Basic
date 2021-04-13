package JB_OA_ObjekteUndAssociationen.JB_OA5_Konto;

public class Main {
    public static void main(String[] args) {
        Konto newInhaber = new Konto("Edo", 1500);

        newInhaber.printInfo();


        System.out.println("-----------------------");
        newInhaber.abHeben(120);
        newInhaber.abHeben(1500);
        System.out.println("-----------------------");


        newInhaber.printInfo();
    }
}
