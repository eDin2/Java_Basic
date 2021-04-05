package JB_ME_Methoden.JB_ME3_Zufallszahlgenerator;
// Implementiere Sie ein Programm in dem Sie die Methode float getRandomNumber() deklarieren.
// Die Methode soll eine Zufallszahl zwischen (0-1) zurückgeben.
// Generieren Sie die Zufallszahl mit Math.random();


public class Main {
    public static void main(String[] args) {
        System.out.println("RandomNumber(float) zwischen " + 0 + " und " + 1 + ": " + getRandomNumber());
    }


    public static float getRandomNumber() {
        return (float) (Math.random() * (1));
    }
}
