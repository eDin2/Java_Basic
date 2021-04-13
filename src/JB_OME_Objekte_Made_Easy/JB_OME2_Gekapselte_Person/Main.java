package JB_OME_Objekte_Made_Easy.JB_OME2_Gekapselte_Person;
// Verwenden Sie die Klassendefinition vom JB_OME1: Person.
// Kapseln Sie alle Instanzvariablen ein und deklarieren die get- und set-Methoden
// um auf die Instanzvariablen lesend und schreibend zugreifen zu können.
// Implementieren Sie die Methode print() in der Klasse Person.
// Legen Sie 2 Person Objekte an und geben alle Details des Objekts mit der print() Methode auf die Konsole aus.

public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.setName("Edo");
        pers1.setNachName("Cajlo");
        pers1.setAlter(35);
        pers1.seteMail("edo@cajlo.com");
        pers1.setAdresse("MyStreat 2");
        pers1.print();

        System.out.println("--------------------------------");

        Person pers2 = new Person();
        pers2.setName("Saban");
        pers2.setNachName("Saulic");
        pers2.setAlter(65);
        pers2.seteMail("saban@rip.com");
        pers2.setAdresse("Heaven 2");
        pers2.print();
    }
}
