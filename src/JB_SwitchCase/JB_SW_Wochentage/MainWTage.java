package JB_SwitchCase.JB_SW_Wochentage;
// Implementieren Sie ein Programm in dem die Ziffer von 0 – 6 aus der Konsole eingelesen werden
// und dann den entsprechenden Namen des Tages (beginnend mit 0 = Montag) auf die Konsole ausgegeben wird.

import java.util.Scanner;

public class MainWTage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("WochenTag von 0 - 6 eingeben: ");
        int wochenTag = input.nextInt();

        switch (wochenTag) {
            case 0:
                System.out.println("Montag");
                break;
            case 1:
                System.out.println("Dienstag");
                break;
            case 2:
                System.out.println("Mittwoch");
                break;
            case 3:
                System.out.println("Donnerstag");
                break;
            case 4:
                System.out.println("Freitag");
                break;
            case 5:
                System.out.println("Sammstag");
                break;
            case 6:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Diesen Tag gibt es nicht!");
                break;
        }
    }
}
