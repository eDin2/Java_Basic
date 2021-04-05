package JB_SwitchCase.JB_SW1_Noten;

import java.util.Scanner;

public class MainNoten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noteEingabe = input.nextInt();

        switch (noteEingabe) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befridiegent");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Bl:od");
                break;
        }
    }
}
