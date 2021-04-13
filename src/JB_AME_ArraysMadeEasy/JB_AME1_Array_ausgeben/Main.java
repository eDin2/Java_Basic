package JB_AME_ArraysMadeEasy.JB_AME1_Array_ausgeben;
// Implementieren Sie ein Programm in dem Sie mit der Methode inhaltDrucken(int[] intArr)
// durch die Elemente des Arrays iterieren und die Elemente auf die Konsole ausgeben.

// Array sollte als Parameter an die Methode übergeben werden

public class Main {
    public static void main(String[] args) {
        int[] myArr = {23, 34, 56, 67}; // sogenannten Initialisierungsliste
        inhaltDrucken(myArr);
    }


    // Methoden
    public static void inhaltDrucken(int[] intArr) {
        // for Schleife
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++");

        // forEach Schleife
        for (int i : intArr) {
            System.out.println(i);
        }

    }
}
