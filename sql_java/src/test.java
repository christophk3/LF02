import businessObjects.Vertragspartner;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();

        Vertragspartner vertragspartner = vertragspartnerDAO.read("0123456789");
        System.out.println(vertragspartner.getVorname());

    }
}
