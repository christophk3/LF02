import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        WareDAO wareDAO = new WareDAO();
        Ware ware = new Ware("Joghurt", 0.99);
        ware.setBeschreibung("Heidebeerjoghurt");
        ArrayList<String> besonderheiten = new ArrayList<>();
        besonderheiten.add("Heidebeeren aus der Region");
        ArrayList<String> maengel = new ArrayList<>();
        maengel.add("abgelaufen");
        wareDAO.insertWare(ware);

    }
}
