public abstract class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {

    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public void setInhaber(Kunde inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void einzahlen(double betrag) {
        kontoStand += betrag;
        return;

    }

    public boolean auszahlen(double betrag) {
        if (betrag <= kontoStand + kreditLimit) {
            this.kontoStand = kontoStand - betrag;
            return true;

        }else{
            System.out.println("Auszahlnung leider nicht möglich.");
            System.out.println("Möglicher Auszahlungsbetrag: " + kontoStand);
            return false;


        }
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber=" + inhaber +
                ", kontoStand=" + kontoStand +
                ", kreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}
