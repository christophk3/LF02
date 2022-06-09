import businessObjects.Tabelle;
import dao.VereinDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        VereinDAO vereinDAO = new VereinDAO();

        System.out.println("(Was möchtest du tun?) ");
        System.out.print("(r: Zeig alle Vereine an) ");
        System.out.print("(c: Füge einen Verein hinzu) ");
        System.out.print("(d: entferne einen Verein) ");
        System.out.println("(u: ändere etwas an einem bestehenden Verein) ");

        String eingabe = IO.readString();
        if (eingabe.equals("r")) {
            System.out.println(vereinDAO.read());

        }






    }
}
