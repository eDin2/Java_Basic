package JB_ME_Methoden.JB_ME5und6_Arithmetische_Round2;

import java.util.Scanner;

// Erweitern Sie folgendermaßen die Aufgabe JB_ME4: Arithmetische Berechnung:

// • deklarieren Sie für die 5 Methoden, die sich mit arithmetischer Berechnung beschäftigen eine weitere Methode
// calculate(int x, int y, char operator) an die 2 ganzzahlige Zahle und ein Operator (+, -, /, *, %) übergeben werden.

// • es dürfen nur diese Operatoren verwendet werden
// – wenn der Operator ungültig ist, wird 0 als Ergebnis von der Methode calculate(…) zurückkommen.

// • abhängig von dem Operator werden in de calculate(…)
// Methode die Methoden add(…), divide(…), multiply(…), rest(…) oder subtract(…) aufgerufen

// • die Zahlen, als auch Operator werden über die Konsole eingelesen

// • achten Sie auch auf die Division durch 0 Das Programm wird 5-mal
// den Benutzer nach den Inputs fragen und das Ergebnis in der Variable „kumulativeSumme“ gespeichert.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe
        //-------------------------------
        System.out.print("X: ");
        int x = input.nextInt();

        System.out.print("Y: ");
        int y = input.nextInt();

        System.out.print("Operator (+, -, /, *, %): ");
        char operator = input.next().charAt(0);
        //----------------------------------------------


        // Aufruf der Methode
        //------------------------------------------------------------------
        calculate(x, y, operator);
        //------------------------------------------------------------------

        input.close();
    }

    // Methoden
    //---------------------------------------------------------------------
    public static void calculate(int x, int y, char operator) {
//        if (operator == '+') {
//            System.out.println("Addition: " + add(x, y));
//        } else if (operator == '-') {
//            System.out.println("Subtraction: " + subtract(x, y));
//        } else if (operator == '*') {
//            System.out.println("Multiplikation: " + multiply(x, y));
//        } else if (operator == '/') {
//            System.out.println("Division: " + divided(x, y));
//        } else if (operator == '%') {
//            System.out.println("Modulo: " + rest(x, y));
//        } else {
//            System.out.println("0");
//        }

        switch (operator) {
            case '+':
                System.out.print("Addition: " + add(x, y));
                break;
            case '-':
                System.out.print("Subtraction: " + subtract(x, y));
                break;
            case '*':
                System.out.print("Multiplikation: " + multiply(x, y));
                break;
            case '/':
                System.out.print("Division: " + divided(x, y));
                break;
            case '%':
                System.out.print("Modulo: " + rest(x, y));
                break;
            default:
                System.out.println(operator + " ist kein Operator: " + 0);
                break;
        }
    }

    // Methode Addition
    public static float add(int x, int y) {
        return (float) x + y;
    }

    // Methode Subtraction
    public static float subtract(int x, int y) {
        return (float) x - y;
    }

    // Methode Multiplikation
    public static float multiply(int x, int y) {
        return (float) x * y;
    }

    // Methode Division
    public static float divided(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("Division durch 0 ist nicht erlaubt");
        } else {
            return (float) x / y;
        }
        return 0;
    }

    // Methode Modulo
    public static float rest(int x, int y) {
        return (float) x % y;
    }
}
