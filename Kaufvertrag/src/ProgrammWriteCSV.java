import java.io.*;

public class ProgrammWriteCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = new Vertragspartner("Yannick","Schröder");
        kaeufer.setAdresse(new Adresse("Marxstrasse", "31","28279", "Bremen"));
        Vertragspartner verkaeufer = new Vertragspartner("Christoph","Kröger");
        verkaeufer.setAdresse(new Adresse("Ledaweg", "64","28359", "Bremen"));

        String datei = "H://LF02_//CSV/Kaufvertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println("Vetragspartner;Name;Strasse;PLZ;Ort");
        writer.println("Käufer;"+kaeufer.getNachname()+"; "+kaeufer.getVorname()+";"+kaeufer.getAdresse().getStrasse()+";"+kaeufer.getAdresse().getPlz()+";"+kaeufer.getAdresse().getOrt());
        writer.println("Verkäufer;"+verkaeufer.getNachname()+"; "+verkaeufer.getVorname()+";"+verkaeufer.getAdresse().getStrasse()+";"+verkaeufer.getAdresse().getPlz()+";"+verkaeufer.getAdresse().getOrt());
        writer.close();

    }
}
