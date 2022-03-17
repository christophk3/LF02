import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ProgrammReadCSV {
    public static void main(String[] args) throws IOException {
        String datei = "H://LF02_//CSV/Kaufvertrag.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));
        String zeile;
        while ((zeile = br.readLine()) != null) {
            String str = zeile;
            String[]array = str.split(";");
            System.out.println(Arrays.toString(array));

            String[]name = array[1].split(" ");
            String[]adresse = array[2].split(" ");

            if (array[0] == "Verkaeufer") {
                Vertragspartner verkaeufer = new Vertragspartner(name[0],name[1]);
                verkaeufer.setAdresse(new Adresse(adresse[0],adresse[1],array[3],array[4]));



            }





        }


    }
}
