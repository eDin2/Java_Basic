package JB_L_Loops.JB_L2_Summe_berechnen;

// Schreiben Sie ein Programm, um die Summe der ersten 10 Zahlen zu berechnen.

import java.util.Scanner;

public class MainSumme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Beispiel mit einer FOR Schleife:
        System.out.print("Anzahl der Loops fuer FOR eingeben: ");
        int n = input.nextInt();

        int summe = 1;
        for (int i = 0; i <= n; i++) {
            summe = summe + i;
        }
        System.out.println("For Summe: " + summe);

        //1#2##3##4###5##############################################
        System.out.println("#####################################");
        //###########################################################

        // Beispiel mit einer WHILE Schleife:
        System.out.print("Anzahl der Loops fuer WHILE eingeben: ");
        int num = input.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("While Summe: " + sum);

        input.close();
    }
}
