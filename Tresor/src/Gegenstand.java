public abstract class Gegenstand {
    private String id;
    private double wert;

    public Gegenstand(String id, double wert) {
        this.id = id;
        this.wert = wert;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "Gegenstand{" +
                "id='" + id + '\'' +
                ", wert=" + wert +
                '}';
    }
}
