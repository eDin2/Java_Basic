package JB_OME_Objekte_Made_Easy.JB_OME1_Person;
// Implementieren Sie die Klasse Person mit den folgenden Instanzvariablen:
// • Vorname
// • Nachname
// • Alter
// • E-Mail
// • Adresse
// Die Instanzvariablen werden zuerst „public“ deklariert und deren Werte
// über den direkten Zugriff über die Referenzvariable geändert.
// Implementieren Sie die Methode print() in der Klasse Person.
// Legen Sie 2 Person Objekte an und geben alle Details des Objekts mit der print() Methode auf die Konsole aus.

public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.name = "Edo";
        pers1.nachName = "Cajlo";
        pers1.alter = 35;
        pers1.eMail = "Edo@Cajlo.com";
        pers1.adresse = "MyStreat 2";
        pers1.print();

        System.out.println("-------------------------");

        
        Person pers2 = new Person();
        pers2.name = "Ado";
        pers2.nachName = "Macho";
        pers2.alter = 20;
        pers2.eMail = "ado@Macho.com";
        pers2.adresse = "HerStreat 2";
        pers2.print();
    }
}
