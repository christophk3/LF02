import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.IOException;

public class ProgrammWritePDF {
    public static void main(String[] args) throws IOException {
        Vertragspartner kaeufer = new Vertragspartner("Yannick", "Schroeder");
        kaeufer.setAdresse(new Adresse("Marxstrasse zum Vogel", "31", "28279", "Bremen"));
        kaeufer.setAusweisNr("1234567");

        Vertragspartner verkaeufer = new Vertragspartner("Christoph", "Kroeger");
        verkaeufer.setAdresse(new Adresse("Ledaweg zum Stier", "64", "28359", "Bremen"));
        verkaeufer.setAusweisNr("7654321");

        Ware ware = new Ware("Laptop", 250);
        ware.getBesonderheiten().add("Tasche, Gaming-Maus");
        ware.setBeschreibung("Super krasser Gaming Lap-top");
        ware.getMaengel().add("Ladekabel fehlt, Touchpad defekt");

        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        kaufvertrag.setZahlungsModalitaeten("Privater Barverkauf");

        String datei = "H://LF02_//PDF/Kaufvertrag.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);

        Paragraph p1 = new Paragraph("Kaufvertrag");
        p1.setFontColor(ColorConstants.BLUE);
        p1.setUnderline();
        p1.setTextAlignment(TextAlignment.CENTER);
        p1.setFontSize(20);
        p1.setBackgroundColor(ColorConstants.GRAY);


        ListItem listItem = new ListItem();
        Paragraph p2 = new Paragraph("\n\n\nVerkäufer: \n").setUnderline();
        listItem.add(p2);
        listItem.setFontColor(ColorConstants.GREEN);
        listItem.setFontSize(14);
        List sublist1 = new List().setListSymbol("-");
        sublist1.setFontColor(ColorConstants.BLACK);
        sublist1.setFontSize(12);
        sublist1.add("Name: " + kaeufer.getVorname() + ", " + kaeufer.getNachname() + "\n");
        sublist1.add("Ausweisnummer: " + kaeufer.getAusweisNr() + "\n");
        sublist1.add("Adresse: " + kaeufer.getAdresse().getStrasse() + " " +
                kaeufer.getAdresse().getHausNr() + ", " +
                kaeufer.getAdresse().getPlz() + " " +
                kaeufer.getAdresse().getOrt());
        listItem.add(sublist1);


        ListItem listItem1 = new ListItem();
        Paragraph p3 = new Paragraph("Käufer: \n").setUnderline();
        listItem1.add(p3);
        listItem1.setFontColor(ColorConstants.RED);
        listItem1.setFontSize(14);
        List sublist2 = new List().setListSymbol("-");
        sublist2.setFontColor(ColorConstants.BLACK);
        sublist2.setFontSize(12);
        sublist2.add("Name: " + verkaeufer.getVorname() + ", " + verkaeufer.getNachname() + "\n");
        sublist2.add("Ausweisnummer: " + verkaeufer.getAusweisNr() + "\n");
        sublist2.add("Adresse: " + verkaeufer.getAdresse().getStrasse() + " " +
                verkaeufer.getAdresse().getHausNr() + ", " +
                verkaeufer.getAdresse().getPlz() + " " +
                verkaeufer.getAdresse().getOrt());
        listItem1.add(sublist2);


        ListItem listItem2 = new ListItem();
        Paragraph p4 = new Paragraph("Verkaufte Ware: \n").setUnderline();
        listItem2.add(p4);
        listItem2.setFontColor(ColorConstants.BLUE);
        listItem2.setFontSize(14);
        Table table = new Table(2);
        table.setTextAlignment(TextAlignment.LEFT);
        table.addCell("Text");
        table.addCell("Wert");
        table.addCell("Bezeichnung");
        table.addCell(ware.getBezeichnung());
        table.addCell("Beschreibung");
        table.addCell(ware.getBeschreibung());
        table.addCell("Preis");
        table.addCell("" + ware.getPreis());
        table.addCell("Besonderheiten");
        table.addCell("" + ware.getBesonderheiten());
        table.addCell("Mängel");
        table.addCell("" + ware.getMaengel());
        table.setFontColor(ColorConstants.BLACK);
        table.setFontSize(12);
        listItem2.add(table);

        Paragraph p5 = new Paragraph("Zahlungsmodalitäten: \n").setUnderline();
        p5.setFontSize(14);
        Paragraph p6 = new Paragraph(kaufvertrag.getZahlunsModalitaeten());
        p6.setFontSize(12);

        document.add(p1);
        document.add(listItem);
        document.add(listItem1);
        document.add(listItem2);
        document.add(p5);
        document.add(p6);
        document.close();


    }

}
