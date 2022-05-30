import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        vertragspartnerDAO.updateVertragspartner("3456","Christoph", "Kröger", "Ledaweg", "64",  );

    }
}
