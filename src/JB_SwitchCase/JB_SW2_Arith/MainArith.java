package JB_SwitchCase.JB_SW2_Arith;
// Implementieren Sie ein Programm in dem aus der Konsole zwei Operanden (Zahlen)
// und ein Operator (+, -, *, /) ausgelesen werden.
// Implementieren Sie die arithmetische Berechnung (Addition, Subtraktion,
// Division und Multiplikation) und geben Sie das Ergebnis des arithmetischen Ausdrucks auf die Konsole.


import java.util.Scanner;

public class MainArith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Zahl 1 eingeben: ");
        int zahl1 = input.nextInt();

        System.out.print("Zahl 2 eingeben: ");
        int zahl2 = input.nextInt();

        System.out.print("Operator eingeben: ");
        char operator = input.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = zahl1 + zahl2;
                System.out.print("Addition: " + result);
                break;
            case '-':
                result = zahl1 - zahl2;
                System.out.print("Subraktion: " + result);
                break;
            case '*':
                result = zahl1 * zahl2;
                System.out.print("Multiplikation: " + result);
                break;
            case '/':
                result = zahl1 / zahl2;
                System.out.print("Division: " + result);
                break;
            default:
                System.out.println("Bl:od");
                break;
        }

    }
}
