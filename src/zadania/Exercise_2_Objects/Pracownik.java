package zadania.Exercise_2_Objects;

public class Pracownik {
    private String name;
    private String surname;
    private double salary;
    private int age;

    public Pracownik(String name, String surname, double salary, int age) {
        this.name = setName(name);
        this.surname = setSurname(surname);
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public int getAge() {
        return age;
    }

    public String setName(String name) {
        if (name.matches("[A-Z]{1}[a-z]{4}[a-z]*")) {
            return name;
        } else {
             System.out.println("The name must be at least one capital letter and at least four letters");
             return null;
        }
    }

    public String setSurname(String surname) {
        if (surname.matches("[A-Z]{1}[a-z]{4}[a-z]*")) {
            return surname;
        } else {
            System.out.println("The surname must be at least one capital letter and at least four letters");
            return null;
        }
    }
}
