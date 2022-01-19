public abstract class Obst {

    private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;

    //Konstruktor
    public Obst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Getter
    public String getFarbe() {
        return farbe;
    }

    //Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isReif() {
        return reif;
    }

    public void setReif(boolean reif) {
        this.reif = reif;
    }

    @Override
    public String toString() {
        String text = "\tName\t = " + name;
        text += "\n\tFarbe\t = " + farbe;
        text += "\n\tGewicht\t = " + gewicht;
        text += "\n\tReife\t = " + reif;

        return text;
    }
}
