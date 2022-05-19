import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        ArrayList<Vertragspartner> vertragspartnerListe = vertragspartnerDAO.read();
        System.out.println(vertragspartnerListe);

        WareDAO wareDAO = new WareDAO();
        ArrayList<Ware> warenListe = wareDAO.read();
        System.out.println(warenListe);

    }
}
