package dao;

import businessObjects.Tabelle;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.sql.*;
import java.util.ArrayList;

public class VereinDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:sql_java2/src/data/Bundesliga.db";

    public VereinDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    public ArrayList<Tabelle>read() {
        ArrayList<Tabelle>alleVereine = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "select * from Tabelle";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            alleVereine = new ArrayList<>();
            Tabelle tabelle = null;
            while (resultSet.next()) {
                tabelle = createObjekt(resultSet);
                alleVereine.add(tabelle);
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
        return alleVereine;

    }

    private Tabelle createObjekt(ResultSet resultSet) {
        Tabelle tabelle = null;
        try {


            int platz = resultSet.getInt("Tabellenplatz");
            String verein = resultSet.getString("Verein");
            int spiele = resultSet.getInt("Spiele");
            int tordifferenz = resultSet.getInt("Tordifferenz");
            int punkte = resultSet.getInt("Punkte");

            // Verein erstellen
            tabelle = new Tabelle(platz, verein);
            tabelle.setSpiele(spiele);
            tabelle.setTordifferenz(tordifferenz);
            tabelle.setPunkte(punkte);

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return tabelle;
    }

    public void delete(int tabellenplatz) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM Tabelle WHERE Tabellenplatz =?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, tabellenplatz);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void insert(Tabelle tabelle) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Tabelle VALUES(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, tabelle.getTabellenplatz());
            preparedStatement.setString(2,tabelle.getVerein());
            preparedStatement.setInt(3,tabelle.getSpiele());
            preparedStatement.setInt(4,tabelle.getTordifferenz());
            preparedStatement.setInt(5,tabelle.getPunkte());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Tabelle tabelle, int tabellenplatz) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE Tabelle SET Tabellenplatz = ?, Verein = ?, Spiele = ?, Tordifferenz = ?, Punkte = ? WHERE Tabellenplatz = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,tabelle.getTabellenplatz());
            preparedStatement.setString(2,tabelle.getVerein());
            preparedStatement.setInt(3,tabelle.getSpiele());
            preparedStatement.setInt(4,tabelle.getTordifferenz());
            preparedStatement.setInt(5,tabelle.getPunkte());
            preparedStatement.setInt(6,tabellenplatz);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
