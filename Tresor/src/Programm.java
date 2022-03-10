import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {

        ArrayList<Gegenstand> gegenstandArrayList = new ArrayList<>();
        Schmuck schmuck = new Schmuck(1111,100,"Ring");
        Aktie aktie = new Aktie(2222,50,"Lucas",5);
        Aktie aktie1 = new Aktie(3333,50,"Yannick",5);
        gegenstandArrayList.add(schmuck);
        gegenstandArrayList.add(aktie);
        gegenstandArrayList.add(aktie1);
        System.out.println(gegenstandArrayList);
        System.out.println();

    }
}
