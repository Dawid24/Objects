package zadania.Exercise_1_Objects;

public class Osoba {
    private String name;
    private String surname;
    private String pesel;

    public Osoba(String name, String surname,
                 String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }
}
