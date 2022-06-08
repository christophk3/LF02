package businessObjects;

public class Tabelle {
    private int tabellenplatz;
    private String verein;
    private int spiele;
    private int tordifferenz;
    private int punkte;

    public Tabelle(int tabellenplatz, String verein) {
        this.tabellenplatz = tabellenplatz;
        this.verein = verein;

    }

    public int getTabellenplatz() {
        return tabellenplatz;
    }

    public void setTabellenplatz(int tabellenplatz) {
        this.tabellenplatz = tabellenplatz;
    }

    public String getVerein() {
        return verein;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }

    public int getSpiele() {
        return spiele;
    }

    public void setSpiele(int spiele) {
        this.spiele = spiele;
    }

    public int getTordifferenz() {
        return tordifferenz;
    }

    public void setTordifferenz(int tordifferenz) {
        this.tordifferenz = tordifferenz;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    @Override
    public String toString() {
        return "Tabelle{" +
                "tabellenplatz=" + tabellenplatz +
                ", verein='" + verein + '\'' +
                ", spiele=" + spiele +
                ", tordifferenz=" + tordifferenz +
                ", punkte=" + punkte +
                '}';
    }
}
