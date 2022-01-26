package schritt1;

import java.util.ArrayList;

public class Mannschaft {

    //Attribute
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int motivation;
    private int motivationsdurchschnitt;
    private int staerke;
    private int staerkedurchschnitt;

    //Konstruktor
    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList spielerListe) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerListe = spielerListe;
    }

    //getter name
    public String getName() {
        return name;
    }

    //setter name
    public void setName(String name) {
        this.name = name;
    }

    //getter trainer
    public String getTrainer() {
        return name;
    }

    //setter trainer
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    //getter torwart
    public Torwart getTorwart() {
        return torwart;
    }

    //setter torwart
    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    //getter spielerListe
    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    //setter spielerListe
    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public int getMotivation() {
        for (Spieler i : spielerListe
        ) {
            motivation += i.getMotivation();

        }
        motivation += torwart.getMotivation();
        motivationsdurchschnitt = motivation / (spielerListe.size() + 1);
        return motivationsdurchschnitt;
    }

    public int getStaerke() {
        for (Spieler i : spielerListe
        ) {
            staerke += i.getStaerke();

        }
        staerke += torwart.getStaerke();
        staerkedurchschnitt = staerke / (spielerListe.size() + 1);
        return staerkedurchschnitt;
    }

    @Override

    public String toString() {
        String text = "\n\tName: " + name;
        text += "\n\tTrainer:\n " + trainer;
        text += "\n\n\tTorwart: " + torwart;
        text += "\n\tSpieler: " + getSpielerListe();
        text += "\n\tMotivation: " + motivationsdurchschnitt;
        text += "\n\tStärke: " + staerkedurchschnitt;
        return text;
    }


}
