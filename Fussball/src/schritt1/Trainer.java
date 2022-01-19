package schritt1;

public class Trainer {

    //Attribute erzeugt
    private String name;
    private int alter;
    private int erfahrung;

    //Konstruktor
    public Trainer(String name, int alter, int erfahrung) {
        this.name = name;
        this.alter = alter;
        this.erfahrung = erfahrung;
    }


    //getter
    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }




}
