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

    public Torwart(String name2, int alter2, int staerke, int motivation, int reaktion) {
        super(name2, alter2, staerke, motivation, reaktion);
    }

}
