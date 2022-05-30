package dao;

import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSRING = "jdbc:sqlite:sql_java/src/data/Kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Liest eine Ware auf Basis seiner Warennummer
     *
     * @param warenNr Die Warennummer
     * @return Die gewünschte Ware
     */

    public Ware read(int warenNr) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);

            // SQL-Abfrage erstellen
            String sql = "SELECT * FROM ware where warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            // Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            // Methode aufrufen
            ware = createObject(resultSet);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return ware;


    }

    public ArrayList<Ware> read() {
        ArrayList<Ware> alleWaren = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);


            // SQL-Abfrage erstellen
            String sql = "SELECT * FROM ware";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            alleWaren = new ArrayList<>();
            Ware ware = null;

            while (resultSet.next()) {
                ware = createObject(resultSet);
                alleWaren.add(ware);
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

        return alleWaren;


    }

    private Ware createObject(ResultSet resultSet) {
        Ware ware = null;
        try {
            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");

            // Ware erstellen
            ware = new Ware(bezeichnung, preis);
            ware.setBeschreibung(beschreibung);

            if (besonderheiten != null) {
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b : besonderheitenArray) {
                    ware.getBesonderheitenListe().add(b.trim());
                }
            }

            if (maengel != null) {
                String[] maengelArray = maengel.split(";");
                for (String m : maengelArray) {
                    ware.getMaengelListe().add(m.trim());
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ware;
    }

    public void deleteWare(int warenNr) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);
            String sql = "DELETE FROM ware WHERE warenNr =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

    public Ware insertWare(Ware ware) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        String besonderheitenliste = " ";
        for (String b : ware.getBesonderheitenListe()
        ) {
            besonderheitenliste += b + "; ";

        }
        String maengelliste = " ";
        for (String m : ware.getMaengelListe()
        ) {
            maengelliste += m + "; ";

        }


        try {
            connection = DriverManager.getConnection(CONNECTIONSRING);

            String sql = "INSERT INTO ware (bezeichnung, beschreibung, preis, besonderheiten, maengel) VALUES(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getBezeichnung());
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            preparedStatement.setString(4, besonderheitenliste);
            preparedStatement.setString(5, maengelliste);
            preparedStatement.executeUpdate();
            //Nummer der neu hinzugefügten Ware ermitteln. Eine Variante, die nicht bei allen Datenbanken funktioniert.
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            //Datenzeiger auf ersten Eintrag in ResultSet mit der erzeugten ID positionieren:
            resultSet.next();
            //WarenNr setzen:
            ware.setWarenNr(resultSet.getInt("last_insert_rowid()")); // Columnlabel hängt von DB ab.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ware;

    }
}

