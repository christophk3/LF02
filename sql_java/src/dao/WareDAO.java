package dao;

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
            preparedStatement.setInt(1, 31);
            preparedStatement.executeUpdate();

        }

        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }
}

