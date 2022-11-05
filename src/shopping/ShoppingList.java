package shopping;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> items = new ArrayList<>();

    public void add(Product item) {
        this.items.add(item);
    }
    public void delete (int index) {
        this.items.remove(index);

    }

    public void display() {
        for (Product s : items) {
            System.out.println(s);
        }
    }
}
