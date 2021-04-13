package JB_OME_Objekte_Made_Easy.JB_OME2_Gekapselte_Person;

public class Person {
    // Attribute
    //----------------------------------------------
    private String name;
    private String nachName;
    private int alter;
    private String eMail;
    private String adresse;


    // Methode
    //----------------------------------------------
    public void print() {
        System.out.println(name);
        System.out.println(nachName);
        System.out.println(alter);
        System.out.println(eMail);
        System.out.println(adresse);
    }


    // GETTER & SETTER => Hilfs-Methoden
    //----------------------------------------------------
    // Name ----------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // NachName ----------------------------------------------
    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    // Alter ----------------------------------------------
    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    // eMail ----------------------------------------------
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    // Adresse ----------------------------------------------
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    //------------------------------------------------------

}
