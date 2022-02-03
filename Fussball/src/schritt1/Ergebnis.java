package schritt1;

public class Ergebnis {
    private int heimtreffer;
    private int gasttreffer;

    public int addToreHeim() {
        heimtreffer++;
        return heimtreffer;
    }

    public int addToreGast() {
        gasttreffer++;
        return gasttreffer;
    }

    @Override
    public String toString() {
        String text = "\n\tHeim: " + heimtreffer;
        text += "\n\tGast: " + gasttreffer;
        return text;


    }


}
