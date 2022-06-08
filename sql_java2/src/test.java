import businessObjects.Tabelle;
import dao.VereinDAO;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        VereinDAO vereinDAO = new VereinDAO();
        Tabelle tabelle = new Tabelle(2, "Werder Bremen");
        tabelle.setSpiele(34);
        tabelle.setTordifferenz(32);
        tabelle.setPunkte(30);
        vereinDAO.update(tabelle, 2);


    }
}
