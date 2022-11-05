package shopping;

import java.util.ArrayList;

public class ShoppingList {
    ArrayList<String> items = new ArrayList<>();

    public void add(String item) {
        this.items.add(item);
    }
    public void delete (int index) {
        this.items.remove(index);

    }

    public void display() {
        for (String s : items) {
            System.out.println(s);
        }
    }
}
