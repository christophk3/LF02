import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProgrammWritePDF {
    public static void main(String[] args) throws IOException {
        Vertragspartner kaeufer = new Vertragspartner("Yannick","Schroeder");
        kaeufer.setAdresse(new Adresse("Marxstrasse zum Vogel", "31","28279", "Bremen"));
        kaeufer.setAusweisNr("1234567");
        Vertragspartner verkaeufer = new Vertragspartner("Christoph","Kroeger");
        verkaeufer.setAdresse(new Adresse("Ledaweg zum Stier", "64","28359", "Bremen"));
        verkaeufer.setAusweisNr("7654321");

        String datei = "H://LF02_//PDF/Kaufvertrag.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        Paragraph p1 = new Paragraph("Kaufvertrag");
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFontColor(new DeviceRgb(Color.BLUE));
        p1.add("\n\n");
        p1.add("Käufer:\n");
        p1.add(kaeufer.getVorname()+" "+kaeufer.getNachname());
        p1.add("\n");
        p1.add("Adresse: ");
        p1.add(kaeufer.getAdresse().getStrasse()+" "+kaeufer.getAdresse().getHausNr()+", ");
        p1.add(kaeufer.getAdresse().getPlz()+" "+kaeufer.getAdresse().getOrt()+"\n\n");
        p1.add("Verkäufer:\n");
        p1.add(verkaeufer.getVorname()+" "+verkaeufer.getNachname());
        p1.add("\n");
        p1.add("Adresse: ");
        p1.add(verkaeufer.getAdresse().getStrasse()+" "+verkaeufer.getAdresse().getHausNr()+", ");
        p1.add(verkaeufer.getAdresse().getPlz()+" "+verkaeufer.getAdresse().getOrt()+"\n\n");
        document.add(p1);
        document.close();
    }

}
