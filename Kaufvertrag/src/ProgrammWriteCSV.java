import java.io.*;

public class ProgrammWriteCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = new Vertragspartner("Yannick","Schroeder");
        kaeufer.setAdresse(new Adresse("Marxstrasse zum Vogel", "31","28279", "Bremen"));
        kaeufer.setAusweisNr("1234567");
        Vertragspartner verkaeufer = new Vertragspartner("Christoph","Kroeger");
        verkaeufer.setAdresse(new Adresse("Ledaweg zum Stier", "64","28359", "Bremen"));
        verkaeufer.setAusweisNr("7654321");

        String datei = "H://LF02_//CSV/Kaufvertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.print("Vertragspartner;");
        writer.print("Name;");
        writer.print("Ausweisnummer;");
        writer.print("Strasse;");
        writer.print("PLZ ");
        writer.println("Ort");

        writer.print("Verkaeufer;");
        writer.print(verkaeufer.getVorname()+" "+verkaeufer.getNachname()+";");
        writer.print(verkaeufer.getAusweisNr()+";");
        writer.print(verkaeufer.getAdresse().getStrasse()+" "+verkaeufer.getAdresse().getHausNr()+";");
        writer.print(verkaeufer.getAdresse().getPlz()+" ");
        writer.println(verkaeufer.getAdresse().getOrt());

        writer.print("Kaeufer;");
        writer.print(kaeufer.getVorname()+" "+kaeufer.getNachname()+";");
        writer.print(kaeufer.getAusweisNr()+";");
        writer.print(kaeufer.getAdresse().getStrasse()+" "+kaeufer.getAdresse().getHausNr()+";");
        writer.print(kaeufer.getAdresse().getPlz()+" ");
        writer.println(kaeufer.getAdresse().getOrt());

        writer.close();

    }
}
