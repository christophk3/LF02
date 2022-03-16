import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Programmtxt {
    public static void main(String[] args) throws FileNotFoundException {
        Ware ware = new Ware("dicker Karren", 12.500);
        ware.setBeschreibung("schluckt 20 Liter");
        ware.getBesonderheiten().add("Carbon Pommestheke");
        ware.getBesonderheiten().add("tiefergelegt");
        ware.getMaengel().add("schluckt mehr als 30 Liter");
        ware.getMaengel().add("kein Motor vorhanden");

        Vertragspartner kaeufer = new Vertragspartner("Markus", "Söder");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Franz-Josef-Strauß-Ring", "1", "80539", "München"));

        Vertragspartner verkaeufer = new Vertragspartner("Ursula Getrud", "von der Leyen");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Rue de la Loi", "200", "1049", "Brüssel"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");
        System.out.println(vertrag);
        String datei = "H://LF02_//Text/Kaufvertrag.txt";
        PrintWriter writer = new PrintWriter(datei);
        writer.println(vertrag);
        writer.close();

    }
}
