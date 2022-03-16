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
            String[]parts = str.split(";");
            System.out.println(Arrays.toString(parts));

        }




    }
}
