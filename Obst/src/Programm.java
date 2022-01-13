public class Programm {
    public static void main(String[] args) {

        Apfel apfel = new Apfel();

        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println("Der Apfel heißt " + apfel.getName());
        System.out.println("Der Apfel wiegt " + apfel.getGewicht() + " Gramm.");
        System.out.println("Der Apfel hat die Farbe " + apfel.getFarbe() + ".");
        System.out.println();

        Banane banane = new Banane();
        System.out.println(banane.getName());


    }
}
