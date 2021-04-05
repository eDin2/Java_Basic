package Switch.SW_02_Aritmetischer_Rechner;

import java.util.Scanner;

//Implementieren Sie ein Programm in dem aus der Konsole zwei Operanden (Zahlen) und ein Operator (+, -, *, /) ausgelesen werden
//Implementieren Sie die arithmetische Berechnung (Addition, Subtraktion, Division und Multiplikation)
//und geben Sie das Ergebnis des arithmetischen Ausdrucks auf die Konsole.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Operatoren und Operand eingeben:");
        double zahl1 = sc.nextDouble();          //ich habe Double genommen dann können wir kommazahlen auch berechnen
        char operator = sc.next().charAt(0);     // char für "+,-,*,/
        double zahl2 = sc.nextDouble();
        double result = 0.0;
        switch (operator) {
            case '+':
                result = zahl1 + zahl2;
                System.out.print(result);
                break;
            case '-':
                result = zahl1 - zahl2;
                System.out.print(result);
                break;
            case '*':
                result = zahl1 * zahl2;
                System.out.print(result);
                break;
            case '/':
                result = zahl1 / zahl2;
                System.out.print(result);
                break;
            default:
                System.out.println("Ungültige operator");


        }

        sc.close();
    }
}
