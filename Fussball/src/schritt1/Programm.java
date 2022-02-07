package schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Ergebnis ergebnis = new Ergebnis();
        Trainer trainer = new Trainer("Walter", 49, 10);
        Torwart torwart = new Torwart("Heuer", 29, 10, 10, 10);
        Spieler spieler1 = new Spieler("Kittel", 29, 10, 10, 10, 0);
        Spieler spieler2 = new Spieler("Jatta", 22, 10, 10, 10, 0);
        Spieler spieler3 = new Spieler("Heyer", 24, 10, 10, 10, 0);
        Spieler spieler4 = new Spieler("Schonlau", 27, 10, 10, 10, 0);
        ArrayList<Spieler> spielerArrayList1 = new ArrayList<>();
        spielerArrayList1.add(spieler1);
        spielerArrayList1.add(spieler2);
        spielerArrayList1.add(spieler3);
        spielerArrayList1.add(spieler4);
        Mannschaft mannschaft1 = new Mannschaft("HSV", trainer, torwart, spielerArrayList1);
        System.out.println(mannschaft1);
        System.out.println();

        Trainer trainer_ = new Trainer("Werner", 70, 10);
        Torwart torwart_ = new Torwart("Pavlenka", 45, 10, 10, 10);
        Spieler spieler1_ = new Spieler("Duksch", 28, 10, 10, 10, 0);
        Spieler spieler2_ = new Spieler("Füllkrug", 26, 10, 10, 10, 0);
        Spieler spieler3_ = new Spieler("Toprak", 32, 10, 10, 10, 0);
        Spieler spieler4_ = new Spieler("Groß", 30, 10, 10, 10, 0);
        ArrayList<Spieler> spielerArrayList2 = new ArrayList<>();
        spielerArrayList2.add(spieler1_);
        spielerArrayList2.add(spieler2_);
        spielerArrayList2.add(spieler3_);
        spielerArrayList2.add(spieler4_);
        Mannschaft mannschaft2 = new Mannschaft("SVW", trainer_, torwart_, spielerArrayList2);
        System.out.println(mannschaft2);
        System.out.println();
        Spiel spiel = new Spiel(mannschaft1, mannschaft2, ergebnis);
        Gameplay gameplay = new Gameplay();
        try {
            gameplay.spielen(spiel);
        }catch (SpielAbbruchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ergebnis);
        System.out.println(spiel);


    }
}
