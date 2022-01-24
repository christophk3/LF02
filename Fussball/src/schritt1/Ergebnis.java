package schritt1;

public class Ergebnis {
    private int heimtreffer;
    private int gasttreffer;


    public int getHeimtreffer() {
        return heimtreffer;
    }

    public void HeimTreffer() {
        heimtreffer++;
    }


    public int getGasttreffer() {
        return gasttreffer;
    }

    public void GastTreffer() {
        gasttreffer++;
    }

    @Override
    public String toString() {
        String text = "\n\tHeim: " + getHeimtreffer();
        text += "\n\tGast: " + getGasttreffer();
        return text;


    }


}
