package schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Walter", 49, 10);
        Torwart torwart = new Torwart("Heuer", 29, 10, 10, 10);
        Spieler spieler1 = new Spieler("Kittel",29,10,10,8,54);
        Spieler spieler2 = new Spieler("Jatta",22,7,5,9,12);
        Spieler spieler3 = new Spieler("Heyer",24,8,4,6,8);
        Spieler spieler4 = new Spieler("Schonlau",27,9,3,10,2);
        ArrayList<Spieler> spielerArrayList1 = new ArrayList<>();
        spielerArrayList1.add(spieler1);
        spielerArrayList1.add(spieler2);
        spielerArrayList1.add(spieler3);
        spielerArrayList1.add(spieler4);
        Mannschaft mannschaft1 = new Mannschaft("HSV",trainer,torwart);
        System.out.println(mannschaft1);
        System.out.println();

        Trainer trainer_ = new Trainer("Werner", 70, 1);
        Torwart torwart_ = new Torwart("Pavlenka", 45, 1, 1, 6);
        Spieler spieler1_ = new Spieler("Duksch",28,10,10,10,14);
        Spieler spieler2_ = new Spieler("Füllkrug",26,4,2,3,6);
        Spieler spieler3_ = new Spieler("Toprak",32,10,2,5,4);
        Spieler spieler4_ = new Spieler("Groß",30,6,1,8,2);
        ArrayList<Spieler> spielerArrayList2 = new ArrayList<>();
        spielerArrayList1.add(spieler1_);
        spielerArrayList1.add(spieler2_);
        spielerArrayList1.add(spieler3_);
        spielerArrayList1.add(spieler4_);
        Mannschaft mannschaft2 = new Mannschaft("SVW",trainer_,torwart_);
        System.out.println(mannschaft2);






    }
}
