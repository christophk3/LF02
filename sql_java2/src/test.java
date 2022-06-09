import businessObjects.Tabelle;
import dao.VereinDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        VereinDAO vereinDAO = new VereinDAO();

        System.out.println("Was möchtest du tun? ");
        System.out.print("(r: Zeig einen Verein an) ");
        System.out.print("(a: Zeig alle Vereine an) ");
        System.out.print("(c: Füge einen Verein hinzu) ");
        System.out.print("(d: entferne einen Verein) ");
        System.out.println("(u: ändere etwas an einem bestehenden Verein) ");

        String eingabe = IO.readString();

        if (eingabe.equals("r")) {
            System.out.println("Welchen Tabellenplatz möchtest du anzeigen lassen?");
            int eingabe2 = IO.readInteger();
            if (vereinDAO.read(eingabe2) == null) {
                System.out.println("Kein Eintrag vorhanden.");

            } else {
                System.out.println(vereinDAO.read(eingabe2));

            }
        } else if (eingabe.equals("a")) {
            System.out.println(vereinDAO.readAll());

        } else if (eingabe.equals("c")) {
            System.out.println("Tabellenplatz: ");
            int platz = IO.readInteger();
            System.out.println("Vereinsname: ");
            String name = IO.readString();
            Tabelle tabelle = new Tabelle(platz, name);
            System.out.println("Spiele: ");
            int spiele = IO.readInteger();
            System.out.println("Tordifferenz: ");
            int tore = IO.readInteger();
            System.out.println("Punkte: ");
            int punkte = IO.readInteger();
            tabelle.setSpiele(spiele);
            tabelle.setTordifferenz(tore);
            tabelle.setPunkte(punkte);
            vereinDAO.create(tabelle);


        } else if (eingabe.equals("d")) {
            System.out.println("Bitte gebe den Platz ein den du löschen möchtest.");
            int platz = IO.readInteger();
            vereinDAO.delete(platz);
        }

        else if (eingabe.equals("u")) {
            System.out.println("Welche Spalte soll geändert werden? ");
            System.out.println("");
            System.out.print("[1] Tabellenplatz ");
            System.out.print("[2] Verein ");
            System.out.print("[3] Spiele ");
            System.out.print("[4] Tordifferenz ");
            System.out.println("[5] Punkte ");

            String spaltenabfrage = IO.readString();

            if (spaltenabfrage.equals("1")) {
                vereinDAO.update();
            }


        }


    }
}
