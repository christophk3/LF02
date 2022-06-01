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
        Ware ware = new Ware("haus", 3000);
        ware.setBeschreibung("gute Lage");
        ware.getBesonderheitenListe().add("fenster; tueren; dachboden");
        ware.getMaengelListe().add("loch in der wand");
        wareDAO.updateWare(36, ware);




    }
}
