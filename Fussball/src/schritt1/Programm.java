package schritt1;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Jürgen", 49, 10);
        Spieler spieler = new Spieler("Kittel", 29, 10, 10, 10, 237);
        Torwart torwart = new Torwart("Heuer", 29, 10, 10, 10);

        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);


    }
}
