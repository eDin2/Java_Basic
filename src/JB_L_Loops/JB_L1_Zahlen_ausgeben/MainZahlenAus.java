package JB_L_Loops.JB_L1_Zahlen_ausgeben;

import java.util.Scanner;
// Schreiben Sie ein Programm zum Ausgeben von Zahlen von 1 bis 10.

public class MainZahlenAus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl der Loops eingeben: ");
        int loops = input.nextInt();

        for (int i = 0; i < loops; i++) {
            System.out.println("Durchlauf: " + (i + 1));
        }

        input.close();
    }
}
