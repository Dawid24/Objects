package zadania.Exercise_6_Objects;

public class Category {
    public static final int PRODUCTS = 3;
    public static Integer lastAddedPosition = null;

    private int id;
    private Product[] list;


    public Category() {
        id = 0;
        list = new Product[PRODUCTS];
    }

    public Category(int id) {
        this.id = id;
        this.list = new Product[PRODUCTS];
    }

    public int getId() {
        return id;
    }

    public Product[] getList() {
        System.out.println(list[0]);

        return list;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[id]: ");
        sb.append(getId());
        sb.append(", [list]: ");
        sb.append(getList());
        return sb.toString();
    }

    public void add(Product product, int index) {
        list[index] = product;
    }
}
