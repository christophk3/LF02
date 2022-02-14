public class Kunde {
    private Mitarbeiter betreuer;

    public Kunde(String vorname, String nachname, Mitarbeiter betreuer) {

    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer=" + betreuer +
                '}';
    }
}
