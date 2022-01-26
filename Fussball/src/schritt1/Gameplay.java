package schritt1;

import java.util.Random;

public class Gameplay {
    private static final int spielzeit = 90;
    private static final int maxNachspielzeit = 5;
    private static final int maxNaechsteAktion = 10;
    private static int ermittleMannschaftsWert(Mannschaft mannschaft) {
        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke();
        if (mannschaftswert == 0) {
            mannschaftswert = 1;
        }
        return mannschaftswert;
    }
    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        boolean tor;

        Random r = new Random();
        int wert = r.nextInt(5) - 2;
        int wert_ = r.nextInt(5) - 2;
        int torschuss = schuetze.getTorschuss() + wert;
        int reaktion = torwart.getReaktion() + wert_;
        if (torschuss <= 0) {
            torschuss = 1;
        }
        if (torschuss > reaktion) {
            tor = true;
        }
        else {
            tor = false;
        }
        return tor;

    }
    public static void spielen(Spiel spiel) {
        Random r = new Random();
        int zahl = r.nextInt(maxNachspielzeit);
        int zeit = zahl + spielzeit;

        Mannschaft heim = spiel.getHeim();
        int mannschaftswertHeim = ermittleMannschaftsWert(heim);
        Mannschaft gast = spiel.getGast();
        int mannschaftswertGast = ermittleMannschaftsWert(gast);

        int summe = mannschaftswertHeim + mannschaftswertGast;
        int zufall = r.nextInt(summe);
        if (zufall > ) {

        }

    }
}
