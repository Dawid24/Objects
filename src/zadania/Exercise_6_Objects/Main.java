package zadania.Exercise_6_Objects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Category[] categoriesList = new Category[CategoryUtils.size];
        Product[] productsList = new Product[ProductUtils.size];

        System.out.println("Wpisz ^D, aby zakończyć wpisywanie: ");
        System.out.println("1 - Add a category, 2 - Add a product, " +
                "3 - Assign a product to a category" +
                "4 - View all products, 5 - Display all categories");

        while (input.hasNext()) {
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Id: ");
                    int id = input.nextInt();
                    Category category = new Category(id);
                    addCategory(category, categoriesList);
                    break;
                case 2:
                    System.out.printf("%n%s%n", "[id]: ");
                    int id_2 = input.nextInt();
                    input.nextLine();
                    System.out.printf("%n%s", "[Name]: ");
                    String name = input.nextLine();
                    Product product = new Product(id_2, name);
                    addProduct(product, productsList);
                    break;
                case 3:
                    if (CategoryUtils.lastAddedPosition == null || ProductUtils.lastAddedPosition == null) {
                        System.out.println("Nie ma utworzonej kategorii lub produktu!");
                        break;
                    } else {
                        for (int c1 = 0; c1 <= CategoryUtils.lastAddedPosition; c1++) {
                            for (int p = 0; p <= ProductUtils.lastAddedPosition; p++) {
                                if (productsList[p].getId() == categoriesList[c1].getId()) {
                                    addProductToCategory(productsList[p], categoriesList[c1]);
                                    System.out.println("Przypisuję...");
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i <= ProductUtils.lastAddedPosition; i++) {
                        System.out.println(productsList[i]);
                    }
                    break;
                case 5:
                    for (int i = 0; i <= CategoryUtils.lastAddedPosition; i++) {
                        System.out.println(categoriesList[i]);
                    }
                    break;
                    default:
                        System.out.println("Nie wybrano właściwej opcji!");


            }
        }

    }

    public static void addCategory(Category c, Category[] categoriesList) {
        if (CategoryUtils.lastAddedPosition == null) {
            CategoryUtils.lastAddedPosition = 0;
        } else {
            CategoryUtils.lastAddedPosition = CategoryUtils.lastAddedPosition + 1;
        }
        categoriesList[CategoryUtils.lastAddedPosition] = c;
    }

    public static void addProduct(Product p, Product[] productsList) {
        if (ProductUtils.lastAddedPosition == null) {
            ProductUtils.lastAddedPosition = 0;
        } else {
            ProductUtils.lastAddedPosition = ProductUtils.lastAddedPosition + 1;
        }
        productsList[ProductUtils.lastAddedPosition] = p;
    }

    public static void addProductToCategory(Product p, Category c) {
        if (Category.lastAddedPosition == null) {
            Category.lastAddedPosition = 0;
        } else {
            Category.lastAddedPosition = Category.lastAddedPosition + 1;
        }
        c.add(p, Category.lastAddedPosition);
    }
}
