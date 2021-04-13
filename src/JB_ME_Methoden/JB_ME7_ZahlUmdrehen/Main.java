package JB_ME_Methoden.JB_ME7_ZahlUmdrehen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe
        //------------------------------------------------------------------
        System.out.print("Zahlen bitte eingeben: ");
        int zahlInput = input.nextInt();
        //------------------------------------------------------------------


        // Aufruf der Methode
        //------------------------------------------------------------------
        zahlUmdrehen(zahlInput);
        //------------------------------------------------------------------

        input.close();
    }


    // Methode
    //------------------------------------------------------------------
    public static void zahlUmdrehen(int zahl) {
        int reverse = 0;
        do {
            reverse = reverse * 10 + (zahl % 10);
            zahl /= 10;
        } while (zahl > 0);
        System.out.println("Reversed:" + reverse);
    }
}
