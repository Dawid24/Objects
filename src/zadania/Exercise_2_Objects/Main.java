package zadania.Exercise_2_Objects;

public class Main {
    public static void main(String[] args) {
        Pracownik dawid = new Pracownik("Dawid", "Paciorek",
                2850.45, 30);
        System.out.println("The annual salary is: " + dawid.getAnnualSalary());
        //System.out.println(dawid.getName());
        //System.out.println(dawid.getSurname());

    }
}
