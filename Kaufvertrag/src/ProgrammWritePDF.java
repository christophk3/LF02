import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.Underline;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ProgrammWritePDF {
    public static void main(String[] args) throws IOException {
        Vertragspartner kaeufer = new Vertragspartner("Yannick","Schroeder");
        kaeufer.setAdresse(new Adresse("Marxstrasse zum Vogel", "31","28279", "Bremen"));
        kaeufer.setAusweisNr("1234567");
        Vertragspartner verkaeufer = new Vertragspartner("Christoph","Kroeger");
        verkaeufer.setAdresse(new Adresse("Ledaweg zum Stier", "64","28359", "Bremen"));
        verkaeufer.setAusweisNr("7654321");
        Ware ware = new Ware("Super gaming Laptop",250);
        ware.getBesonderheiten().add("Tasche, Gaming-Maus");
        ware.getMaengel().add("Ladekabel fehlt, Touchpad defekt");
        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer,kaeufer,ware);
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
        Paragraph p2 = new Paragraph("Verkäufer: ").setUnderline();
        listItem.add(p2);
        listItem.setFontColor(ColorConstants.GREEN);
        listItem.setFontSize(14);
        List sublist1 = new List().setListSymbol("-");
        sublist1.setFontColor(ColorConstants.BLACK);
        sublist1.setFontSize(12);
        sublist1.add("Name: "+kaeufer.getVorname()+", "+kaeufer.getNachname()+"\n");
        sublist1.add("Ausweisnummer: "+kaeufer.getAusweisNr()+"\n");
        sublist1.add("Adresse: "+kaeufer.getAdresse().getStrasse()+" "+
                kaeufer.getAdresse().getHausNr()+", "+
                kaeufer.getAdresse().getPlz()+" "+
                kaeufer.getAdresse().getOrt());
        listItem.add(sublist1);
        ListItem listItem1 = new ListItem();
        Paragraph p3 = new Paragraph("Käufer: ").setUnderline();
        listItem1.add(p3);
        listItem1.setFontColor(ColorConstants.RED);
        listItem1.setFontSize(14);
        List sublist2 = new List().setListSymbol("-");
        sublist2.setFontColor(ColorConstants.BLACK);
        sublist2.setFontSize(12);
        sublist2.add("Name: "+verkaeufer.getVorname()+", "+verkaeufer.getNachname()+"\n");
        sublist2.add("Ausweisnummer: "+verkaeufer.getAusweisNr()+"\n");
        sublist2.add("Adresse: "+verkaeufer.getAdresse().getStrasse()+" "+
                verkaeufer.getAdresse().getHausNr()+", "+
                verkaeufer.getAdresse().getPlz()+" "+
                verkaeufer.getAdresse().getOrt());
        listItem1.add(sublist2);
        document.add(p1);
        document.add(listItem);
        document.add(listItem1);
        document.close();


        //Style styleNormal = new Style();
        //styleNormal.setFont(PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN));
        //styleNormal.setFontSize(12);
        //Style styleSpecial = new Style();
        //PdfFont fontSpecial = PdfFontFactory.createFont(StandardFonts.COURIER);
        //DeviceRgb colorSpecial = new DeviceRgb(0,0,255);
        //styleSpecial.setFont(fontSpecial).setFontSize(20).setFontColor(colorSpecial);
        //Style styleSpecial1 = new Style();
        //styleSpecial1.setFont(PdfFontFactory.createFont(StandardFonts.COURIER));
        //DeviceRgb colorSpecial1 = new DeviceRgb(255,0,0);
        //styleSpecial1.setFont(fontSpecial).setFontSize(14).setFontColor(colorSpecial1);
        //Paragraph p1 = new Paragraph();
        //p1.add("Kaufvertrag \n\n").addStyle(styleSpecial).setTextAlignment(TextAlignment.CENTER).setUnderline();
        //Paragraph p2 = new Paragraph();
        //p2.add("Käufer: \n").addStyle(styleSpecial1);
        //p2.add("Name: "+kaeufer.getVorname()+" "+kaeufer.getNachname()+"\n");
        //p2.add("Ausweisnummer: "+kaeufer.getAusweisNr()+"\n");
        //p2.add("Adresse: ");
        //p2.add(kaeufer.getAdresse().getStrasse()+"; ");
        //p2.add(kaeufer.getAdresse().getHausNr());
        //document.add(p1);
        //document.add(p2);
    }

}
