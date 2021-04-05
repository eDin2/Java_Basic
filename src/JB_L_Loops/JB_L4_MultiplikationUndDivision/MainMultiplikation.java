package JB_L_Loops.JB_L4_MultiplikationUndDivision;
// Schreiben Sie ein Programm zur Multiplikation und Division zweier int-Zahlen x und y.
// Verwenden Sie jedoch nur die Operatoren + und -.
// Im Falle einer Division wird auch der Rest berechnet,
// z. B.:
// • 3/4 = 0 -> Rest 3
// • 4/3 = 1 -> Rest 1
// • 11/4 = 2 -> Rest 3

import java.util.Scanner;

public class MainMultiplikation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe der zu rechnenden Zahlen
        //________________________________________________________
        System.out.print("Bitte X eingeben: ");
        int x = input.nextInt();
        System.out.print("Bitte Y eingeben: ");
        int y = input.nextInt();
        //________________________________________________________


        // Multiplikation
        //________________________________________________________
        int multi = 0;
        for (int i = 0; i < y; i++) {
            multi = multi + x;
        }
        System.out.println("Multiplikation: " + multi);
        //________________________________________________________



        // Division
        //________________________________________________________
        int divi = multi;
        for (int i = 0; i < y; i++) {
            divi = divi - x;
        }
        System.out.println("Division: " + divi);
        //________________________________________________________


//        int aus = 32 % 3; // => Erg.ist: 2 (also Rest ist 2)
//        System.out.println("Rest einer Division: " + aus);


        input.close();
    }
}
