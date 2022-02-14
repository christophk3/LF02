public class Sparkonto extends Konto{
    public Sparkonto(Kunde inhaber, double zinsSatz) {
        super(inhaber, 0, zinsSatz);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
