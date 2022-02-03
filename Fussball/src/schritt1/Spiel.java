package schritt1;

public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbericht;

    public Spiel(Mannschaft heim, Mannschaft gast, Ergebnis ergebnis) {
        this.heim = heim;
        this.gast = gast;
        this.ergebnis = ergebnis;
        spielbericht = new StringBuilder();

    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }

    public String toString() {
        String text = "\n\tHeimmannschaft: " + heim;
        text += "\n\tGastmannschaft: " + gast;
        text += "\n\tErgebnis: " + ergebnis;
        text += "\n\tSpielverlauf: " + spielbericht;
        return text;
    }
}
