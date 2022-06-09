import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    /**
     * Liest einen Text von der Konsole ein
     *
     * @return eingelesener Text
     * @throws IOException
     */
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static int readInteger() throws IOException {
        while (true) {
            try {
                String eingabe = readString();
                int eingabe2 = Integer.parseInt(eingabe);
                return eingabe2;
            } catch (NumberFormatException e) {
                System.out.println("Keine Ganzzahl! Bitte erneut versuchen.");

            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                String eingabe = readString();
                double eingabe2 = Double.parseDouble(eingabe.trim().replace(',', '.'));
                return eingabe2;
            } catch (NumberFormatException e) {
                System.out.println("Keine Kommazahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = IO.readString();
            if (eingabe != null) {
                if (eingabe.equalsIgnoreCase("Ja")
                        || eingabe.equalsIgnoreCase("J")
                        || eingabe.equalsIgnoreCase("Yes")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static int[] readIntegerArray1D() throws IOException {
        System.out.println("Wie viele Werte? ");
        int zeilen = IO.readInteger();
        int[] array = readIntegerArray1D(zeilen);
        return array;

    }

    public static int[] readIntegerArray1D(int anzahlWerte) throws IOException {
        int[] array = new int[anzahlWerte];
        array = readIntegerArray1D(array);
        return array;
    }

    public static int[] readIntegerArray1D(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Wert eingeben für [" + i + "]: ");
            array[i] = readInteger();
        }
        return array;

    }

    public static double[] readDoubleArray1D() throws IOException {
        System.out.println("Wie viele Werte? ");
        int zeilen = IO.readInteger();
        double[] array = readDoubleArray1D(zeilen);
        return array;

    }

    public static double[] readDoubleArray1D(int anzahlWerte) throws IOException {
        double[] array = new double[anzahlWerte];
        array = readDoubleArray1D(array);
        return array;
    }

    public static double[] readDoubleArray1D(double[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Wert eingeben für [" + i + "]: ");
            array[i] = readDouble();
        }
        return array;

    }

    public static String[] readStringArray1D() throws IOException {
        System.out.println("Wie viele Werte? ");
        int zeilen = IO.readInteger();
        String[] array = readStringArray1D(zeilen);
        return array;

    }

    public static String[] readStringArray1D(int anzahlWerte) throws IOException {
        String[] array = new String[anzahlWerte];
        array = readStringArray1D(array);
        return array;
    }

    public static String[] readStringArray1D(String[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Wert eingeben für [" + i + "]: ");
            array[i] = readString();
        }
        return array;

    }

    public static String[][] readStringArray2D() throws IOException {
        System.out.println("Wie viele Zeilen?");
        int zeilen = readInteger();
        System.out.println("Wie viele Spalten?");
        int spalten = readInteger();
        String[][] array = readStringArray2D(zeilen, spalten);
        return array;
    }

    public static String[][] readStringArray2D(int anzahlZeilen, int anzalSpalten) throws IOException {
        String[][] array = new String[anzahlZeilen][anzalSpalten];
        return array;
    }

    public static String[][] readStringArray2D(String[][] array) throws IOException {
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Gib den wert ein der an der stelle [" + i + "][" + j + "] stehen soll");
                array[i][j] = IO.readString();
            }
        }
        return array;
    }

    public static String[][] systemOutPrintArray2D(String[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static int[][] readIntegerArray2D() throws IOException {
        System.out.println("Wie viel zeilen?");
        int zeilen = readInteger();
        System.out.println("Wie viele Spalten?");
        int spalten = readInteger();
        int[][] array = readIntegerArray2D(zeilen, spalten);
        return array;
    }

    public static int[][] readIntegerArray2D(int anzahlZeilen, int anzahlSpalten) throws IOException {
        int[][] array = new int[anzahlZeilen][anzahlSpalten];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = IO.readInteger();

            }
        }
        return array;
    }

    public static int[][] readIntegerArray2D(int[][] array) throws IOException {
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Gieb den wer ein der an [" + i + "] [" + j + "] stehen soll");
                array[i][j] = IO.readInteger();
            }
        }
        return array;

    }

    public static int[][] systemOutPrintArrayint2D(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        return array;
    }
}


