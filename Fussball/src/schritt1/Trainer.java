package schritt1;

public class Trainer extends Person {

    //Attribute erzeugt
    private int erfahrung;

    //Konstruktor
    public Trainer(String name, int alter, int erfahrung) {
        super(name, alter);
        this.erfahrung = erfahrung;
    }


    //getter
    public int getErfahrung() {
        return erfahrung;
    }

    //setter
    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    //toString Methode
    public String toString() {
        String text = "\tName\t\t = " + getName();
        text += "\n\tAlter\t\t = " + getAlter();
        text += "\n\tErfahrung\t = " + erfahrung + "\n";

        return text;

    }


}
