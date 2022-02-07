package schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        Trainer trainer = new Trainer("Walter", 49, 6);
        Torwart torwart = new Torwart("Heuer", 29, 10, 8, 10);
        Spieler spieler1 = new Spieler("Kittel", 29, 10, 10, 5, 0);
        Spieler spieler2 = new Spieler("Jatta", 22, 10, 10, 10, 0);
        Spieler spieler3 = new Spieler("Heyer", 24, 10, 10, 7, 0);
        Spieler spieler4 = new Spieler("Schonlau", 27, 10, 10, 6, 0);

        ArrayList<Spieler> spielerArrayList1 = new ArrayList<>();
        spielerArrayList1.add(spieler1);
        spielerArrayList1.add(spieler2);
        spielerArrayList1.add(spieler3);
        spielerArrayList1.add(spieler4);

        Mannschaft mannschaft1 = new Mannschaft("HSV", trainer, torwart, spielerArrayList1);

        Trainer trainer_ = new Trainer("Werner", 70, 6);
        Torwart torwart_ = new Torwart("Pavlenka", 45, 10, 9, 10);
        Spieler spieler1_ = new Spieler("Duksch", 28, 10, 10, 8, 0);
        Spieler spieler2_ = new Spieler("Füllkrug", 26, 10, 10, 2, 0);
        Spieler spieler3_ = new Spieler("Toprak", 32, 10, 10, 4, 0);
        Spieler spieler4_ = new Spieler("Groß", 30, 10, 10, 7, 0);

        ArrayList<Spieler> spielerArrayList2 = new ArrayList<>();
        spielerArrayList2.add(spieler1_);
        spielerArrayList2.add(spieler2_);
        spielerArrayList2.add(spieler3_);
        spielerArrayList2.add(spieler4_);

        Mannschaft mannschaft2 = new Mannschaft("SVW", trainer_, torwart_, spielerArrayList2);
        Ergebnis ergebnis = new Ergebnis();

        Spiel spiel = new Spiel(mannschaft1, mannschaft2, ergebnis);

        try {
            Gameplay.spielen(spiel);
        } catch (SpielAbbruchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(spiel);

    }
}
