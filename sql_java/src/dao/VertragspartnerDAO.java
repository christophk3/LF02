package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import org.sqlite.SQLiteException;

import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSRING = "jdbc:sqlite:sql_java/src/data/Kaufvertrag.db";

    public VertragspartnerDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     *
     * @param ausweisNr Die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */

    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);


            // SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner where ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            // Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            vertragspartner = createObjekt(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return vertragspartner;


    }

    public ArrayList<Vertragspartner> read() {
        ArrayList<Vertragspartner> alleVertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);


            // SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen & Arrayliste erstellen
            ResultSet resultSet = preparedStatement.executeQuery();
            alleVertragspartner = new ArrayList<>();

            Vertragspartner vertragspartner = null;
            // ResultSet auswerten
            while (resultSet.next()) {
                vertragspartner = createObjekt(resultSet);
                alleVertragspartner.add(vertragspartner);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return alleVertragspartner;
    }

    private Vertragspartner createObjekt(ResultSet resultSet) {
        Vertragspartner vertragspartner = null;
        try {


            String nr = resultSet.getString("ausweisNr");
            String vorname = resultSet.getString("vorname");
            String nachname = resultSet.getString("nachname");
            String strasse = resultSet.getString("strasse");
            String hausNr = resultSet.getString("hausNr");
            String plz = resultSet.getString("plz");
            String ort = resultSet.getString("ort");

            // Vertragspartner erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(nr);
            Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
            vertragspartner.setAdresse(adresse);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return vertragspartner;
    }

    public void deleteVertragspartner(String ausweisNr) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);
            String sql = "DELETE FROM vertragspartner WHERE ausweisNr =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "69");
            preparedStatement.executeUpdate();

        }

        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

    public void insertVertragspartner(Vertragspartner vertragspartner) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);
            String sql = "INSERT INTO vertragspartner(aus" + vertragspartner.getAusweisNr() +
                    ", vorname" + vertragspartner.getVorname() +
                    ", nachname" + vertragspartner.getNachname() +
                    ", adresse" + vertragspartner.getAdresse();

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "69");
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
