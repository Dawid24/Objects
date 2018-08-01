package zadania.Exercise_6_Objects;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{" + "id=" + getId() + ", name='" + getName() + '\'' + '}');
        return sb.toString();
    }
}
