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
        Vertragspartner vertragspartner = new Vertragspartner("Christoph","Kröger");
        vertragspartner.setAusweisNr("1234");
        vertragspartner.setAdresse(new Adresse("Ledaweg","64","28359","Bremen"));
        System.out.println(vertragspartnerDAO.read());




    }
}
