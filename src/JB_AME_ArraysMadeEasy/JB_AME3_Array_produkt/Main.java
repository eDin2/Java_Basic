package JB_AME_ArraysMadeEasy.JB_AME3_Array_produkt;
// Implementieren Sie ein Java-Programm in dem Sie mit der Methode getProduct(int[] intArr)
// das Produkt von den Array-Elementen berechnen. Prüfen Sie, ob das Array nicht leer ist!

//Beispiel: das Produkt der int-Array Elementen {4, 6, -3, 11} = -792

public class Main {
    public static void main(String[] args) {
        int[] data = {4, 6, -3, 11};
        int product = getProduct(data);

        // Ausgabe der ausgeführten Methode
        System.out.println(product);
    }

    public static int getProduct(int[] intArr) {
        if (intArr.length == 0) {
            return 0;
        }

        int produkt = 1;
        for (int i = 0; i < intArr.length; i++) {
            produkt *= intArr[i];
        }
        return produkt;

    }
}
