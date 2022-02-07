package schritt1;

public class Torwart extends Spieler {

    //Attribut Reaktion
    private int reaktion;

    //getter
    public int getReaktion() {
        return reaktion;
    }

    //setter
    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    public Torwart(String name, int alter, int staerke, int motivation, int reaktion) {
        super(name, alter, staerke, 0, motivation, 0);
        this.reaktion = reaktion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tReaktion\t = " + reaktion + "\n";
    }
}
