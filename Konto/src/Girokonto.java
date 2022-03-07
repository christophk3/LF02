public class Girokonto extends Konto {
    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditLimit, double zinsGuthaben, double zinsKredit) {
        super(inhaber, kreditLimit, zinsGuthaben);
        this.zinsKredit = zinsKredit;

    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean ueberweisen(double betrag, Girokonto girokonto) {
        if (auszahlen(betrag)) {


        }

    }

}

