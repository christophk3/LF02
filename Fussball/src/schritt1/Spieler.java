package schritt1;

public class Spieler {

    //Attribute erzeugen
    private String name2;
    private int alter2;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    //Konstruktor
    public Spieler(String name2, int alter2, int staerke, int torschuss, int motivation, int tore) {
        this.name2 = name2;
        this.alter2 = alter2;
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    //getter
    public String getName2() {
        return name2;
    }

    public int getAlter2() {
        return alter2;
    }

    public int getStaerke() {
        return staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public int getTore() {
        return tore;
    }

    //setter
    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setAlter2(int alter2) {
        this.alter2 = alter2;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }

    //toString Methode
    public String toString() {
        String text = "\tName\t\t = " + name2;
        text += "\n\tAlter\t\t = " + alter2;
        text += "\n\tStärke\t\t = " + staerke;
        text += "\n\tTorschuss\t = " + torschuss;
        text += "\n\tMotivation\t = " + motivation;
        text += "\n\tTore\t\t = " + tore;


        return text;
    }
}
