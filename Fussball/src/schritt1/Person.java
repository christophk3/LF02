package schritt1;

public abstract class Person {

    //Attribute erzeugen
    private String name;
    private int alter;

    //Konstruktor
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    //getter Name
    public String getName() {
        return name;
    }

    //setter Name
    public void setName(String name) {
        this.name = name;
    }

    //getter Alter
    public int getAlter() {
        return alter;
    }

    //setter Alter
    public void setAlter(int alter) {
        this.alter = alter;
    }
}
