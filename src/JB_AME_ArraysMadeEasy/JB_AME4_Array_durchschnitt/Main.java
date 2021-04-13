package JB_AME_ArraysMadeEasy.JB_AME4_Array_durchschnitt;
// Implementieren Sie ein Programm in dem Sie mit der Methode getAverage(int[] intArr)
// den Durchritt von Array-Elementen berechnen. Prüfen Sie, ob das Array nicht leer ist!

//Beispiel: der Durschnitt von int-Array Elementen {3, -1, 33, 4} = 9, 75

public class Main {
    public static void main(String[] args) {
        int[] data = {4, 6, -3, 11};
        int durchSchnitt = getDurchschnitt(data);

        // Ausgabe der ausgeführten Methode
        System.out.println(durchSchnitt);
    }

    public static int getDurchschnitt(int[] intArr) {
        if (intArr.length == 0) {
            return 0;
        }

        int produkt = 1;
        for (int i = 0; i < intArr.length; i++) {
            produkt += intArr[i];
        }
        return produkt / intArr.length;

    }
}

