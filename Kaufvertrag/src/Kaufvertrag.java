public class Kaufvertrag {
    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlunsModalitaeten;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) {
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlunsModalitaeten() {
        return zahlunsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlunsModalitaeten) {
        this.zahlunsModalitaeten = zahlunsModalitaeten;
    }

    @Override
    public String toString() {
        return "Verkäufer: " + "\n" + getVerkaeufer() + "\n" +
                "Käufer: " + "\n" + getKaeufer() + "\n" +
                "Ware: " + "\n" + getWare() + "\n" +
                "Zahlungsmodalitäten: " + "\n" + getZahlunsModalitaeten() + "\n";
    }
}
