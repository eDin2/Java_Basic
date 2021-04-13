package JB_AME_ArraysMadeEasy.JB_AME2_Array_summe;
// Implementieren Sie ein Java-Programm in dem Sie mit der Methode getSum(int[] intArr)
// die Summe von den Array-Elementen berechnen.
// Prüfen Sie, ob das Array nicht leer ist!


public class Main {
    public static void main(String[] args) {
        int[] data = {4, 6, -3, 11};

        // Ausgabe der ausgeführten Methode(getSum)
        System.out.println("Summe: " + getSum(data));
    }

    public static int getSum(int[] intArr) {
        int sum = 0;
        // mit einer forEach Schleife wird über ein Array Iteriert
        // data ist das Array über welches Iteriert wird!
        // sum wird an getSum returnt welche dann in der mainMethode geprientet werden
        for (int i : intArr) {
            if (i == 0) {
                return 0;
            }
            sum += i;
        }
        return sum;
    }
}