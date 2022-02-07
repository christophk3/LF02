package schritt1;

public class SpielAbbruchException extends Exception{
    private int spielMinute;

    public SpielAbbruchException(int spielMinute) {
        this.spielMinute = spielMinute;
    }

    public int getSpielminute() {
        return spielMinute;
    }

    @Override
    public String getMessage() {

        return "Spielabbruch " + getSpielminute();
    }
}
