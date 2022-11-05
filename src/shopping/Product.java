package shopping;

public class Product {
    String name;
    String description;
    int count;

    public Product(String name, String description, int count) {
        this.name = name;
        this.description = description;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", count=" + count +
                '}';
    }
}
