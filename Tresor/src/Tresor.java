import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstaende;

    public Tresor(ArrayList<Gegenstand> gegenstaende) {
        this.gegenstaende = gegenstaende;
    }

    public ArrayList<Gegenstand> getGegenstand() {
        return gegenstaende;
    }

    public double berechneGesamtwert() {
        double gesamtwert = 0;
        for (Gegenstand i:gegenstaende) {
            gesamtwert += i.getWert();
        }
        return gesamtwert;

    }

    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);

    }

    public void removeGegenstand(Gegenstand gegenstand) {
        if () {

        }

    }

    @Override
    public String toString() {
        return "Tresor{" +
                "gegenstaende=" + gegenstaende +
                '}';
    }
}

